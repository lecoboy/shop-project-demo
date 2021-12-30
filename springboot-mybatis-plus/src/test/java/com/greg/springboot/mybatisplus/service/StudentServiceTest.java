package com.greg.springboot.mybatisplus.service;

import com.greg.springboot.mybatisplus.MybatisPlusApplication;
import com.greg.springboot.mybatisplus.dao.StudentDao;
import com.greg.springboot.mybatisplus.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author greg
 * @version 2021/12/29 0:48
 */
@SpringBootTest(classes = MybatisPlusApplication.class)
class StudentServiceTest {
    @Resource
    private StudentDao studentDao;

    @Test
    void testSelectList() {
        List<Student> students = studentDao.selectList(null);
        System.out.println(students);
    }
}
