package com.grgbanking.demo2;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //学习行为
    public void study() {
        System.out.println(name + "正在学习");
    }

    //展示信息
    public void show() {
        System.out.println(name + "," + age + "," + gender + "," + teacherName);
    }

}
