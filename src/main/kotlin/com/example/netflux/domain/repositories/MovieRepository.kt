package com.example.netflux.domain.repositories

import com.example.netflux.domain.Movie
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface MovieRepository: ReactiveMongoRepository<Movie, String> {
}