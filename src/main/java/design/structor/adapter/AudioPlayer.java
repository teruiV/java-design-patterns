package design.structor.adapter;

/**
 * Created by jianweilin on 2017/9/5.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String auditType, String fileName) {
       if(auditType.equalsIgnoreCase("mp3")) {
           System.out.println("playing mp3 file.name :" + fileName);
       }else if (auditType.equalsIgnoreCase("mp4") || auditType.equalsIgnoreCase("vlc")){
           mediaAdapter = new MediaAdapter(auditType);
           mediaAdapter.play(auditType,fileName);
       }else {
           System.out.println(String.format("invalid media %s format not support",auditType));
       }
    }
}
