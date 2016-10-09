package com.jilinwula.design.simplefactory;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-23 15:28
 * @since 1.0.1
 */
public class OperationFactory {

    private static final String classPath = "com.jilinwula.design.simplefactory.";
    private static final String className = "OperationAdd";

    public static Operation createOperation(String operate) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       /* Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;*/
        return (Operation) Class.forName(classPath + className).newInstance();
    }
}
