package com.jilinwula.design.builder;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 16:08
 * @since 1.0.1
 */
public class PersionThinBuilder extends PersionBuilder {

    public PersionThinBuilder(int x, int y, int a, int b) {
        super(x, y, a, b);
    }

    public void print(int x, int y, int a, int b ) {
        System.out.println(String.format("x=%s,y=%s,a=%s,b=%s", x, y ,a, b));
    }

    @Override
    public void buildHead() {
        x = 100;
        y = 200;
        a = 300;
        b = 400;
        print(x, y, a, b);
    }

    @Override
    public void buildBody() {
        x = 100;
        y = 200;
        a = 300;
        b = 400;
        print(x, y, a, b);
    }

    @Override
    public void buildLeft() {
        x = 100;
        y = 200;
        a = 300;
        b = 400;
        print(x, y, a, b);
    }

    @Override
    public void buildRight() {
        x = 100;
        y = 200;
        a = 300;
        b = 400;
        print(x, y, a, b);
    }
}
