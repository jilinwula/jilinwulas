package com.jilinwula.design.prototype;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 11:09
 * @since 1.0.1
 */
public class Test {

    public void test() throws CloneNotSupportedException {
        Prototype p1 = new Prototype("11110000");
        Student student = new Student();
        student.setName("a");
        p1.setStudent(student);
        Prototype p2 = (Prototype) p1.clone();
//        Prototype p2 = p1;
        p1.setId("1");
        p1.setStudent(new Student());
        System.out.println(p2.getId());
        System.out.println(p2.getStudent().getName());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
       new Test().test();
    }
}
