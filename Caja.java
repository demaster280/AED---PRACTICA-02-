
package practicagenericidad;
import java.util.ArrayList;
import java.util.Iterator;
public class Caja<T> {
    private String color;
    private ArrayList<T> contenido;
    // Constructor y incialisacion de la lista contenido
    public Caja(String color) {
        this.color = color;
        contenido = new ArrayList<>();
    }
    // getter
    public String getColor() {
        return color;
    }
    // Agregar : añade un objecto a la lista 'contenido'
    public void add(T objeto) {
        contenido.add(objeto);
    }
    // Eliminar: elimina un objecto
    public T remove(T objeto) {
        int index = contenido.indexOf(objeto);
        if (index >= 0) {
            //devuelve objecto eliminado
            return contenido.remove(index);
        } else {
            //retorna null si no encuentra nada
            return null;
        }
    }
    // Verificacion: Verifica si el objecto se encuentra en la lista
    public boolean contains(T objeto) {
        //retorna True : objecto encontrado
        //retorna False: objecto no encontrado
        return contenido.contains(objeto);
    }
    // Método toString: Mostrar contendio segun el contenido
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caja de color ").append(color).append(": [");
        for (T objeto : contenido) {
            sb.append(objeto.toString()).append(", ");
        }
        if (contenido.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }
}

