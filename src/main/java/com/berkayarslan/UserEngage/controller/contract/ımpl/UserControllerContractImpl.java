package com.berkayarslan.UserEngage.controller.contract.ımpl;

import com.berkayarslan.UserEngage.controller.contract.UserControllerContract;
import com.berkayarslan.UserEngage.dto.UserDTO;
import com.berkayarslan.UserEngage.mapper.UserMapper;
import com.berkayarslan.UserEngage.model.User;
import com.berkayarslan.UserEngage.request.UserSaveRequest;
import com.berkayarslan.UserEngage.request.UserUpdateRequest;
import com.berkayarslan.UserEngage.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserControllerContractImpl implements UserControllerContract {

    private final UserService userService;
    @Override
    public UserDTO saveUser(UserSaveRequest request) {
        User user = UserMapper.INSTANCE.userDTOToUser(request);
        user = userService.save(user);
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);
        return userDTO;
    }

    @Override
    public List<UserDTO> findAllUsers() {

        List<User> userList = userService.findAll();
        List<UserDTO> userDTOS = UserMapper.INSTANCE.userListToUserDTOList(userList);
        return userDTOS;
    }

    @Override
    public UserDTO updateUser(UserUpdateRequest request) {
        return null;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
