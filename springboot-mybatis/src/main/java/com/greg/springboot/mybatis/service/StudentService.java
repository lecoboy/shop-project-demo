package com.greg.springboot.mybatis.service;

import com.greg.springboot.mybatis.entity.Student;

public interface StudentService {
    Student getById(Integer id);
}
