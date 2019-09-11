package proxy_acesso_remoto;

import java.io.IOException;

/**
 *
 * @author ptol1
 */
public class TentativasRepetidas implements AcessoRemoto{
    private AcessoRemoto ar;
    private int maximoTentativas;

    public TentativasRepetidas(AcessoRemoto ar, int maximoTentativas) {
        this.ar = ar;
        this.maximoTentativas = maximoTentativas;
    }
    
    @Override
    public byte[] buscarArquivo(String url) throws IOException {
        int tentativas = 0;
        IOException ultimoErro = null;
        
        while(tentativas < maximoTentativas){
            try{
                return ar.buscarArquivo(url);
            }catch(IOException ex){
                tentativas++;
                ultimoErro = ex;
            }
        }
        throw ultimoErro;
    }
}
