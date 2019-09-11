package proxy_file;

/**
 *
 * @author ptol1
 */
public class Proxy_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        iFile file1 = new ProxyFile("Photo1");
//        iFile file2 = new ProxyFile("Photo2");

        iFile file1 = new RealFile("Photo1");
        iFile file2 = new RealFile("Photo2");

//        iFile file1 = new ProxyRestrictedFile("Arquivo1", "root");
//        iFile file2 = new ProxyRestrictedFile("Arquivo2", "root");
//        
        file1.displayFile();
        file2.displayFile();
        
    }
    
}
