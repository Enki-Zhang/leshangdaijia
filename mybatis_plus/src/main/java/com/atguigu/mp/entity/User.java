package com.atguigu.mp.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Enki
 * @ClassName User
 * @Description: TODO
 * @Date 2024/7/20 17:20
 * @Version 1.0
 */
@Data
@TableName("user")//若表名不一致 需要手动指定
@AllArgsConstructor
public class User {
    //    数据库中的实际字段
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField("name")//指定对应表的字段
    private String name;
    private Integer age;
    @TableField(exist = true)
    private String email;
    @TableLogic//逻辑删除
    private Integer deleted;


    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
