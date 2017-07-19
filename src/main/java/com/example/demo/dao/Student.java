package com.example.demo.dao;

/**
 * Created by mlamp on 2017/7/18.
 */
import java.io.Serializable;

public class Student implements Serializable{

    private static final long serialVersionUID = 2120869894112984147L;

    private String id;
    private String name;
    private Integer age;

    // get set 方法省略
    public void setId(String id){
        this.id = id;
    }
    public String getId(){return this.id;}
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public Integer getAge(){return this.age;}

}
