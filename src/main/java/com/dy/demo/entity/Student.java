package com.dy.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author zhanglianyong
 * 2022/11/7 20:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @NotNull
    private Long sid;

    private String sName;

    private String sex;

    private Integer age;

}
