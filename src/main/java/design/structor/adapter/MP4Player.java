package design.structor.adapter;

/**
 * Created by jianweilin on 2017/9/5.
 */
public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        //do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("play mp4 in" + fileName);
    }
}
