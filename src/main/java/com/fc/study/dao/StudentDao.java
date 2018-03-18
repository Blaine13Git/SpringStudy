package com.fc.study.dao;

import com.fc.study.entity.Student;

import java.util.Collection;

/**
 * 封装数据库操作方法
 */
public interface StudentDao {
    Collection<Student> getAllStudents();
    Student getStudentById(Integer id);
}
