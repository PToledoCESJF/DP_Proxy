package proxy_file;

/**
 *
 * @author ptol1
 */
public class ProxyFile implements iFile{ 
    
    private String filename;
    private RealFile file;

    public ProxyFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayFile() {
        if(file == null){
            file = new RealFile(filename);
        }
        file.displayFile();
    }
    
}
