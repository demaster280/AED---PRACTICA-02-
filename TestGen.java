
package practicagenericidad;
public class TestGen {
    // Método genérico: Ayuda a buscar un elemento en un arreglo
    public static <T> boolean exist(T[] array, T elem) {
        // Recorrido del arreglo
        for (T e : array) { 
            if (e.equals(elem)) { 
                //Elemento encontrado : retorna true
                return true; 
            }
        }
        //Elemento no encontrado: retorna False
        return false; 
    }

    public static void main(String[] args) {
        
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};
        // Devuelve true
        System.out.println(exist(v, "Sanchez")); 
        // Devuelve true
        System.out.println(exist(w, 34)); // Devuelve true
        // Prror de compilacion
        System.out.println(exist(w, "Salas")); 
    }
}


