package com.berkayarslan.UserEngage.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserCouponDTO {

    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private Long userId; // User entity'si ile ilişkiyi DTO üzerinde userId olarak taşıyoruz
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double amount;

}
