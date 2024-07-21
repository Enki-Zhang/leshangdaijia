package com.atguigu.mp.entity;

import com.baomidou.mybatisplus.annotation.*;

/**
 * @author Enki
 * @ClassName User01
 * @Description: TODO
 * @Date 2024/7/21 10:55
 * @Version 1.0
 */
@TableName("user_tt")
public class User01 {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    @TableField("name")//指定对应表的字段
    private String name;
    private Integer age;
    @TableField(exist = true)
    private String email;
    @TableLogic//逻辑删除
    private Integer deleted;

    public User01(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
