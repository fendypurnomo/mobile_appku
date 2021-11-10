package com.fendypurnomo.appku.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fendypurnomo.appku.databinding.ListItemMovieBinding
import com.fendypurnomo.appku.model.Movie

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
	private lateinit var movieList: List<Movie>

	init { loadMovies() }

	inner class MovieViewHolder(val binding: ListItemMovieBinding): RecyclerView.ViewHolder(binding.root)

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
		val view = ListItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return MovieViewHolder(view)
	}

	override fun onBindViewHolder(holder: MovieViewHolder, i: Int) {
		with(holder) {
			with(movieList[i]) {
				binding.tvMovieName.text = this.name
				binding.tvMovieSubtitle.text = this.description
			}
		}
	}

	override fun getItemCount(): Int {
		return movieList.size
	}

	private fun loadMovies() {
		movieList = listOf(
			Movie(0, "6 Underground", "Film 6 Underground", ""),
			Movie(1, "Thor: Ragnarok", "Film Thor: Ragnarok", ""),
			Movie(2, "End of a Gun", "Film End of a Gun", ""),
			Movie(3, "Bad Boys", "Film Bad Boys", ""),
			Movie(4, "Kill Bill", "Film Kill Bill", "")
		)
		notifyDataSetChanged()
	}
}
