package com.example.sbt.mapper;

import com.example.sbt.bean.StudentBean;

import java.util.List;

public interface StudentMapper {
    //query
    StudentBean queryStudentById(int id);//主键
    List<StudentBean> getAllStudent();

    //add
    int addStudent(StudentBean studentBean);

    //delete
    int deleteStudent(int id);

    //modify
    int modifyStudent(StudentBean studentBean);
}
