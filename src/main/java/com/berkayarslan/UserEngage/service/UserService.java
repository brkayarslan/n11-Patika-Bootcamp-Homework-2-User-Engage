package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.dto.UserDTO;
import com.berkayarslan.UserEngage.general.BaseEntityService;
import com.berkayarslan.UserEngage.mapper.UserMapper;
import com.berkayarslan.UserEngage.model.User;
import com.berkayarslan.UserEngage.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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
