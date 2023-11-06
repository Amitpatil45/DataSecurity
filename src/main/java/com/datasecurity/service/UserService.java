package com.datasecurity.service;

import java.util.Set;

import com.datasecurity.entity.User;
import com.datasecurity.entity.userRole;

public interface UserService {
    public User createUser(User user, Set<userRole> userRoles) throws Exception;
    public User getUser(String uname);
    public void deleteUser(Long userId);
}
