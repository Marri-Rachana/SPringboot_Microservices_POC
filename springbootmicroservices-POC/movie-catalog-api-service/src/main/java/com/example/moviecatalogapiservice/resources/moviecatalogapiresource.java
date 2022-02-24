package com.example.moviecatalogapiservice.resources;

import com.example.moviecatalogapiservice.models.Catalogs;
import com.example.moviecatalogapiservice.models.Movie;
import com.example.moviecatalogapiservice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/moviecatalog")
public class moviecatalogapiresource {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<Catalogs> getMovieList(@PathVariable("userId") String userId) {
        ResponseEntity<List<Rating>> ratingEntityList = restTemplate.exchange(
                "http://localhost:4202/ratings/" + userId,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Rating>>() {
                }
        );
        List<Rating> ratings = ratingEntityList.getBody();

        return ratings.stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:4201/movies/"+rating.getMovieId(),Movie.class);
            /*Movie movie = webClientBuilder.build()
                          .get()
                          .uri("http://localhost:4201/movies/"+rating.getMovieId())
                           .retrieve()
                           .bodyToMono(Movie.class)
                           .block();*/
            return new Catalogs(movie.getName(),"desc",rating.getRating());
        }).collect(Collectors.toList());
    }
}
