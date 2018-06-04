package com.provider.user.dao.impl;

import com.hero.fitness.utils.Result;
import com.provider.user.dao.UserDao;
import com.provider.user.model.User;
import com.provider.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:13
 **/
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    UserRepository userRepository;


    @Override
    public Result getUserById() {
        return null;
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
