package com.ms.rating.RatigService.controller;

import com.ms.rating.RatigService.entities.Rating;
import com.ms.rating.RatigService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    // create rating

    @PostMapping("/create")
    public ResponseEntity<Rating> create(@RequestBody Rating rating){

        Rating rating1 = ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

    }

// get all rating

    @GetMapping("/")
    public ResponseEntity<List<Rating>> getAllRating(){

         List<Rating> allRating = ratingService.getAllRating();
         return ResponseEntity.status(HttpStatus.OK).body(allRating);
    }

    // get user by user id
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){

         List<Rating> ratingByUserId = ratingService.getRatingByUserId(userId);
         return ResponseEntity.status(HttpStatus.OK).body(ratingByUserId);
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){

        List<Rating> ratingByUserId = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(ratingByUserId);
    }

}
