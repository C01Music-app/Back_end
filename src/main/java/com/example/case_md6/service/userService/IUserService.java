package com.example.case_md6.service.userService;

import com.example.case_md6.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(Integer id);
    void save(User user);
    void deleteById(Integer id);
}
