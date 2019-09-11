package proxy_dao;

import com.sun.corba.se.spi.ior.Identifiable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ptol1
 */
public class CacheDAO implements iDAO{
    
    private iDAO dao;
    private Map<Integer, Identifiable> cache;

    public CacheDAO(iDAO dao) {
        this.dao = dao;
        this.cache = new HashMap<>();
    }
    
    @Override
    public Identifiable recuperar(int id) {
        if(cache.containsKey(id)){
            return cache.get(id);
        }
        Identifiable obj = dao.recuperar(id);
        cache.put(id, obj);
        return obj;
    }

    @Override
    public void excluir(int id) {
        dao.excluir(id);
        cache.remove(id);
    }

    @Override
    public void salvar(Identifiable obj) {
        dao.salvar(obj);
        cache.put(obj.getId(), obj);
    }
}
