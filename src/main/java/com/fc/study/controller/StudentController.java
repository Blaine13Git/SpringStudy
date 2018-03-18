package com.fc.study.controller;

import com.fc.study.entity.Student;
import com.fc.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") Integer id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
        return "OK";
    }

    /**
     * http://localhost:8989/save?name=xxx&age=12 构建类似这样的链接进行提交
     * @param name
     * @param age
     * @return
     */
    @GetMapping(value = "/save")
    public String updateStudent(@RequestParam String name, @RequestParam int age) {
        studentService.updateStudent(name, age);
        return "OK";
    }

}
