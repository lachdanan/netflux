package com.example.netflux.domain

data class Movie(val title: String) {
    companion object {
        var id: String = ""
            get() = field
            set(value) {
                field = value
            }
    }
}
