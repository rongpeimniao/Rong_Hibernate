package com.rong.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/** 
* @ClassName: PersonDao 
* @Description: 用户dao
* @author: 容培淼
* @email:810209659@qq.com
* 对象类
*/
@Entity
@Table(name = "person3")  
public class Person {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator", strategy = GenerationType.TABLE)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "name", length = 50)
    private String name;
    @Column
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
