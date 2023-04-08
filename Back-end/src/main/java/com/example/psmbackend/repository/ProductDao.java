package com.example.psmbackend.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.psmbackend.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDao extends BaseMapper<Product> {
}
