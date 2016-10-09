package com.jilinwula.design.decorator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 16:21
 * @since 1.0.1
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("搭配：");
    }
}
