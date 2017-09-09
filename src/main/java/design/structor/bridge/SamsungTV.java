package design.structor.bridge;

/**
 * Created by jianweilin on 2017/9/6.
 */
public class SamsungTV implements ITV {
    @Override
    public void on() {
        System.out.println("SamsungTV ON");
    }

    @Override
    public void off() {
        System.out.println("SamsungTV off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("SamsungTV channel 1");
    }
}
