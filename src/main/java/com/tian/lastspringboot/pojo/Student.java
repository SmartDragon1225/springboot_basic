package com.tian.lastspringboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 * Package: com.tian.lastspringboot.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:20
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String place;
    private Date creat_time;
    private Date updata_time;
}

