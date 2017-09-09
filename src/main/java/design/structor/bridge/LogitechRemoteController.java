package design.structor.bridge;

/**
 * Created by jianweilin on 2017/9/6.
 */
public class LogitechRemoteController extends AbstractRemoteController {
    public LogitechRemoteController(ITV tv) {
        super(tv);
    }

    public void setChannelKeyBoard(int channel){
        setChannel(channel);
        System.out.println("Logitech use keyboard choose channel 1");
    }
}
