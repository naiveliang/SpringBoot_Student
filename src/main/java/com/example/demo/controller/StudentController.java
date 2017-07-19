package com.example.demo.controller;


import com.example.demo.dao.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mlamp on 2017/7/18.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentMapper stuMap;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "index";
    }

    @RequestMapping("/likeName")
    @ResponseBody
    public List<Student> likeName(String name){
        return stuMap.likeName("lxl");
    }

    @RequestMapping("/getById")
    @ResponseBody
    public Student getById(String id){
        return stuMap.getById("001");
    }

    @RequestMapping(value = "/getNameById/{id}")
    @ResponseBody
    public String getNameById(@PathVariable String id){
        String ret = stuMap.getNameById(id);
        if(null==ret) return null;//此学生不存在
        return ret;
    }

    @RequestMapping(value = "/deleteById/{id}")
    @ResponseBody
    public int deleteById(@PathVariable String id){
        String ret = stuMap.getNameById(id);
        if(null==ret) return 0;//此学生不存在
        stuMap.deleteById(id);
        return 1;
    }

    @RequestMapping(value = "/insertStudent")
    @ResponseBody
    public int insertStudent(@RequestBody Student stu){
        String ret = stuMap.getNameById(stu.getId());
        if(null!=ret) return 0;//此学生已存在
        stuMap.insertStudent(stu);
        return 1;
    }

    @RequestMapping(value = "/updateById")
    @ResponseBody
    public int updateById(@RequestBody Student stu){
        String ret = stuMap.getNameById(stu.getId());
        if(null==ret) return 0;//此学生不存在
        stuMap.updateById(stu);
        return 1;
    }

    @RequestMapping(value = "/getAllStudents")
    @ResponseBody
    public List<Student> getAllStudents(){
        return stuMap.getAllStudents();
    }
}
