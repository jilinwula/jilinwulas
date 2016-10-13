package com.jilinwula.design.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 14:32
 * @since 1.0.1
 */
public class ObjectStructure {
    private List<Element> elements = new LinkedList<Element>();
    public void attach(Element element) {
        elements.add(element);
    }
    public void detach(Element element) {
        elements.remove(element);
    }
    public void accept(Visitor visitor) {
        for(Element e : elements) {
            e.accept(visitor);
        }
    }
}
