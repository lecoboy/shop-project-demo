package com.greg.springboot.mybatis.service.impl;

import com.greg.springboot.mybatis.dao.StudentDao;
import com.greg.springboot.mybatis.entity.Student;
import com.greg.springboot.mybatis.service.StudentService;

import javax.annotation.Resource;

/**
 * @author greg
 * @version 2021/12/29 0:46
 */
//@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public Student getById(Integer id) {
        return studentDao.selectById(id);
    }
}
