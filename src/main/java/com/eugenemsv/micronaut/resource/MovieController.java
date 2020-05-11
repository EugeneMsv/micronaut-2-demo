package com.eugenemsv.micronaut.resource;

import com.eugenemsv.micronaut.api.MovieDto;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;

@Controller("/movie")
public class MovieController {

    @Get("/{name}")
    @Status(HttpStatus.OK)
    public String getMovie(@PathVariable("name") String name) {
        return "Hello World";
    }


    @Post
    @Status(HttpStatus.CREATED)
    public MovieDto create(@Body MovieDto movie) {
        System.out.println("movie = " + movie);
        return movie;
    }

}
