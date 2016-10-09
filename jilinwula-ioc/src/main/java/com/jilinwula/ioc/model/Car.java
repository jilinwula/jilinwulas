package com.jilinwula.ioc.model;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午8:50
 */
public class Car {
    private String brand;
    private String color;
    private int maxSpeed;
    private double price;
    private String scorp;
    private Boss boss;

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public Car(String brand, Boss boss) {
        this.brand = brand;
        this.boss = boss;
    }

    public Car() {
        System.out.println("--------------------------4");
    }

    public Car(String brand, String scorp, int maxSpeed) {
        this.brand = brand;
        this.scorp = scorp;
        this.maxSpeed = maxSpeed;
        System.out.println("--------------------------3");
    }

    public Car(String brand, String scorp, double price) {
        this.brand = brand;
        this.scorp = scorp;
        this.price = price;
        System.out.println("--------------------------2");
    }

    public String getScorp() {
        return scorp;
    }

    public void setScorp(String scorp) {
        this.scorp = scorp;
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("--------------------------1");
    }

    public void introduce() {
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}');
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
