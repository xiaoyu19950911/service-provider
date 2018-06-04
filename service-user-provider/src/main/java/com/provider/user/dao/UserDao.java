package com.provider.user.dao;

import com.hero.fitness.utils.Result;
import com.provider.user.model.User;

import java.util.List;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:13
 **/
public interface UserDao {
    Result getUserById();

    List<User> getUser();

}
