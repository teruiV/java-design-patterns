package design.creator.factory.simple;

/**
 * 模式: 工厂方法
 * Created by jianweilin on 2017/9/3.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
    }
}
