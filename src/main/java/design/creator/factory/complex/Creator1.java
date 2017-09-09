package design.creator.factory.complex;

/**
 * Created by jianweilin on 2017/9/3.
 */
public class Creator1 extends AbstractCreator {

    // 只生产产品等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    // 只生产产品等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
