package com.grgbanking.demo2;

public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象
        Student.teacherName = "大大";
        Student stu1 = new Student();
        stu1.setName("甘甘");
        stu1.setAge(22);
        stu1.setGender("女");
        //stu1.teacherName = "大大";

        stu1.study();
        stu1.show();

        Student stu2 = new Student();
        stu2.setName("cjc");
        stu2.setAge(23);
        stu2.setGender("男");
        //stu2.teacherName = "大大";

        stu2.study();
        stu2.show();

    }
}
