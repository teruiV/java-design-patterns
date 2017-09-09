package design.structor.adapter;

/**
 * 模式: 适配模式
 * Created by jianweilin on 2017/9/5.
 */
public class AdpterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","linda.mp3");
        audioPlayer.play("mp4","linda.mp4");
        audioPlayer.play("vlc","linda.vlc");
        audioPlayer.play("avi","linda.avi");
    }
}
