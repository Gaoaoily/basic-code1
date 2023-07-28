package com.grgbanking.demo1;

public class Friend {


    /*成员变量*/
    private int age;
    private String name;
    private String gender;

    //setage
    public void setAge(int age) {//这行的age叫局部变量
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("不合法数据");
        }
    }

    //getage
    public int getAge() {
        return age;
    }

    //setname
    public void setName(String name) {
        this.name = name;
    }

    //getname
    public String getName() {
        return name;
    }

    //setgender
    public void setGender(String gender) {
        this.gender = gender;//就近原则
    }

    //getgender
    public String getGender() {
        return gender;
    }


    /*成员方法*/
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }


    /*构造器*/
    public Friend(){
        System.out.println("空参执行方法");
    }

    public Friend(int age,String name,String gender){
        System.out.println("带参执行方法");
        this.age = age;
        this.name = name;
        this.gender = gender;
    }







}
