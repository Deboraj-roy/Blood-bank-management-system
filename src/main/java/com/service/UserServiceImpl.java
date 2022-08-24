package com.service;

import com.dao.UserDao;
import com.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Username not found.");
        }

        org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new HashSet<>());
        return user1;
    }
}