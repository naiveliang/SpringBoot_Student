package com.example.demo.mapper;

/**
 * Created by mlamp on 2017/7/18.
 */
import java.util.List;

import com.example.demo.dao.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper{

    public List<Student> likeName(String name);

    public Student getById(String id);

    public String getNameById(String id);

    public int deleteById(String id);

    public int insertStudent(Student stu);

    public int updateById(Student stu);

    public List<Student> getAllStudents();

}
