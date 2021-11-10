package com.fendypurnomo.appku.ui.signin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fendypurnomo.appku.databinding.ActivitySigninBinding
import com.fendypurnomo.appku.ui.forgotpassword.ForgotPasswordActivity
import com.fendypurnomo.appku.ui.MainActivity
import com.fendypurnomo.appku.ui.signup.SignupActivity

class SigninActivity: AppCompatActivity() {
	private lateinit var binding: ActivitySigninBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySigninBinding.inflate(layoutInflater)
		setContentView(binding.root)

		val mainActivity = Intent(this, MainActivity::class.java)
		val signupActivity = Intent(this, SignupActivity::class.java)
		val forgotPasswordActivity = Intent(this, ForgotPasswordActivity::class.java)

		binding.btnSignin.setOnClickListener {
			startActivity(mainActivity)
		}

		binding.tvLinkForgotPassword.setOnClickListener {
			startActivity(forgotPasswordActivity)
		}

		binding.tvLinkSignup.setOnClickListener {
			startActivity(signupActivity)
		}
	}
}
