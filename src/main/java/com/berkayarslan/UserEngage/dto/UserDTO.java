package com.berkayarslan.UserEngage.dto;

import com.berkayarslan.UserEngage.model.Gender;
import com.berkayarslan.UserEngage.model.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class UserDTO {

    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private String name;
    private String surname;
    private LocalDateTime createDate;
    private LocalDate birthDate;
    private String email;
    private Gender gender;
    private Status status;


}
