package design.creator.factory.simple;

/**
 * Created by jianweilin on 2017/9/3.
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){}
        return (T) product;
    }
}
