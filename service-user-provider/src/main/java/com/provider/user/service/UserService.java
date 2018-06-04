package com.provider.user.service;

import com.hero.fitness.utils.Result;
import com.provider.user.response.UserGetResponse;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:11
 **/
public interface UserService {
    Result<UserGetResponse> getUser();
}
