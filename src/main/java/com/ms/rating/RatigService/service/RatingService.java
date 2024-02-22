package com.ms.rating.RatigService.service;

import com.ms.rating.RatigService.entities.Rating;

import java.util.List;

public interface RatingService {

    // Create

    Rating createRating(Rating rating);

    // Get All ratings

    List<Rating> getAllRating();

    // Get Rating by User Id

    List<Rating> getRatingByUserId(String userId);

    // Get Rating by hotel Id

    List<Rating> getRatingByHotelId(String hotelId);
}
