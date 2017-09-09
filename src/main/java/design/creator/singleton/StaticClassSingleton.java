package design.creator.singleton;

/**
 * Created by jianweilin on 2017/9/3.
 */
public class StaticClassSingleton {
    private StaticClassSingleton(){}

    public static StaticClassSingleton getInstance(){
        return HelpHolder.INITITAL_INSTANCE;
    }

    private static class HelpHolder {
        private static final StaticClassSingleton INITITAL_INSTANCE = new StaticClassSingleton();
    }
}
