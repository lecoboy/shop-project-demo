package com.greg.springboot.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author greg
 * @version 2021/12/29 0:42
 */
@TableName("student")
@Data
public class Student {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Date addTime;
    private Date updateTime;
}
