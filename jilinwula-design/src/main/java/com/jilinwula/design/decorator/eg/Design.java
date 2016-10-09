package com.jilinwula.design.decorator.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 17:26
 * @since 1.0.1
 */
public class Design extends Persion {
    private Persion persion;

    @Override
    public void show() {
        if (persion != null) {
            persion.show();
        }
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }
}
