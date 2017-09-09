package design.creator.factory;

/**
 * Created by jianweilin on 2017/9/3.
 */
public class ProductFactory {
    private static final int CAR = 1;
    private static final int BICYCLE = 2;

    public static Product getProduct(int productId){
        switch (productId){
            case CAR :
                return new Car();
            case BICYCLE:
                return new Bicycle();
            default:
                throw new IllegalArgumentException("输入参数错误");
        }
    }
}
