package com.films.Films.Repository;

import com.films.Films.Entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<Users, ObjectId> {


    List<Users> findAll();
}
