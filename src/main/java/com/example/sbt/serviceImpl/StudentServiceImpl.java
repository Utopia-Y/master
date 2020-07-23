package com.example.sbt.serviceImpl;

import com.example.sbt.bean.StudentBean;
import com.example.sbt.mapper.StudentMapper;
import com.example.sbt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired(required = false)
    StudentMapper studentMapper;



    public StudentBean queryStudentById(int id)
    {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public List<StudentBean> queryAllStudent(){
        return  studentMapper.getAllStudent();
    }


    //add
    @Override
    public int addStudent(StudentBean studentBean){
        int addFlag = studentMapper.addStudent(studentBean);
        return addFlag;
    }

    //delete
    @Override
    public int deleteStudent(int id){
        int deleteFlag = studentMapper.addStudent(queryStudentById(id));
        return deleteFlag;
    }

    //modify
    @Override
    public int modifyStudent(StudentBean studentBean){
        int modifyFlag = studentMapper.addStudent(studentBean);
        return modifyFlag;
    }




}
