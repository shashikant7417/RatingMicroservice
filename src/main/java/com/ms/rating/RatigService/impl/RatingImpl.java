package com.ms.rating.RatigService.impl;

import com.ms.rating.RatigService.entities.Rating;
import com.ms.rating.RatigService.repository.RatingRepo;
import com.ms.rating.RatigService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;
    @Override
    public Rating createRating(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepo.findRatingByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepo.findRatingByHotelId(hotelId);
    }


}
