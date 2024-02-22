package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.general.BaseEntityService;
import com.berkayarslan.UserEngage.model.UserReview;
import com.berkayarslan.UserEngage.repository.UserReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserReviewService extends BaseEntityService<UserReview,UserReviewRepository> {
    protected UserReviewService(UserReviewRepository repository) {
        super(repository);
    }

    public List<UserReview> findReviewByUserId(Long userId) {
        return getRepository().findByUserId(userId);
    }

    public List<UserReview> findReviewByProductId(Long productId) {
        return getRepository().findByProductId(productId);
    }


//    private final UserReviewRepository userReviewRepository;
//    private final UserReviewMapper userReviewMapper;
//
//    @Autowired
//    public UserReviewService(UserReviewRepository userReviewRepository, UserReviewMapper userReviewMapper) {
//        this.userReviewRepository = userReviewRepository;
//        this.userReviewMapper = userReviewMapper;
//    }
//
//    public List<UserReviewDTO> findAllUserReview(){
//        return userReviewRepository.findAll().stream()
//                .map(userReviewMapper::userReviewToUserReviewDTO)
//                .collect(Collectors.toList());
//    }
//
//    public Optional<UserReviewDTO> findUserReviewById(Long id){
//        return userReviewRepository.findById(id)
//                .map(userReviewMapper::userReviewToUserReviewDTO);
//    }
//
//    public List<UserReviewDTO> findUserReviewByUserId(Long userId){
//        return userReviewRepository.findByUserId(userId).stream()
//                .map(userReviewMapper::userReviewToUserReviewDTO)
//                .collect(Collectors.toList());
//    }
//
//    public UserReviewDTO saveUserReview(UserReviewDTO userReviewDTO){
//        UserReview userReview = userReviewMapper.userReviewDTOToUserReview(userReviewDTO);
//        UserReview savedUserReview = userReviewRepository.save(userReview);
//        return userReviewMapper.userReviewToUserReviewDTO(savedUserReview);
//    }
//
//    public void deleteUserReviewById(Long id){
//        userReviewRepository.deleteById(id);
//    }

}
