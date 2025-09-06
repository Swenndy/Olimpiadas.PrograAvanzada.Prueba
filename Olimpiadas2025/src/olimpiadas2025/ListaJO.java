import java.util.ArrayList;
import java.util.List;

/**
 * ListaJO:
 *  - agregar(Object e): agrega al final.
 *  - tamaño(): número de objetos.
 *  - posicionar(int pos): coloca el cursor (0 es el primer elemento).
 *  - objetoActual(): retorna el objeto en la posición del cursor.
 *  - eliminar(): elimina y retorna el objeto en la posición del cursor.
 */
public class ListaJO {

    private final List<Object> datos = new ArrayList<>();
    private int cursor = -1; // -1 = sin posición actual

    public boolean agregar(Object e) {
        return datos.add(e);
    }

    public int tamaño() {
        return datos.size();
    }

    public void posicionar(int pos) {
        if (pos < 0 || pos >= datos.size()) {
            throw new IndexOutOfBoundsException("Posición fuera de rango: " + pos);
        }
        this.cursor = pos;
    }

    public Object objetoActual() {
        if (cursor < 0 || cursor >= datos.size()) {
            throw new IllegalStateException("No hay posición actual válida.");
        }
        return datos.get(cursor);
    }

    public Object eliminar() {
        if (cursor < 0 || cursor >= datos.size()) {
            throw new IllegalStateException("No hay posición actual válida para eliminar.");
        }
        Object eliminado = datos.remove(cursor);
        // Ajustar cursor: queda apuntando al mismo índice; si quedó al final, retrocede uno
        if (cursor == datos.size() && cursor > 0) {
            cursor--;
        }
        // Si la lista quedó vacía, sin posición actual
        if (datos.isEmpty()) {
            cursor = -1;
        }
        return eliminado;
    }
}

