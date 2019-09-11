package proxy_dao;

import com.sun.corba.se.spi.ior.Identifiable;

/**
 *
 * @author ptol1
 */
public interface iDAO {
    public Identifiable recuperar (int id);
    public void excluir(int id);
    public void salvar(Identifiable obj);
}
