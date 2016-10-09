package com.jilinwula.design.decorator.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 17:30
 * @since 1.0.1
 */
public class ClothesA extends Design {
    public ClothesA() {
    }

    public ClothesA(Persion persion) {
        setPersion(persion);
    }
    @Override
    public void show() {
        super.show();
        System.out.print("大衣\t");
    }
}
