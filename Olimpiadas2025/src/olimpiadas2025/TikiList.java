import java.util.ArrayList;
import java.util.List;

/**
 * TikiList:
 *  - add(Object o): agrega al final.
 *  - add(int index, Object o): inserta en la posición indicada (0 = primer elemento).
 *  - get(int index): retorna el elemento en index.
 *  - remove(int index): elimina y retorna el elemento en index.
 *  - size(): número de elementos.
 *
 * Las posiciones comienzan desde cero.
 */
public class TikiList {

    private final List<Object> datos = new ArrayList<>();

    public boolean add(Object o) {
        return datos.add(o);
    }

    public void add(int index, Object o) {
        // permite insertar en [0..size]
        if (index < 0 || index > datos.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
        datos.add(index, o);
    }

    public Object get(int index) {
        return datos.get(index); // lanza IndexOutOfBoundsException si corresponde
    }

    public Object remove(int index) {
        return datos.remove(index); // lanza IndexOutOfBoundsException si corresponde
    }

    public int size() {
        return datos.size();
    }
}

