package com.greg.springboot.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.greg.springboot.mybatis.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends BaseMapper<Student> {
}
