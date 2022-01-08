package main.FactoryMethod.LeiFengFactory;

/**
 * @version 1.0.0
 * @title: Client
 * @projectName design_pattern
 * @description: TODO
 * @author： 刘晓鹏
 * @date： 2022-01-08 22:59
 */


public class Client {
    public static void main(String[] args) {
        //当有新的类型，只需要在服务端增加工厂，不需要改动
        //客户端初始化工厂可以写反射等
        ILeiFengFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeifeng();
        leiFeng.BuyRich();
    }



}
