package com.example.netflux.services

import com.example.netflux.domain.Movie
import com.example.netflux.domain.MovieEvent
import com.example.netflux.domain.repositories.MovieRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration
import java.util.Date

@Service
class MovieServiceImpl(val movieRepository: MovieRepository) : MovieService {

    override fun getMovieById(id: String): Mono<Movie> {
        return movieRepository.findById(id)
    }

    override fun getAllMovies(): Flux<Movie> {
        return movieRepository.findAll()
    }

    override fun streamMovieEvents(id: String): Flux<MovieEvent> {
        return Flux.generate<MovieEvent> { movieEventSynchronousSink -> movieEventSynchronousSink.next(MovieEvent(id, Date()))}
            .delayElements(Duration.ofSeconds(1))
    }
}