package com.grgbanking.demo1;

public class StudentTest {
    public static void main(String[] args) {

        Student[] arr = new Student[3];
        Student stu1 = new Student(001, "甘甘", 22);
        Student stu2 = new Student(002, "cjc", 23);
        Student stu3 = new Student(003, "小呆呆鸡", 21);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(004, "大呆呆鸡", 19);

        boolean flag = contains(arr, stu4.getId());

        if (flag) {
            System.out.println("当前ID重复,请修改ID后再进行添加");
        } else {
            int count = getcount(arr);
            if (count == arr.length) {
                //已经存满
                //需要新建一个数组,并且将老数组的元素拷贝进新数组
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                arr = newArr;
                printArr(newArr);


            } else {
                //未存满
                arr[count] = stu4;
                printArr(arr);
            }

        }



        int index = getIndex(arr, 4);
        System.out.println(index);
        if(index >= 0){
            //存在,要进行删除操作,将index索引处的数值置为null
            arr[index] = null;
            printArr(arr);
        }else{
            System.out.println("ID不存在,删除失败");
        }


        int index1 = getIndex(arr, 3);
        if(index1>= 0){
            //存在则将年龄+1
            Student stu = arr[index1];
            int newage = stu.getAge();
            stu.setAge(newage+1);
            printArr(arr);
        }else{
            //提示
            System.out.println("当前ID不存在,无法进行修改");
        }
    }


    //学号唯一性判断的方法
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (id == sid) {
                    return true;
                }
            }
        }
        return false;
    }


    //判断数组当前有几个学生信息,是否已满,是否可以添加新的学生信息
    public static int getcount(Student[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //创建新数组的方法
    public static Student[] createNewArr(Student[] arr) {

        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //把新数组返回
        return newArr;

    }

    //遍历数组元素
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    //通过ID找到数组中索引的方法
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }


}
