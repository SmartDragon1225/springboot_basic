package com.tian.lastspringboot.controller;

import com.tian.lastspringboot.pojo.User;
import com.tian.lastspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.tian.lastspringboot.controller
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:42
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService service;

    /**
     * 查询指定的 User
     * @param id
     * @return
     */
    @RequestMapping("/select{id}")
    private User select(@PathVariable("id") int id){
        return service.select(id);
    }


}
