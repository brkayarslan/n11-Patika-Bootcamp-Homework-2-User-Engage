package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.model.User;
import com.berkayarslan.UserEngage.model.UserReview;
import com.berkayarslan.UserEngage.repository.UserReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserReviewService {

    private final UserReviewRepository userReviewRepository;

    @Autowired
    public UserReviewService(UserReviewRepository userReviewRepository) {
        this.userReviewRepository = userReviewRepository;
    }

    public List<UserReview> findAllUserReview(){
        return userReviewRepository.findAll();
    }

    public Optional<UserReview> findUserReviewById(Long id){
        return userReviewRepository.findById(id);
    }

    public List<UserReview> findUserReviewByUserId(Long userId){
        return userReviewRepository.findByUserId(userId);
    }

    public UserReview saveUserReview(UserReview userReview){
        return userReviewRepository.save(userReview);
    }

    public void deleteUserReviewById(Long id){
        userReviewRepository.deleteById(id);
    }

}
