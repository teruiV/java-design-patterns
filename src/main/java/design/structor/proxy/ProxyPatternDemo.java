package design.structor.proxy;

/**
 * 模式: 代理模式
 *
 * 优点: 1. 适用于创建对象可能很昂贵的场景 & 通过代理类控制对象的访问权限
 * Created by jianweilin on 2017/9/9.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("TEXT_IMAGE.jpg");
        // 1. image will be loaded from disk;
        image.display();
        // 2.image will not be loaded from disk
        image.display();
    }
}
