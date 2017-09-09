package design.structor.adapter;

/**
 * Created by jianweilin on 2017/9/5.
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String auditType) {
        if(auditType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VLCPlayer();
        } else if (auditType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String auditType, String fileName) {
        if(auditType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVLC(fileName);
        } else if (auditType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMP4(fileName);
        }
    }
}
