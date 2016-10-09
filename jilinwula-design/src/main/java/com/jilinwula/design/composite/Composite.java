package com.jilinwula.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 13:47
 * @since 1.0.1
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + "_" + name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
