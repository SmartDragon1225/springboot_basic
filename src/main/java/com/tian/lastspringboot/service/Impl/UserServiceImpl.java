package com.tian.lastspringboot.service.Impl;

import com.tian.lastspringboot.pojo.User;
import com.tian.lastspringboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: com.tian.lastspringboot.service.Impl
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:37
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserService userService;

    @Override
    public User select(int id) {
        return userService.select(id);
    }

    @Override
    public List<User> query() {
        return userService.query();
    }

    @Override
    public int add(User user) {
        return userService.add(user);
    }

    @Override
    public int delete(int id) {
        User user = userService.select(id);
        if(user != null){
            userService.delete(id);
        }
        return 0;
    }

    @Override
    public int update(User user) {
        User select = userService.select(user.getId());
        if(select != null){
            userService.update(user);
        }else {
            System.out.println("更新的用户不存在在！");
            return 0;
        }
        return 0;
    }
}
