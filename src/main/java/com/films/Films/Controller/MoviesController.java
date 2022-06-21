package com.films.Films.Controller;


import com.films.Films.Entity.Movies;
import com.films.Films.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController()
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/movies")
public class MoviesController {

    private final MovieService movieService;

    public MoviesController(@Autowired MovieService movieService){

        this.movieService = movieService;
    }


    @GetMapping("/all") //Method GET
    public List<Movies> getAllUsers() {
        System.out.println("["+ LocalDateTime.now() + "]: Lista de movies ");
        return movieService.getMovies();
    }

    @GetMapping("count")
    public Integer geCountUsers(){
        System.out.println("["+ LocalDateTime.now() + "]: Count of movies ");
        return movieService.getCountMovies();
    }

    @GetMapping()
    @ResponseBody
    public ResponseEntity<Movies> findMovieByTitle(@RequestParam("title") String title){
        System.out.println("["+ LocalDateTime.now() + "]: find movies by title ["+ title+"]");
        return new ResponseEntity<>(movieService.findMovieByTitle(title),
                HttpStatus.OK );


    }

}
