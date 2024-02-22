package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.general.BaseEntityService;
import com.berkayarslan.UserEngage.model.User;
import com.berkayarslan.UserEngage.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService extends BaseEntityService<User,UserRepository> {
    protected UserService(UserRepository repository) {
        super(repository);
    }




    //------------------------------------------------------------------------------------------------------------------//
//    private final UserRepository userRepository;
//    private final UserMapper userMapper;
//
////    @Autowired
////    public UserService(UserRepository userRepository, UserMapper userMapper) {
////        this.userRepository = userRepository;
////        this.userMapper = userMapper;
////    }
//
//    public List<UserDTO> findAllUsers(){
//        return userRepository.findAll().stream()
//                .map(userMapper::userToUserDTO)
//                .collect(Collectors.toList());
//    }
//
//    public Optional<UserDTO> findUserById(Long id){
//        return userRepository.findById(id).map(userMapper::userToUserDTO);
//    }
//
//    public UserDTO saveUser(UserDTO userDTO){
//        User user = userMapper.userDTOToUser(userDTO);
//        User savedUser = userRepository.save(user);
//        return userMapper.userToUserDTO(savedUser);
//    }
//
//    public void deleteUser(Long id){
//        userRepository.deleteById(id);
//    }


}
