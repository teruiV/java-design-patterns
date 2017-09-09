package design.creator.singleton;

/**
 * 缺点:并发效率低
 * Created by jianweilin on 2017/9/3.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singleton = null;

    private ThreadSafeSingleton(){
        if(singleton != null){
            throw new IllegalStateException("already initial!");
        }
    }

    public synchronized static ThreadSafeSingleton getInstance(){
        if(singleton == null){
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }
}
