

package practicagenericidad;
public class Principal { 
public static void main(String[] args) { 
    Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > (0); 
    Chocolatina c = new Chocolatina("milka"); 
    Chocolatina c1 = new Chocolatina("milka");
    Chocolatina c2 = new Chocolatina("ferrero"); 
    bolsaCho.add(c); 
    bolsaCho.add(c1);
    bolsaCho.add(c2); 
    for (Chocolatina chocolatina: bolsaCho) { 
        System.out.println(chocolatina.getMarca()); 
    } 
  } 
// Método genérico: Llena bolsa de golosinas
public static <T extends Golosina> void llenarBolsaGolosinas(Bolsa<T> bolsa) {
		T golosinaNueva1 = (T) new Golosina("pipas", 15);
		T golosinaNueva2 = (T) new Golosina("Nubes", 20);
		T golosinaNueva3 = (T) new Golosina("Moras", 25);
		T golosinaNueva4 = (T) new Golosina("Caramelos", 30);
		// Agrega golosinas
		bolsa.add(golosinaNueva1);
		bolsa.add(golosinaNueva2);
		bolsa.add(golosinaNueva3);
		bolsa.add(golosinaNueva4);
	}
}





