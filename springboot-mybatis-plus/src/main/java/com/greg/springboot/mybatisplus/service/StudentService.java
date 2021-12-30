package com.greg.springboot.mybatisplus.service;

import com.greg.springboot.mybatisplus.entity.Student;

public interface StudentService {
    Student getById(Integer id);
}
