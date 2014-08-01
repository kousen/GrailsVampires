import com.kousenit.vampires.*

Movie.withCriteria {
    ratings {
        gte 'critics_score', 50
    }
    order('ratings.critics_score', 'desc')
    maxResults(10)
}.each { m ->
    println "$m.ratings.critics_score: $m.title"
}