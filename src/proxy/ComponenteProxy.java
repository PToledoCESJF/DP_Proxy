package proxy;

/**
 *
 * @author ptol1
 */
public class ComponenteProxy implements iComponente{
    
    public Componente objComponente;

    public ComponenteProxy(String nome, String senha) {
        if(nome.equals("root") && senha.equals("root")){
            objComponente = new Componente();
        }
    }

    @Override
    public void ExecutarFuncao2() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
