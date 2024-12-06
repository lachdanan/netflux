package com.example.netflux.domain

import org.springframework.data.mongodb.core.mapping.Document

@Document
class Movie {
    var id: String? = null
    var title: String? = null

    constructor()

    constructor(title: String?) {
        this.title = title
    }

    constructor(id: String?, title: String?) {
        this.id = id
        this.title = title
    }
}
