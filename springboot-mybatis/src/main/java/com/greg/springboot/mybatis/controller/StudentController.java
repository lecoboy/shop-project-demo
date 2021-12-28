package com.greg.springboot.mybatis.controller;

import com.greg.springboot.mybatis.dao.StudentDao;
import com.greg.springboot.mybatis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author greg
 * @version 2021/12/29 1:44
 */
@RequestMapping("/student")
@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Integer id) {
        Student student = studentDao.selectById(id);
        return student.toString();
    }
}
