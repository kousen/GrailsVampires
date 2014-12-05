package com.kousenit.vampires

import grails.rest.Resource
import groovy.transform.ToString
import org.bson.types.ObjectId

@Resource(formats = ['json'])
class Movie implements Serializable {

    ObjectId id

    String title
    String year
    String mpaa_rating
    String runtime
    Dates release_dates
    Ratings ratings
    String synopsis
    Posters posters
    MovieLinks links

    String toString() { title }

    // static mapWith = "mongo"

    static embedded = ['posters', 'links', 'ratings',
                       'release_dates', 'abridged_cast']

    static hasMany = [abridged_cast: CastMember]

    static mapping = {
        database 'movies'
        collection 'vampireMovies'
        version false
    }

    static constraints = {
    }
}
