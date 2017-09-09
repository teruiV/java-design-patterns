package design.creator.factory.simple;

/**
 * Created by jianweilin on 2017/9/3.
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
