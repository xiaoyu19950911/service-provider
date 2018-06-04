package com.provider.user.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 10:47
 **/
@Entity
@Data
public class User {

    @Id
    private Integer id;

    private String name;

    private Integer sex;

    private String address;
}
