package com.learn.jpa.pojo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author wuww
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Teacher extends BaseEntity {

    @Id
    @GeneratedValue(generator = "jpa")
    @GenericGenerator(name = "jpa", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    private String name;

    private Integer age;

    private String gender;

}
