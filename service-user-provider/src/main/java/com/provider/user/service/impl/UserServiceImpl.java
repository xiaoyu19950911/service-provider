package com.provider.user.service.impl;

import com.hero.fitness.utils.Result;
import com.hero.fitness.utils.ResultUtils;
import com.provider.user.dao.UserDao;
import com.provider.user.model.User;
import com.provider.user.response.UserGetResponse;
import com.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:12
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Value("${server.port}")
    String port;

    @Override
    public Result<UserGetResponse> getUser() {
        UserGetResponse result=new UserGetResponse();
        List<User> userList=userDao.getUser();
        result.setUserList(userList);
        System.out.println(port);
        result.setPort(port);
        return ResultUtils.success(result);
    }
}
