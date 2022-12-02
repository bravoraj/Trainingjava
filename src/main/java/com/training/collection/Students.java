package com.training.collection;

public class Students {

    private int id;
    private String name;
    private int age;
    private String collegeName;

    public Students(int id, String name, int age, String collegeName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
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
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}