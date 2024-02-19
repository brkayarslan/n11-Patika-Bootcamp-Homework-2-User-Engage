package com.berkayarslan.UserEngage.mapper;

import com.berkayarslan.UserEngage.dto.UserDTO;
import com.berkayarslan.UserEngage.model.User;
import com.berkayarslan.UserEngage.request.UserSaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

    User userDTOToUser(UserSaveRequest request);

    List<UserDTO> userListToUserDTOList(List<User> userList);
}
