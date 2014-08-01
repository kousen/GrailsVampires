package com.kousenit.vampires

class Posters implements Serializable {
    String thumbnail
    String profile
    String detailed
    String original

    static mapWith = "mongo"

    static constraints = {
    }
}
