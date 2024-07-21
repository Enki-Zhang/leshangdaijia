package com.atguigu.mp;

/**
 * @author Enki
 * @ClassName LambdaExample
 * @Description: TODO
 * @Date 2024/7/20 22:11
 * @Version 1.0
 */
public class LambdaExample {
    public static void main(String[] args) {
        MyFunctionInterFace myFunctionInterFace = (a,b)-> a+b;
        System.out.println(myFunctionInterFace.funcitonInterFace(1,2));
    }
}
