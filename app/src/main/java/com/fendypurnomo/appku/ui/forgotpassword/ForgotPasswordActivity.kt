package com.fendypurnomo.appku.ui.forgotpassword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fendypurnomo.appku.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity: AppCompatActivity() {
	private lateinit var binding: ActivityForgotPasswordBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}
