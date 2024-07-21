package com.atguigu.mp.mapper;

import com.atguigu.mp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Enki
 * @ClassName UserMapper
 * @Description: TODO
 * @Date 2024/7/20 17:33
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
