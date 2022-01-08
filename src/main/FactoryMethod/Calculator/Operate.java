package main.FactoryMethod.Calculator;

/**
 * @version 1.0.0
 * @title: Operate
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2021-12-23 19:39
 */


public abstract class Operate {
    private Double numA;
    private Double numB;


    public Double getNumA() {
        return numA;
    }

    public void setNumA(Double numA) {
        this.numA = numA;
    }

    public Double getNumB() {
        return numB;
    }

    public void setNumB(Double numB) {
        this.numB = numB;
    }

    public abstract Double getResult();

}
