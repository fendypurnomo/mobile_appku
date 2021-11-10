package com.fendypurnomo.appku.ui.movie

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fendypurnomo.appku.R
import com.fendypurnomo.appku.databinding.FragmentMovieBinding

class MovieFragment: Fragment(R.layout.fragment_movie) {
	private var fragmentMovieBinding: FragmentMovieBinding? = null
	private val movieAdapter = MovieAdapter()

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val binding = FragmentMovieBinding.bind(view)
		fragmentMovieBinding = binding
		binding.rvMovieListItem.layoutManager = LinearLayoutManager(context)
		binding.rvMovieListItem.adapter = movieAdapter
	}

	override fun onDestroyView() {
		fragmentMovieBinding = null
		super.onDestroyView()
	}
}