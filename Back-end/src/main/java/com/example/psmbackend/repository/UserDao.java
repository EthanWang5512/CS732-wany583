package com.example.psmbackend.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.psmbackend.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<User> {
}
