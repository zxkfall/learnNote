package com.flywinter.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User:Zhang Xingkun
 * Date:2021/7/22 22:42
 * Description:
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
