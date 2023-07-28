package com.grgbanking.demo1;

public class User {
    //成员变量
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //插件PTG,右键,然后PTG to javabean(Ctrl +shift+ ,)

    public User() {
    }

    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }


//    //构造器
//    public User(){}
//    //构造带参构造器快捷键alt+Insert  然后结构体constructor,选中最上面的,按住shift不松,然后选择最下面的,就会全选.
//    public User(String username,String password,String email,String gender,int age){
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.gender = gender;
//        this.age = age;
//    }
    //成员方法
    //get和set快捷键alt+Insert  然后结构体getter & setter,选中最上面的,按住shift不松,或者ctrl+A然后选择最下面的,就会全选.

}
