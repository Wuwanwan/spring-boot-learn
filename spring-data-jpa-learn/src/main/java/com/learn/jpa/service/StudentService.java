package com.learn.jpa.service;

import com.learn.jpa.pojo.ao.StudentAO;
import com.learn.jpa.pojo.entity.Student;

import java.util.List;

/**
 * 学生增删改插接口
 *
 * @author wuww
 * @version 1.0
 */
public interface StudentService {

    /**
     * 新增
     *
     * @param studentAO 待新增的信息
     * @return 成功插入的数据
     */
    Student insert(StudentAO studentAO);

    /**
     * 根据id 更新
     *
     * @param id        更新条件
     * @param studentAO 更新内容
     * @return 更新成功的信息
     */
    Student updateById(Long id, StudentAO studentAO);

    /**
     * 根据id 删除
     *
     * @param id 删除条件
     */
    void deleteById(Long id);

    /**
     * 查询所有
     *
     * @return 结果
     */
    List<Student> findAll();

    /**
     * 根据id 查询
     *
     * @param id 查询条件
     * @return 符合条件的值
     */
    Student findById(Long id);

}
