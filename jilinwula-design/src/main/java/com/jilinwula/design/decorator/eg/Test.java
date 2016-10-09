package com.jilinwula.design.decorator.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 17:32
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        ClothesA clothesA = new ClothesA(new ClothesB(new ClothesC(new Persion())));
        clothesA.show();
    }
}