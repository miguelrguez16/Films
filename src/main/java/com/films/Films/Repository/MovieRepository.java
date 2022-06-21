package com.films.Films.Repository;

import com.films.Films.Entity.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movies, ObjectId> {


    List<Movies> findAll();

    @Query("{title: ?0}")
    Movies findFirstByTitle(String title);
}
/*
* @Query("{username:?0}")
    Optional<Users> findUserByUserName(String username);
* */