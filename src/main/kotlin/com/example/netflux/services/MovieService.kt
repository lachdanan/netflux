package com.example.netflux.services

import com.example.netflux.domain.Movie
import com.example.netflux.domain.MovieEvent
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface MovieService {
    fun getMovieById(id: String) : Mono<Movie>
    fun getAllMovies() : Flux<Movie>
    fun streamMovieEvents(id: String) : Flux<MovieEvent>
}