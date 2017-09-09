package design.structor.adapter;

/**
 * Created by jianweilin on 2017/9/5.
 */
public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("playVLC");
    }

    @Override
    public void playMP4(String fileName) {
        // do nothing
    }
}
