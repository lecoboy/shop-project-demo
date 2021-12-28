package com.greg.springboot.mybatis.service;

import com.greg.springboot.mybatis.MybatisApplication;
import com.greg.springboot.mybatis.dao.StudentDao;
import com.greg.springboot.mybatis.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author greg
 * @version 2021/12/29 0:48
 */
@SpringBootTest(classes = MybatisApplication.class)
public class StudentServiceTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void testGetById() {
        List<Student> students = studentDao.selectList(null);
        System.out.println(students);
    }
}
