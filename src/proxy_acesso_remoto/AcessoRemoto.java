package proxy_acesso_remoto;

import java.io.IOException;

/**
 *
 * @author ptol1
 */
public interface AcessoRemoto {
    public byte[] buscarArquivo(String url) throws IOException;
}
