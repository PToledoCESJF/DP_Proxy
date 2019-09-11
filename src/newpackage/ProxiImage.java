package newpackage;

/**
 *
 * @author ptol1
 */
public class ProxiImage {
    private String filename;
    private RealImage image;

    public ProxiImage(String filename) {
        this.filename = filename;
    }
    
    public void displayImage(){
        if(image == null){
            image = new RealImage(filename);
        }
        image.displayImage();
    }
}
