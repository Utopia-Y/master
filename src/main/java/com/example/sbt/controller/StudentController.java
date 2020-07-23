package com.example.sbt.controller;


import com.example.sbt.bean.StudentBean;
import com.example.sbt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/name")
public class StudentController {

    @Autowired(required = false)
    StudentService studentService;

    @RequestMapping("/name")
    public String showStudents(ModelMap modelMap) {
        List<StudentBean> studentList = studentService.queryAllStudent();
        modelMap.addAttribute("studentList", studentList);
        return "name";
    }


    //add
    @RequestMapping("/addStudent")
    @ResponseBody
    public Map addStudent(StudentBean studentBean){
        int flag=studentService.addStudent(studentBean);
        Map<String, Object> map = new HashMap<>();
        if (flag==1){
            map.put("yes","successful!");
            return map;
        }else{
            map.put("no","fail!");
            return map;
        }
    }

    //delete
    @RequestMapping(value = "/deleteStudent+{id}")
    public String deleteStudent(@PathVariable("id") int id,ModelMap modelMap){
        int flag = studentService.deleteStudent(id);
        List<StudentBean> studentList = studentService.queryAllStudent();
        modelMap.addAttribute("studentList",studentList);
        if(flag == 1){
            return "student";
        }else {
            return "error";
        }
    }

    //query
    @RequestMapping("/student+{id}")
    public String queryStudent(@PathVariable("id") int id, ModelMap modelMap){
        StudentBean studentBean = studentService.queryStudentById(id);
        modelMap.addAttribute("student",studentBean);
        return "studentInfo";
    }

    //modify
    @RequestMapping("/modifyStudent")

    public Map modifyStudent(StudentBean studentBean){
        int flag = studentService.modifyStudent(studentBean);
        Map<String,Object> map = new HashMap<>();
        if(flag == 1){
            map.put("msg","success");
            return map;
        }else {
            map.put("msg","success");
            return map;
        }
    }

}
