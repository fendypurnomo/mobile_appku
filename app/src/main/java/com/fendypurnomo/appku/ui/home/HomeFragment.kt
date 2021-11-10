package com.fendypurnomo.appku.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
	private var fragmentHomeBinding: FragmentHomeBinding? = null

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val binding = FragmentHomeBinding.bind(view)
		fragmentHomeBinding = binding
	}

	override fun onDestroyView() {
		fragmentHomeBinding = null
		super.onDestroyView()
	}
}
