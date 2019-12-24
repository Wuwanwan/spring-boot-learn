package com.learn.springdatalearn.pojo.ao;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author wuww
 * @version 1.0
 */
@Data
public class StudentAO {

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotNull(message = "年龄不能为空")
    private Integer age;

    @NotBlank(message = "性别不能为空")
    private String gender;

}
