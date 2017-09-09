package design.creator.factory.complex;

/**
 * 模式: 抽象工厂模式
 * Created by jianweilin on 2017/9/3.
 */
public class Client {
    AbstractCreator creator1 = new Creator1();
    AbstractCreator creator2 = new Creator2();

    AbstractProductA a1 = creator1.createProductA();
    AbstractProductA a2 = creator2.createProductA();

    AbstractProductB b1 = creator1.createProductB();
    AbstractProductB b2 = creator2.createProductB();



}
