package proxy_file;

/**
 *
 * @author ptol1
 */
public class RealFile implements iFile{
    
    private String filename;

    public RealFile(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }
    
    private void loadImageFromDisk() {
        System.out.println("Loading " + filename);
    }
    
    @Override
    public void displayFile() {
        System.out.println("Displaying " + filename);
    }

}
