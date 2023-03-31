package practicagenericidad;
import java.util.ArrayList;
/*
//PREGUNTA NUMERO CUATRO
public class Cajoneria {
    private ArrayList<Caja<Object>> cajas;
    // Constructor
    public Cajoneria() {
        cajas = new ArrayList<>();
    }
    // Método: Agrega una caja a cajoneria
    public void addCaja(Caja<Object> caja) {
        cajas.add(caja);
    }
    //Busca: objectos en las cajas de la cajoneria
    public String[] search(Object objeto) {
        for (int i = 0; i < cajas.size(); i++) {
            Caja<Object> caja = cajas.get(i);
            if (caja.contains(objeto)) {
                //retorna ubicacion (Posicion y color) donde encontro objecto
                return new String[]{i + ", " + caja.getColor(), objeto.toString()};
            }
        }
        //retorna null , no encontro objecto
        return null;
    }

    // Eliminar: Elimina un objeto de una de las cajas de la cajoneria
    public Object delete(Object objeto) {
        for (Caja<Object> caja : cajas) {
            Object eliminado = caja.remove(objeto);
            if (eliminado != null) {
                //retorna objecto eliminado
                return eliminado;
            }
        }
        //retorna null , no encontro objecto
        return null;
    }    

    // Método ToString: devuelva la cadena con los datos de los objetos guardados en las cajas de la cajoneria
     public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cajas.size(); i++) {
            Caja<Object> caja = cajas.get(i);
            sb.append(i + 1).append(", ").append(caja.getColor()).append(": ");
            sb.append(caja.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    
}
*/
/*
//PREGUNTA NUMERO CINCO
public class Cajoneria<T extends Golosina> {
    private ArrayList<T> cajas;
    public Cajoneria() {
        this.cajas = new ArrayList<>();
    }
    public void add(T golosina) {
        this.cajas.add(golosina);
    }
    public boolean existsByName(String nombre) {
        for (T golosina : cajas) {
            if (golosina.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    public boolean existsByWeight(double peso) {
        for (T golosina : cajas) {
            if (golosina.getPeso() == peso) {
                return true;
            }
        }
        return false;
    }
    public void delete(T golosina) {
        this.cajas.remove(golosina);
    }
    public static void main(String[] args) {
        Cajoneria<Golosina> cajoneria = new Cajoneria<>();
        Golosina g1 = new Golosina("Chicle", 0.5);
        Golosina g2 = new Golosina("Caramelo", 0.2);
        Golosina g3 = new Golosina("Gomita", 0.3);
        Golosina g4 = new Golosina("Chocolate", 1.0);
        Golosina g5 = new Golosina("Paleta", 0.8);
        cajoneria.add(g1);
        cajoneria.add(g2);
        cajoneria.add(g3);
        cajoneria.add(g4);
        cajoneria.add(g5);
        // true
        System.out.println(cajoneria.existsByName("Chicle")); 
        // true
        System.out.println(cajoneria.existsByWeight(0.3)); 
        cajoneria.delete(g4);
         // false   
        System.out.println(cajoneria.existsByName("Chocolate")); 
    } 
}
*/

public class Cajoneria<T> {
    private T[] cajas;
    public Cajoneria(int n) {
        cajas = (T[]) new Object[n];
    }
    public T getCaja(int i) {
        return cajas[i];
    }
    public void setCaja(int i, T caja) {
        cajas[i] = caja;
    }
    public void delete(int i) {
        cajas[i] = null;
    }
    public boolean existe(T elem) {
        for (T c : cajas) {
            if (c != null && c.equals(elem)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Cajoneria<Chocolatina> cajoneria = new Cajoneria<>(5);
        Chocolatina c1 = new Chocolatina("Hershey's", 10);
        Chocolatina c2 = new Chocolatina("Milka", 8);
        Chocolatina c3 = new Chocolatina("Lindt", 12);
        Chocolatina c4 = new Chocolatina("Nestle", 6);
        Chocolatina c5 = new Chocolatina("Godiva", 4);
        cajoneria.setCaja(0, c1);
        cajoneria.setCaja(1, c2);
        cajoneria.setCaja(2, c3);
        cajoneria.setCaja(3, c4);
        cajoneria.setCaja(4, c5);
        // true
        System.out.println(cajoneria.existe(c1)); 
        // true
        System.out.println(cajoneria.existe(new Chocolatina("Hershey's", 10))); 
        // false
        System.out.println(cajoneria.existe(new Chocolatina("Hershey's", 5)));       
        cajoneria.delete(2);
        System.out.println(cajoneria.existe(c3)); // false
    }
}

