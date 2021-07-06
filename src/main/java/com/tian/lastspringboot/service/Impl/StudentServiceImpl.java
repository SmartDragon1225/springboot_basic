package com.tian.lastspringboot.service.Impl;

import com.tian.lastspringboot.dao.StudentDao;
import com.tian.lastspringboot.pojo.Student;
import com.tian.lastspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Package: com.tian.lastspringboot.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:20
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> list() {
        return studentDao.list();
    }

    @Override
    public Student select(int id) {
        Student student = studentDao.slectById(id);
        if(student == null){
            return null;
        }
        return studentDao.slectById(id);
    }

    @Override
    public int add(Student student) {
        if(studentDao.slectById(student.getId())!=null){
            return 0;
        }
        return studentDao.add(student);
    }

    @Override
    public int delete(int id) {
        if(studentDao.slectById(id)==null){
            return 0;
        }
        return studentDao.delete(id);
    }

    @Override
    public int update(Student student) {
        if(studentDao.slectById(student.getId())==null){
            return 0;
        }
        return studentDao.update(student);
    }

    @Override
    public Student login(int id, String name) {
        return studentDao.login(id,name);
    }
}
