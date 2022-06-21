package com.films.Films.Service;


import com.films.Films.Entity.Movies;
import com.films.Films.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {

        this.movieRepository = movieRepository;
    }



    public List<Movies> getMovies() {
        return movieRepository.findAll();
    }

    public Integer getCountMovies() {
        return Math.toIntExact(movieRepository.count());
    }

    public Movies findMovieByTitle(String title) {
        return movieRepository.findFirstByTitle(title);
    }
}
