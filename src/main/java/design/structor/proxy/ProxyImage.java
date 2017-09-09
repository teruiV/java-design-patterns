package design.structor.proxy;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if( realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
