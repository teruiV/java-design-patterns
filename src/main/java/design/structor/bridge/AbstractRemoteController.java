package design.structor.bridge;

/**
 * Created by jianweilin on 2017/9/6.
 */
public abstract class AbstractRemoteController {
    private ITV tv;

    public AbstractRemoteController(ITV tv) {
        this.tv = tv;
    }

    public void turnOn(){
        tv.on();
    }

    public void turnOff(){
        tv.off();
    }

    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}
