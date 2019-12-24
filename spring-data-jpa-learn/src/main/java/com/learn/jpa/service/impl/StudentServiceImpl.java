package com.learn.jpa.service.impl;

import com.learn.jpa.exception.LearnException;
import com.learn.jpa.pojo.ao.StudentAO;
import com.learn.jpa.pojo.entity.Student;
import com.learn.jpa.repository.StudentRepo;
import com.learn.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 具体实现
 *
 * @author wuww
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student insert(StudentAO studentAO) {
        Student student = new Student();
        copyAO2Student(studentAO, student);
        return studentRepo.save(student);
    }

    @Override
    public Student updateById(Long id, StudentAO studentAO) {
        Student student = studentRepo.findById(id).orElseThrow(() -> new LearnException("更新失败，未查到该用户，id=" + id));
        copyAO2Student(studentAO, student);
        return studentRepo.save(student);
    }

    @Override
    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepo.findById(id).orElseThrow(() -> new LearnException("查询失败，未查到该用户，id=" + id));
    }

    /**
     * 将AO中的内容赋值给Entity
     *
     * @param source AO
     * @param target Entity
     */
    private void copyAO2Student(StudentAO source, Student target) {
        Assert.notNull(source, "Source must not be null");
        Assert.notNull(target, "Target must not be null");
        target.setName(source.getName());
        target.setAge(source.getAge());
        target.setGender(source.getGender());
    }
}
