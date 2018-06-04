package com.provider.user.repository;

import com.provider.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:07
 **/
public interface UserRepository extends JpaRepository<User,Integer> {
}
