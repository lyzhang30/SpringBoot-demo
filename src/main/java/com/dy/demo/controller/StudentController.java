package com.dy.demo.controller;

import com.dy.demo.common.Response;
import com.dy.demo.entity.Student;
import com.dy.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhanglianyong
 * 2022/11/21 9:58
 * @RequestMapping 路径映射
 */
@RestController
@RequestMapping("student")
@Api("学生信息控制类")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("getById")
    @ApiOperation("根据id获取学生信息")
    public Response<List<Student>> getStudent(Long studentId) {

        return Response.success(studentService.getStudentById(studentId));
    }

    @PostMapping("update")
    @ApiOperation("根据id修改学生信息")
    public Response<String> updateStudent(@RequestBody @Validated Student student,
                                          BindingResult result) {
        if (result.hasErrors()) {
            return Response.error("参数为空！");
        }
        studentService.updateStudentById(student);
        return Response.success("修改成功");
    }
}
