package com.ms.rating.RatigService.repository;

import com.ms.rating.RatigService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepo extends MongoRepository<Rating,String > {

    // Custom finder method get rating by User id

    List<Rating> findRatingByUserId(String userId);
    List<Rating> findRatingByHotelId(String hotelId);



}
