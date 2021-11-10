package com.fendypurnomo.appku.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.ActivityMainBinding
import com.fendypurnomo.appku.ui.favorite.FavoriteFragment
import com.fendypurnomo.appku.ui.help.HelpFragment
import com.fendypurnomo.appku.ui.home.HomeFragment
import com.fendypurnomo.appku.ui.library.LibraryFragment
import com.fendypurnomo.appku.ui.more.MoreFragment
import com.fendypurnomo.appku.ui.movie.MovieFragment
import com.fendypurnomo.appku.ui.notification.NotificationFragment
import com.fendypurnomo.appku.ui.profile.ProfileFragment
import com.fendypurnomo.appku.ui.search.SearchFragment
import com.fendypurnomo.appku.ui.setting.SettingFragment

class MainActivity: AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		val favoriteFragment = FavoriteFragment()
		val helpFragment = HelpFragment()
		val homeFragment = HomeFragment()
		val libraryFragment = LibraryFragment()
		val moreFragment = MoreFragment()
		val movieFragment = MovieFragment()
		val notificationFragment = NotificationFragment()
		val profileFragment = ProfileFragment()
		val searchFragment = SearchFragment()
		val settingFragment = SettingFragment()

		setFragment(homeFragment)

		binding.topAppBar.setNavigationOnClickListener {
			binding.drawerLayout.open()
		}

		binding.topAppBar.setOnMenuItemClickListener { item ->
			when(item.itemId) {
				R.id.item_search -> setFragment(searchFragment)
				R.id.item_notifications -> setFragment(notificationFragment)
				R.id.item_more -> setFragment(moreFragment)
			}
			true
		}

		binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
			when(item.itemId) {
				R.id.item_home -> setFragment(homeFragment)
				R.id.item_movies -> setFragment(movieFragment)
				R.id.item_library -> setFragment(libraryFragment)
			}
			true
		}

		binding.navigationView.setNavigationItemSelectedListener { item ->
			item.isChecked = true
			binding.drawerLayout.close()
			when(item.itemId) {
				R.id.item_profile -> setFragment(profileFragment)
				R.id.item_favorite -> setFragment(favoriteFragment)
				R.id.item_settings -> setFragment(settingFragment)
				R.id.item_help -> setFragment(helpFragment)
			}
			true
		}
	}

	private fun setFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
		replace(R.id.frameLayout, fragment)
		commit()
	}
}
