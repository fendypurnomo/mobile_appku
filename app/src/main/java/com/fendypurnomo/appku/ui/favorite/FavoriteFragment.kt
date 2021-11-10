package com.fendypurnomo.appku.ui.favorite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment(R.layout.fragment_favorite) {
	private var fragmentFavoriteBinding: FragmentFavoriteBinding? = null

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val binding = FragmentFavoriteBinding.bind(view)
		fragmentFavoriteBinding = binding
	}

	override fun onDestroyView() {
		fragmentFavoriteBinding = null
		super.onDestroyView()
	}
}