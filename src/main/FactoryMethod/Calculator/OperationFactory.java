package main.FactoryMethod.Calculator;

/**
 * @version 1.0.0
 * @title: OperationFactory
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2021-12-25 17:11
 */


public class OperationFactory {
    public static Operate createOperate(String operate) {
        switch (operate) {
            case "+" :
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                return null;
        }
    }
}
