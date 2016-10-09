package com.jilinwula.design.decorator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 16:22
 * @since 1.0.1
 */
public abstract class Decorator extends Component {

    protected Component component;

    @Override
    public void operation() {
        if(component !=null) {
            component.operation();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
