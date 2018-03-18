package com.fc.study.dao;

import com.fc.study.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库操作方法的实现
 */

@Repository
@Qualifier("sqlData")
public class SqlStudentDaoImpl implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "tom", 11));
                put(2, new Student(2, "tom", 12));
                put(3, new Student(3, "tom", 13));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(Integer id) {
        return this.students.get(id);
    }

}
