package com.fendypurnomo.appku.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.fendypurnomo.appku.databinding.ActivitySplashScreenBinding
import com.fendypurnomo.appku.ui.MainActivity

@Suppress("DEPRECATION")
class SplashScreenActivity: AppCompatActivity() {
	private lateinit var binding: ActivitySplashScreenBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySplashScreenBinding.inflate(layoutInflater)
		setContentView(binding.root)

		window.setFlags(
			WindowManager.LayoutParams.FLAG_FULLSCREEN,
			WindowManager.LayoutParams.FLAG_FULLSCREEN
		)

		Handler().postDelayed({
			val intent = Intent(this, MainActivity::class.java)
			startActivity(intent)
			finish()
		}, 3000)
	}
}
