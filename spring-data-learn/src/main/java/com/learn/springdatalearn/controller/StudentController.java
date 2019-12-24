package com.learn.springdatalearn.controller;

import com.learn.springdatalearn.pojo.ao.StudentAO;
import com.learn.springdatalearn.pojo.entity.Student;
import com.learn.springdatalearn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生接口
 *
 * @author wuww
 * @version 1.0
 */
@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/{id}")
    public Student findById(@PathVariable(value = "id") Long id) {
        return studentService.findById(id);
    }

    @GetMapping(path = "/all")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping
    public Student insert(@RequestBody @Validated StudentAO studentAO) {
        return studentService.insert(studentAO);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        studentService.deleteById(id);
    }

    @PostMapping(path = "/{id}")
    public Student updateById(@PathVariable(value = "id") Long id, @RequestBody @Validated StudentAO studentAO) {
        return studentService.updateById(id, studentAO);
    }


}
