package com.berkayarslan.UserEngage.mapper;

import com.berkayarslan.UserEngage.dto.UserReviewDTO;
import com.berkayarslan.UserEngage.model.UserReview;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserReviewMapper {

    UserReviewMapper INSTANCE = Mappers.getMapper(UserReviewMapper.class);

    UserReviewDTO userReviewToUserReviewDTO(UserReview userReview);

    UserReview userReviewDTOToUserReview(UserReviewDTO userReviewDTO);

}
