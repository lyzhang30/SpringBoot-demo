package com.dy.demo.mapper;

import com.dy.demo.HelloWorldApplication;
import com.dy.demo.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zhanglianyong
 * 2022/11/21 9:34
 */
@SpringBootTest(classes = HelloWorldApplication.class)
@RunWith(SpringRunner.class)
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void getStudentByIdTest() {
        List<Student> student = studentMapper.getStudentById(2L);
        System.out.println(student);
    }
}
