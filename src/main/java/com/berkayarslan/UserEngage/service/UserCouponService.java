package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.general.BaseEntityService;
import com.berkayarslan.UserEngage.model.UserCoupon;
import com.berkayarslan.UserEngage.repository.UserCouponRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCouponService extends BaseEntityService<UserCoupon, UserCouponRepository> {
    protected UserCouponService(UserCouponRepository repository) {
        super(repository);
    }

    public List<UserCoupon> findByUserId(Long userId) {
        return getRepository().findByUserId(userId);
    }

//    private final UserCouponRepository userCouponRepository;
//    private final UserCouponMapper userCouponMapper;
//
//    @Autowired
//    public UserCouponService(UserCouponRepository userCouponRepository, UserCouponMapper userCouponMapper) {
//        this.userCouponRepository = userCouponRepository;
//        this.userCouponMapper = userCouponMapper;
//    }
//
//    public List<UserCouponDTO> findAllUserCoupons(){
//        return userCouponRepository.findAll().stream()
//                .map(userCouponMapper::userCouponToUserCouponDTO)
//                .collect(Collectors.toList());
//    }
//
//    public Optional<UserCouponDTO> findUserCouponsById(Long id){
//        return userCouponRepository.findById(id)
//                .map(userCouponMapper::userCouponToUserCouponDTO);
//    }
//
//    public List<UserCouponDTO> findUserCouponsByUserId(Long userId){
//        return userCouponRepository.findByUserId(userId).stream()
//                .map(userCouponMapper::userCouponToUserCouponDTO)
//                .collect(Collectors.toList());
//    }
//    public UserCouponDTO saveUserCoupon(UserCouponDTO userCouponDTO){
//        UserCoupon userCoupon = userCouponMapper.userCouponDTOToUSerCoupon(userCouponDTO);
//        UserCoupon savedUserCoupon = userCouponRepository.save(userCoupon);
//        return userCouponMapper.userCouponToUserCouponDTO(savedUserCoupon);
//    }
//
//    public void deleteUserCouponById(Long id){
//        userCouponRepository.deleteById(id);
//    }

}
