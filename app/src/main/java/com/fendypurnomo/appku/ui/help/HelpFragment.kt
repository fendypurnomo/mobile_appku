package com.fendypurnomo.appku.ui.help

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.FragmentHelpBinding

class HelpFragment : Fragment(R.layout.fragment_help) {
	private var fragmentHelpBinding: FragmentHelpBinding? = null

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val binding = FragmentHelpBinding.bind(view)
		fragmentHelpBinding = binding
	}

	override fun onDestroyView() {
		fragmentHelpBinding = null
		super.onDestroyView()
	}
}