package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.dto.UserReviewDTO;
import com.berkayarslan.UserEngage.mapper.UserReviewMapper;
import com.berkayarslan.UserEngage.model.User;
import com.berkayarslan.UserEngage.model.UserReview;
import com.berkayarslan.UserEngage.repository.UserReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserReviewService {

    private final UserReviewRepository userReviewRepository;
    private final UserReviewMapper userReviewMapper;

    @Autowired
    public UserReviewService(UserReviewRepository userReviewRepository, UserReviewMapper userReviewMapper) {
        this.userReviewRepository = userReviewRepository;
        this.userReviewMapper = userReviewMapper;
    }

    public List<UserReviewDTO> findAllUserReview(){
        return userReviewRepository.findAll().stream()
                .map(userReviewMapper::userReviewToUserReviewDTO)
                .collect(Collectors.toList());
    }

    public Optional<UserReviewDTO> findUserReviewById(Long id){
        return userReviewRepository.findById(id)
                .map(userReviewMapper::userReviewToUserReviewDTO);
    }

    public List<UserReviewDTO> findUserReviewByUserId(Long userId){
        return userReviewRepository.findByUserId(userId).stream()
                .map(userReviewMapper::userReviewToUserReviewDTO)
                .collect(Collectors.toList());
    }

    public UserReviewDTO saveUserReview(UserReviewDTO userReviewDTO){
        UserReview userReview = userReviewMapper.userReviewDTOToUserReview(userReviewDTO);
        UserReview savedUserReview = userReviewRepository.save(userReview);
        return userReviewMapper.userReviewToUserReviewDTO(savedUserReview);
    }

    public void deleteUserReviewById(Long id){
        userReviewRepository.deleteById(id);
    }

}
