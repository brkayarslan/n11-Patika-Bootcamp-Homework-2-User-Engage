package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.model.UserCoupon;
import com.berkayarslan.UserEngage.repository.UserCouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserCouponService {

    private final UserCouponRepository userCouponRepository;

    @Autowired
    public UserCouponService(UserCouponRepository userCouponRepository) {
        this.userCouponRepository = userCouponRepository;
    }

    public List<UserCoupon> findAllUserCoupons(){
        return userCouponRepository.findAll();
    }

    public Optional<UserCoupon> findUserCouponsById(Long id){
        return userCouponRepository.findById(id);
    }

    public List<UserCoupon> findUserCouponsByUserId(Long userId){
        return userCouponRepository.findByUserId(userId);
    }
    public UserCoupon saveUserCoupon(UserCoupon userCoupon){
        return userCouponRepository.save(userCoupon);
    }

    public void deleteUserCouponById(Long id){
        userCouponRepository.deleteById(id);
    }

}
