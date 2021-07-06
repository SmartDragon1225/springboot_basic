package com.tian.lastspringboot.dao;

import com.tian.lastspringboot.pojo.Student;
import com.tian.lastspringboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Package: com.tian.lastspringboot.dao
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:18
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Mapper
public interface UserDao {

    /**
     * 查询指定的 User
     * @param id
     * @return
     */
    User select(int id);

    /**
     * 查询所有的 User
     * @return
     */
    List<User> query();

    /**
     * 添加一个 User
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 删除指定的 User
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 实现思路，现根据 id 查询出 User,然后在修改 ！（Service实现！）
     * 更新 User
     * @param user
     * @return
     */
    int update(User user);
}
