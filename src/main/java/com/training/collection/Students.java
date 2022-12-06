package com.training.collection;

import com.sun.scenario.effect.Effect;

public class Students {

    private int id;
    private String name;
    private int age;
    private String Grade;

    public Students(int id, String name, int age, String Grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Grade = Grade;
    }

    public static Effect stream() {

        return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollegeName() {
        return Grade;
    }

    public void setCollegeName(String collegeName) {
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", collegeName='" + Grade + '\'' +
                '}';
    }

    public boolean startsWith(String A) {
        return false;
    }
}