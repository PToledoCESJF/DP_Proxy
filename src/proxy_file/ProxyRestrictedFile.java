package proxy_file;

/**
 *
 * @author ptol1
 */
public class ProxyRestrictedFile implements iFile {

    private String filename;
    private String pass;
    private RealFile file;

    public ProxyRestrictedFile(String filename, String pass) {
            this.filename = filename;
            this.pass = pass;
    }

    @Override
    public void displayFile() {
        if(pass.equals("root")){
            if (file == null) {
                file = new RealFile(filename);
            }
            file.displayFile();
        }else{
            System.out.println("Você não tem acesso a esse arquivo.");
        }
    }

}
