package design.structor.bridge;

/**
 * 模式: 桥接模式
 *
 * 缺点:桥接模式在提供灵活性的同时,会增加负责性,消息间的传递也可能存在性能问题
 * Created by jianweilin on 2017/9/6.
 */
public class BootStrap {
    public static void main(String[] args) {
        ITV tv = new SonyTV();
        LogitechRemoteController irc = new LogitechRemoteController(tv);
        irc.setChannelKeyBoard(100);
    }
}
