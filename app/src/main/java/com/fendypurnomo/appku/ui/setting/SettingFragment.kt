package com.fendypurnomo.appku.ui.setting

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.FragmentSettingBinding

class SettingFragment : Fragment(R.layout.fragment_setting) {
	private var fragmentSettingBinding: FragmentSettingBinding? = null

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val binding = FragmentSettingBinding.bind(view)
		fragmentSettingBinding = binding
	}

	override fun onDestroyView() {
		fragmentSettingBinding = null
		super.onDestroyView()
	}
}