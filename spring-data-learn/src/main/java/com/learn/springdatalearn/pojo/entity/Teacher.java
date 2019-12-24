package com.learn.springdatalearn.pojo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author wuww
 * @version 1.0
 */
@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(generator = "jpa")
    @GenericGenerator(name = "jpa", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    private String name;

    private Integer age;

    private String gender;

    @CreatedDate
    private LocalDateTime createTime;

    @LastModifiedDate
    private LocalDateTime updateTime;

}
