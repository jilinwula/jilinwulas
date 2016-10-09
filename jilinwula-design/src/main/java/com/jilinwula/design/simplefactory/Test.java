package com.jilinwula.design.simplefactory;

import java.util.Scanner;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-23 13:46
 * @since 1.0.1
 */
public class Test {

    public static void main(String[] args) throws InterruptedException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        while (true) {
            System.out.println("请输入数字a：");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("请输入符号：+ - * /");
            String b = scanner.next();
            System.out.println("请输入数字b：");
            int c = scanner.nextInt();
            Operation operation = OperationFactory.createOperation(b);
            System.out.println(String.format("运行结果为：%d", operation.getResult(a, c)));
        }
    }
}
