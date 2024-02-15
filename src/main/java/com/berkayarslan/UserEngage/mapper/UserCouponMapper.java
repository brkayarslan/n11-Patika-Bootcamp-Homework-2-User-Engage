package com.berkayarslan.UserEngage.mapper;

import com.berkayarslan.UserEngage.dto.UserCouponDTO;
import com.berkayarslan.UserEngage.model.UserCoupon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserCouponMapper {

    UserCouponMapper INSTANCE = Mappers.getMapper(UserCouponMapper.class);

    UserCouponDTO userCouponToUserCouponDTO(UserCoupon userCoupon);

    UserCoupon userCouponDTOToUSerCoupon(UserCouponDTO userCouponDTO);
}
