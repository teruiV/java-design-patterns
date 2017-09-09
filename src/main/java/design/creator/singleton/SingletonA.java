package design.creator.singleton;

import lombok.Data;

/**
 * 缺点每次都需要实例化对象;
 * Created by jianweilin on 2017/9/3.
 */
@Data
public class SingletonA {
    private static SingletonA singletonA = new SingletonA();
    private SingletonA(){}

    public static SingletonA getInstance(){
        return singletonA;
    }
}
