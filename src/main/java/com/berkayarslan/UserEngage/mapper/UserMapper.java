package com.berkayarslan.UserEngage.mapper;

import com.berkayarslan.UserEngage.dto.UserDTO;
import com.berkayarslan.UserEngage.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);
}
