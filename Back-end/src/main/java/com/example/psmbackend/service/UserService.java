package com.example.psmbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.psmbackend.entity.User;

public interface UserService extends IService<User> {

    User getUserWithCredentials(String email, String password);

    User getUserWithToken(String token);
}
