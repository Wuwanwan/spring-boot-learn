package com.learn.springdatalearn.repository;

import com.learn.springdatalearn.pojo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuww
 * @version 1.0
 */
public interface StudentRepo extends JpaRepository<Student, Long> {
}
