package com.dy.demo.service.impl;

import com.dy.demo.entity.Student;
import com.dy.demo.mapper.StudentMapper;
import com.dy.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhanglianyong
 * 2022/11/21 9:24
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {


    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> getStudentById(Long studentId) {

        return studentMapper.getStudentById(studentId);
    }

    /**
     * 根据id更新学生信息
     * @param student 学生
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateStudentById(Student student) {
        if (null == student) {
            throw new RuntimeException("对象为空，更新失败！");
        }
        if (null == student.getSid()) {
            throw new RuntimeException("对象为空，更新失败！");
        }
        int update = studentMapper.updateById(student);
        if (update < 1) {
            throw new RuntimeException("更新失败！");
        }
    }

}
