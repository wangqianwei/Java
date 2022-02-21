package com.Java.base.object;

/**
 * @author wangqianwei
 * @Description: 封装
 * @date 2/20/227:18 PM
 */
public class Person {
    private String name;//名字
    private int gender;// 性别
    private int age;// 年龄

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    // 跑-功能
    public void run() {
        System.out.println("跑");
    }

    // 说话-功能
    public void speak() {
        System.out.println("说话");
    }
}
