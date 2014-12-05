package com.kousenit.vampires

class Response {

    int total
    Links links
    String link_template

    static hasMany = [movies:Movie]

    static embedded = ['movies', 'links']

    static constraints = {
    }
}
