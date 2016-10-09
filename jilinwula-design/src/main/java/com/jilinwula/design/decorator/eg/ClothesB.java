package com.jilinwula.design.decorator.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 17:30
 * @since 1.0.1
 */
public class ClothesB extends Design {
    public ClothesB(Persion persion) {
        setPersion(persion);
    }

    public ClothesB() {
    }

    @Override
    public void show() {
        super.show();
        System.out.print("棉衣\t");
    }
}
