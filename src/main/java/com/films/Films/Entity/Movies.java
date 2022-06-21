package com.films.Films.Entity;


import com.films.Films.Entity.MoviesUtils.Awards;
import com.films.Films.Entity.MoviesUtils.Imdb;
import com.films.Films.Entity.MoviesUtils.Tomatoes;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "movies")

public class Movies {


    @Id
    private ObjectId id;

    @Field("plot")
    private String plot;

    @Field("title")
    private String title;

    @Field("genres")
    private String[] genres;

    @Field("runtime")
    private int runtime;

    @Field("cast")
    private String[] cast;

    @Field("num_mflix_comments")
    private int num_flix_comments;

    @Field("imdb")
    private Imdb imdb;

    @Field("countries")
    private String[] countries;

    @Field("rated")
    private String rated;

    @Field("type")
    private String type;

    @Field("awards")
    private Awards awards;

    @Field("lastupdated")
    private String lastupdated;

    @Field("tomatoes")
    private Tomatoes tomatoes;

    @Field("year")
    private int year;

    public Movies(ObjectId id, String plot, String title, String[] genres, int runtime, String[] cast, int num_flix_comments, Imdb imdb, String[] countries, String rated, String type, Awards awards, String lastupdated, Tomatoes tomatoes, int year) {
        this.id = id;
        this.plot = plot;
        this.title = title;
        this.genres = genres;
        this.runtime = runtime;
        this.cast = cast;
        this.num_flix_comments = num_flix_comments;
        this.imdb = imdb;
        this.countries = countries;
        this.rated = rated;
        this.type = type;
        this.awards = awards;
        this.lastupdated = lastupdated;
        this.tomatoes = tomatoes;
        this.year = year;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public int getNum_flix_comments() {
        return num_flix_comments;
    }

    public void setNum_flix_comments(int num_flix_comments) {
        this.num_flix_comments = num_flix_comments;
    }

    public Imdb getImdb() {
        return imdb;
    }

    public void setImdb(Imdb imdb) {
        this.imdb = imdb;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Awards getAwards() {
        return awards;
    }

    public void setAwards(Awards awards) {
        this.awards = awards;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    public Tomatoes getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(Tomatoes tomatoes) {
        this.tomatoes = tomatoes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


/*
  {"_id":{"$oid":"573a1390f29313caabcd4135"},
  "plot":"Three men hammer on an anvil and pass a bottle of beer around.",
  "genres":["Short"],
  "runtime":{"$numberInt":"1"},
  "cast":["Charles Kayser","John Ott"],
  "num_mflix_comments":{"$numberInt":"0"},
  "title":"Blacksmith Scene",
  "fullplot":"A stationary camera looks at a large anvil with a blacksmith behind it and one on either side
  . The smith in the middle draws a heated metal rod from the fire, places it on the anvil, and all three begin a
  rhythmic hammering. After several blows, the metal goes back in the fire. One smith pulls out a bottle of beer,
  and they each take a swig. Then, out comes the glowing metal and the hammering resumes.",
  "countries":["USA"],
  "released":{"$date":{"$numberLong":"-2418768000000"}},
  "directors":["William K.L. Dickson"],
  "rated":"UNRATED",
  "awards":{"wins":{"$numberInt":"1"},"nominations":{"$numberInt":"0"},"text":"1 win."},
  "lastupdated":"2015-08-26 00:03:50.133000000",
  "year":{"$numberInt":"1893"},
  "imdb":{"rating":{"$numberDouble":"6.2"},
           "votes":{"$numberInt":"1189"},
           "id":{"$numberInt":"5"}},
  "type":"movie",
  "tomatoes":{
           "viewer":{
                "rating":{"$numberDouble":"3.0"},
                "numReviews":{"$numberInt":"184"},
                "meter":{"$numberInt":"32"}
            },
           "lastUpdated":
           {"$date":{"$numberLong":"1435516449000"}}
           }
 }
 */
