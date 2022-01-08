package main.FactoryMethod.Calculator;



/**
 * @version 1.0.0
 * @title: OperationAdd
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2021-12-23 11:48
 */


public class OperationAdd extends Operate{

    @Override
    public Double getResult() {
        return getNumA() + getNumB();
    }
}
