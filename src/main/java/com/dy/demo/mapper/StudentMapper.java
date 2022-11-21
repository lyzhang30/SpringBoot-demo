package com.dy.demo.mapper;

import com.dy.demo.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhanglianyong
 * 2022/11/21 9:23
 */
@Repository
public interface StudentMapper {

    /**
     * 根据学生id查询信息
     * @param sid 学生id
     * @return 结果
     */
    List<Student> getStudentById(@Param("sid") Long sid);

    /**
     * 更新学生信息
     * @param student 学生信息
     */
    int updateById(Student student);
}
