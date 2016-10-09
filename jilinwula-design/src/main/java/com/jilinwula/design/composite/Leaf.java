package com.jilinwula.design.composite;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 13:43
 * @since 1.0.1
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("add");
    }

    @Override
    public void remove(Component c) {
        System.out.println("remove");
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + "_" + name);
    }
}
