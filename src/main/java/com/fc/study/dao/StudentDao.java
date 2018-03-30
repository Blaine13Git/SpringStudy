package com.fc.study.dao;

import com.fc.study.entity.Student;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.Collection;

/**
 * 封装数据库操作方法
 */
public interface StudentDao {
    Collection<Student> getAllStudents();
    Student getStudentById(Integer id);
}
