package com.berkayarslan.UserEngage.repository;

import com.berkayarslan.UserEngage.model.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserReviewRepository extends JpaRepository<UserReview,Long> {

    // Kullanıcı ID'sine göre yorumları bulan bir sorgu
    List<UserReview> findByUserId(Long userId);

    // Ürün ID'sine göre yorumları bulan bir sorgu
    List<UserReview> findByProductId(Long productId);
}
