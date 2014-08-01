package com.kousenit.vampires

class MovieLinks implements Serializable {
    String self
    String alternate
    String cast
    String clips
    String reviews
    String similar

    static mapWith = "mongo"

    static constraints = {
    }
}
