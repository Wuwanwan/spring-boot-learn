package com.learn.jpa.pojo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @author wuww
 * @version 1.0
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity {

    // 主键也可以在此统一申明，以下是三种申明方式
//    @Id
//    @GeneratedValue
//    protected Integer id;
//    @Id
//    @GeneratedValue
//    private Long id;
//    @Id
//    @GeneratedValue(generator = "jpa")
//    @GenericGenerator(name = "jpa", strategy = "uuid2")
//    private String id;

    @CreatedDate
    private LocalDateTime createTime;

    @LastModifiedDate
    private LocalDateTime updateTime;

}
