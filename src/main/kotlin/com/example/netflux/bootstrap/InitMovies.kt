package com.example.netflux.bootstrap

import com.example.netflux.domain.Movie
import com.example.netflux.domain.repositories.MovieRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux

@Component
class InitMovies(val movieRepository: MovieRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        movieRepository.deleteAll()
            .thenMany(Flux
                .just("Ninja Scroll", "Macross Plus", "Perfect Blue", "Howling Moving Castle", "Cast Away",
                "Ranma 1/2", "Samurai X", "Macross")
                .map { Movie(it) }
                .flatMap {
                    movieRepository.save(it)
                })
            .subscribe(null, null) { movieRepository.findAll().subscribe { println(it) } }
    }
}