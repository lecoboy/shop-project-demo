package com.greg.springboot.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.greg.springboot.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
