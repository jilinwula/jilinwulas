package com.jilinwula.design.builder.eg;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 16:32
 * @since 1.0.1
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
