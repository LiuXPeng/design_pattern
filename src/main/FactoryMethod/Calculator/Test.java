package main.FactoryMethod.Calculator;

/**
 * @version 1.0.0
 * @title: Test
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2021-12-23 19:46
 */


public class Test {
    public static void main(String[] args) {
        Operate operate = new OperationAdd();
        System.out.println(operate.getResult());
    }
}
