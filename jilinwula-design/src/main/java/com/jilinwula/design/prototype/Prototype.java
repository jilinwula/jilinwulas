package com.jilinwula.design.prototype;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 11:06
 * @since 1.0.1
 */
public class Prototype implements Cloneable {

    private String id;
    private Student student;

    public String getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Prototype(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
