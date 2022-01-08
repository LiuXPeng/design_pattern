package main.FactoryMethod.Calculator;

/**
 * @version 1.0.0
 * @title: Client
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2021-12-25 17:14
 */


public class Client {
    public static void main(String[] args) {
        Operate operate = OperationFactory.createOperate("*");
        operate.setNumA(1.1);
        operate.setNumB(1.36);
        System.out.println(operate.getResult());
    }
}
