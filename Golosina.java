package practicagenericidad;

import java.util.Objects;

public class Golosina {
	private String nombre;
	private double peso; 
	//Constructor
	public Golosina(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}
	//setters y getters
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
        }
	 public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Golosina golosina = (Golosina) o;
	        return peso == golosina.peso && Objects.equals(nombre, golosina.nombre);
	    }
	    public int hashCode() {
	        return Objects.hash(nombre, peso);
	    }
}

