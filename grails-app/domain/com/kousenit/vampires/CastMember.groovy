package com.kousenit.vampires

class CastMember {
    String name
    long id

    static mapWith = "mongo"

    static hasMany = [characters: String]

    static embedded = ['characters']

    static constraints = {
    }
}
