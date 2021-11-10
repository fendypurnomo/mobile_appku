package com.fendypurnomo.appku.ui.library

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.FragmentLibraryBinding

class LibraryFragment : Fragment(R.layout.fragment_library) {
	private var fragmentLibraryBinding: FragmentLibraryBinding? = null

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val binding = FragmentLibraryBinding.bind(view)
		fragmentLibraryBinding = binding
	}

	override fun onDestroyView() {
		fragmentLibraryBinding = null
		super.onDestroyView()
	}
}