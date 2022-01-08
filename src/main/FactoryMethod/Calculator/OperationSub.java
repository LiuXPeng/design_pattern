package main.FactoryMethod.Calculator;

/**
 * @version 1.0.0
 * @title: OperationSub
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2021-12-25 17:06
 */


public class OperationSub extends Operate{
    @Override
    public Double getResult() {
        return getNumA() - getNumB();
    }
}
