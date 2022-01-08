package main.FactoryMethod.Calculator;

/**
 * @version 1.0.0
 * @title: OperationDiv
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2021-12-25 17:10
 */


public class OperationDiv extends Operate{
    @Override
    public Double getResult() {
        if (getNumB() == 0) {
            return 0.;
        }
        return getNumA() / getNumB();
    }
}
