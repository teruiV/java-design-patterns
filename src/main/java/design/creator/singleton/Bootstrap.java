package design.creator.singleton;

import org.junit.Test;

/**
 * 单例模式
 * Created by jianweilin on 2017/9/3.
 */
public class Bootstrap {
    private static final int INIT_NUM = 0;
    private static final int THREAD_NUM = 10000;

    @Test
    public void test_001(){
        long start = System.currentTimeMillis();
        for(int i =INIT_NUM; i < THREAD_NUM; i++){
            new Thread(() -> SingletonA.getInstance()).start();
            new Thread(() -> SingletonA.getInstance()).start();
        }
        System.out.println("SingletonA spend: " + (System.currentTimeMillis() - start) + " millis");
    }

    @Test
    public void test_002(){
        long start = System.currentTimeMillis();
        for(int i =INIT_NUM; i < THREAD_NUM; i++){
            new Thread(() -> ThreadSafeSingleton.getInstance()).start();
            new Thread(() -> ThreadSafeSingleton.getInstance()).start();
        }
        System.out.println("ThreadSafeSingleton spend: " + (System.currentTimeMillis() - start) + " millis");
    }

    @Test
    public void test_003(){
        long start = System.currentTimeMillis();
        for(int i =INIT_NUM; i < THREAD_NUM; i++){
            new Thread(() -> DoubleCheckSingleton.getInstance()).start();
            new Thread(() -> DoubleCheckSingleton.getInstance()).start();
        }
        System.out.println("DoubleCheckSingleton spend: " + (System.currentTimeMillis() - start) + " millis");
    }

    @Test
    public void test_004(){
        long start = System.currentTimeMillis();
        for(int i =INIT_NUM; i < THREAD_NUM; i++){
            new Thread(() -> StaticClassSingleton.getInstance()).start();
            new Thread(() -> StaticClassSingleton.getInstance()).start();
        }
        System.out.println("StaticClassSingleton spend: " + (System.currentTimeMillis() - start) + " millis");

    }

    @Test
    public void performance(){
        test_001();
        test_002();
        test_003();
        test_004();
    }

}
