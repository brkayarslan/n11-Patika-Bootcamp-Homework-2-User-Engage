package com.berkayarslan.UserEngage.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserReviewDTO {

    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private Long userId; // User entity'si ile ilişkiyi DTO üzerinde userId olarak taşıyoruz
    private Integer productId;
    private Integer orderId;
    private String rate; // Enum türünü String olarak taşıyabiliriz
    private String comment;
}
