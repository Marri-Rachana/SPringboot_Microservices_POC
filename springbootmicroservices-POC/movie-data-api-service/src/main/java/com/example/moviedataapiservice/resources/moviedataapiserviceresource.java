package com.example.moviedataapiservice.resources;

import com.example.moviedataapiservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class moviedataapiserviceresource {

    @RequestMapping(value = "/{movieId}")
    public List<Rating> getRating(@PathVariable("movieId") String movieId)
    {
       return Arrays.asList(
               new Rating("1234",movieId,"4"),
               new Rating("1234","5678","3"),
               new Rating("1234","9876","2")
       );
    }
}
