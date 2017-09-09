package design.structor.proxy;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName + "from Disk");
    }
    @Override
    public void display() {
        System.out.println("Displaying " + fileName + "\n");
    }
}
