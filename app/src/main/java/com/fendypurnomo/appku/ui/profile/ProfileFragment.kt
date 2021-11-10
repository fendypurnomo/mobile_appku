package com.fendypurnomo.appku.ui.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
	private var fragmentProfileBinding: FragmentProfileBinding? = null

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val binding = FragmentProfileBinding.bind(view)
		fragmentProfileBinding = binding
	}

	override fun onDestroyView() {
		fragmentProfileBinding = null
		super.onDestroyView()
	}
}