package proxy;

/**
 *
 * @author ptol1
 */
public class ProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComponenteProxy objCompProxy = new ComponenteProxy("root", "root");
        objCompProxy.ExecutarFuncao2();
        objCompProxy.objComponente.ExecutarFuncao();
    }
    
}
