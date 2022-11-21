package com.dy.demo.service;

import com.dy.demo.entity.Student;

import java.util.List;

/**
 * @author zhanglianyong
 * 2022/11/21 9:24
 */
public interface StudentService {

    /**
     * 根据学号查询学生信息
     * @param studentId 学号
     * @return 查询结果
     */
    List<Student> getStudentById(Long studentId);

    /**
     * 更新学生信息
     * @param student 学生
     */
    void updateStudentById(Student student);
}
