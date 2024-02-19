package com.berkayarslan.UserEngage.request;

import com.berkayarslan.UserEngage.model.Gender;

import java.time.LocalDate;

public record UserUpdateRequest (String name,
                                 String surname,
                                 LocalDate birthDate,
                                 String email){
}
