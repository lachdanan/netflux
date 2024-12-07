package com.example.netflux.services

import com.example.netflux.domain.Movie
import com.example.netflux.domain.repositories.MovieRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class MovieServiceImpl(val movieRepository: MovieRepository) : MovieService {

    override fun getMovieById(id: String): Mono<Movie> {
        return movieRepository.findById(id)
    }

    override fun getAllMovies(): Flux<Movie> {
        return movieRepository.findAll()
    }
}