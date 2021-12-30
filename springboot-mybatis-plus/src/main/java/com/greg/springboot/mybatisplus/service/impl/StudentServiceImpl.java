package com.greg.springboot.mybatisplus.service.impl;

import com.greg.springboot.mybatisplus.dao.StudentDao;
import com.greg.springboot.mybatisplus.entity.Student;
import com.greg.springboot.mybatisplus.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author greg
 * @version 2021/12/29 0:46
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public Student getById(Integer id) {
        return studentDao.selectById(id);
    }
}
