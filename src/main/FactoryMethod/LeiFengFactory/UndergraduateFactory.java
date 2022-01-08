package main.FactoryMethod.LeiFengFactory;

/**
 * @version 1.0.0
 * @title: UndergraduateFactory
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2022-01-08 22:55
 */


public class UndergraduateFactory implements ILeiFengFactory{
    @Override
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}
