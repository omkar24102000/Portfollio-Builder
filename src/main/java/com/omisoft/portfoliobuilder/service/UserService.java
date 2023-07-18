package com.omisoft.portfoliobuilder.service;

import java.util.List;

import com.omisoft.portfoliobuilder.dto.UserDto;
import com.omisoft.portfoliobuilder.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
