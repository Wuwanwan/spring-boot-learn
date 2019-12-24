package com.learn.jpa.pojo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 学生表
 *
 * @author wuww
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Student extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    private Integer age;

    private String gender;

}
