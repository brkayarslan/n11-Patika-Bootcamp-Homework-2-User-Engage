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
}
