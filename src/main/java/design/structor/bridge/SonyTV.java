package design.structor.bridge;

/**
 * Created by jianweilin on 2017/9/6.
 */
public class SonyTV implements ITV {
    @Override
    public void on() {
        System.out.println("SONY on");
    }

    @Override
    public void off() {
        System.out.println("SONY OFF");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("SONY CHANNEL 1");
    }
}
