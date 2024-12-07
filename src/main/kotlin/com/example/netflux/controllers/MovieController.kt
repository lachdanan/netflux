package com.example.netflux.controllers

import com.example.netflux.domain.Movie
import com.example.netflux.services.MovieService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/movies")
class MovieController(val movieService: MovieService) {

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): Mono<Movie> {
        return movieService.getMovieById(id)
    }

    @GetMapping()
    fun getAll(): Flux<Movie> {
        return movieService.getAllMovies()
    }
}