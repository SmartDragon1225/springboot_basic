package com.tian.lastspringboot.controller;

import com.tian.lastspringboot.pojo.Student;
import com.tian.lastspringboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Package: com.tian.lastspringboot.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:20
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@Slf4j
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping ("list")
    public List<Student> list(){
        log.info("查询结果如下！");
        return studentService.list();
    }

    @RequestMapping("select/{id}")
    public Student list(@PathVariable("id") int id){
        log.info("查询结果如下！");
        return studentService.select(id);
    }

    @RequestMapping("add")
    public int list(Student student){
        log.info("查询结果如下！");
        return studentService.add(student);
    }

    @RequestMapping("delete/{id}")
    public int delete(@PathVariable("id") int id){
        log.info("查询结果如下！");
        return studentService.delete(id);
    }

    @RequestMapping("update")
    public int update(Student student){
        log.info("查询结果如下！");
        return studentService.update(student);
    }

}
