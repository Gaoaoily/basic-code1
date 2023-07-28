package com.grgbanking.demo1;

import java.util.Random;

public class Game {

    //成员变量
    private String name;
    private int blood;
    private String gender;
    private String face;

    String[] boyfaces = {"风流倜傥", "器宇轩昂", "相貌英俊", "五官端正"};
    String[] grilfaces = {"身材姣好", "亭亭玉立", "沉鱼落雁", "美奂绝伦"};

    public Game() {
    }

    public Game(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Game(String name, int blood, String gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }


    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Game{name = " + name + ", blood = " + blood + "}";
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
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     *
     * @param face
     */
    public void setFace(String  gender) {

        if (gender == "男") {

            Random r = new Random();
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];

        } else if (gender == "女") {

            Random r = new Random();
            int index = r.nextInt(grilfaces.length);
            this.face = grilfaces[index];

        } else {
            this.face = "无脸";
        }


    }

    /**
     * 获取
     *
     * @return boyfaces
     */


    //成员方法攻击
    public void attack1(Game game) {

        //计算造成的伤害,利用随机值来获取造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        int remainblood = game.getBlood() - hurt;
        remainblood = remainblood < 0 ? 0 : remainblood;
        game.setBlood(remainblood);


        System.out.println(this.getName() + "举起脚,踹了" + game.getName() + "一下," +
                "造成了" + hurt + "点伤害,cjc还剩下" + game.getBlood() + "点血");

    }

    public void attack2(Game game) {

        //计算造成的伤害,利用随机值来获取造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        int remainblood = game.getBlood() - hurt;
        remainblood = remainblood < 0 ? 0 : remainblood;
        game.setBlood(remainblood);


        System.out.println(this.getName() + "用胡子,刮了" + game.getName() + "一下," +
                "造成了" + hurt + "点伤害,cjc还剩下" + game.getBlood() + "点血");

    }

    public void showgameInfo(){
        System.out.println();
        System.out.println("姓名为:"+getName());
        System.out.println("血量为:"+getBlood());
        System.out.println("性别为:"+this.getGender());
        System.out.println("形象为:"+getFace());
        System.out.println();
    }

}
