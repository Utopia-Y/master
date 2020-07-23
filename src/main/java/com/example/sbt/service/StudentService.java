package com.example.sbt.service;

import com.example.sbt.bean.StudentBean;

import java.util.List;

public interface StudentService {

    //query
    StudentBean queryStudentById(int id);//主键查询

    List<StudentBean> queryAllStudent();//所有

    //add
    int addStudent(StudentBean studentBean);

    //删除
    int deleteStudent(int id);

    //修改
    int modifyStudent(StudentBean studentBean);


}
