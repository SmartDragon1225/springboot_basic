package com.tian.lastspringboot.controller;

import com.tian.lastspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * Package: com.tian.lastspringboot.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:20
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Controller
public class LoginController {

    @Autowired
    StudentService studentService;
    @RequestMapping("index")
    public String login(@RequestParam("id")int id, @RequestParam("name") String name){
        if(studentService.login(id,name)==null){
            return "index";
        }else {
            return "error";
        }
    }
}
