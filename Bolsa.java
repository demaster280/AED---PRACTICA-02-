package practicagenericidad;
//Libreria que implementa una lista dinámica que ayuda a cambiar de tamaño
import java.util.ArrayList; 
//Libreria para poder recorrer una colección de elementos
import java.util.Iterator; 
//Clase genérica Bolsa con parámetro "T"
public class Bolsa < T > implements Iterable < T > { 
        //"lista" es una instancia de ArrayList vacío con el tipo de parámetro "T"
	private ArrayList < T > lista = new ArrayList < T > (0); 
        //Tope: Tamaño máximo de la bolsa
	private int tope; 
	//Constructor
	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}
        //Agrega un objeto "T" a la bolsa 
        public void add(T objeto) {
                //si el tamaño actual de la bolsa es menor que el tamaño máximo "tope"
		if (lista.size() < tope) { 
		    lista.add(objeto);
		} else {
                    //Bolsa llena: el método lanza una excepción: No caben mas
                    throw new RuntimeException("no caben mas");
		}
	}	
        //Devuelve un objeto Iterator que permite recorrer los elementos de la bolsa en un bucle "for-each"
        @Override
	public Iterator < T > iterator() {
		return lista.iterator();
	}
}



