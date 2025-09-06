import java.util.HashMap;
import java.util.Map;

/**
 * RappiMapa:
 *  - limpia(): elimina todos los objetos del mapa.
 *  - contieneClave(String clave): true si existe la clave.
 *  - obtener(String clave): retorna el objeto asociado a la clave.
 *  - agregar(String clave, Object o): asocia clave -> objeto (reemplaza si existe).
 *  - eliminar(String clave): elimina y retorna el objeto asociado a la clave.
 *  - obtenerObjetos(): retorna una TikiList con todos los objetos del mapa.
 */
public class RappiMapa {

    private final Map<String, Object> mapa = new HashMap<>();

    public void limpia() {
        mapa.clear();
    }

    public boolean contieneClave(String clave) {
        return mapa.containsKey(clave);
    }

    public Object obtener(String clave) {
        return mapa.get(clave);
    }

    public void agregar(String clave, Object o) {
        mapa.put(clave, o);
    }

    public Object eliminar(String clave) {
        return mapa.remove(clave);
    }

    public TikiList obtenerObjetos() {
        TikiList lista = new TikiList();
        for (Object o : mapa.values()) {
            lista.add(o);
        }
        return lista;
    }
}

