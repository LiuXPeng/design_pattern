package main.FactoryMethod.LeiFengFactory;

/**
 * @version 1.0.0
 * @title: VolunteerFactory
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2022-01-08 22:57
 */


public class VolunteerFactory implements ILeiFengFactory{
    @Override
    public LeiFeng createLeifeng() {
        return new Volunteer();
    }
}
