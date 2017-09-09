package design.creator.factory;

import org.junit.Test;

/**
 * 模式: 简单工厂模式
 * Created by jianweilin on 2017/9/3.
 */
public class BootStrap {

    @Test
    public void test_001(){
       ProductFactory.getProduct(2);
    }
}
