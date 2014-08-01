package com.kousenit.vampires

enum MPAARating {
    G('G'), PG('PG'), PG_13('PG-13'),
    R('R'), X('X'), NC_17('NC-17'), Unrated('Unrated')

    final String id

    private MPAARating(String rating) {
        this.id = rating
    }

    String toString() { id }
}
