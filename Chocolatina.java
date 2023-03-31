package practicagenericidad;

import java.util.Objects;

public class Chocolatina {
    private String marca;
     private int unidades; 
    //Constructor
    public Chocolatina(String marca) { 
        this.marca = marca; 
        this.unidades = unidades;
    }

    Chocolatina(String hersheys, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //setters y getters
    public String getMarca() { 
        return marca; 
    }
    public void setMarca(String marca) { 
        this.marca = marca; 
        } 
    public int getUnidades() { // método público "getUnidades" que devuelve el valor del atributo "unidades"
        return unidades;
    }

    public void setUnidades(int unidades) { // método público "setUnidades" que establece el valor del atributo "unidades"
        this.unidades = unidades;
    }

    @Override
    public boolean equals(Object o) { // método público "equals" que compara si dos objetos Chocolatina son iguales en base a sus atributos
        if (this == o) return true; // si los objetos son iguales en memoria, devuelve true
        if (o == null || getClass() != o.getClass()) return false; // si el objeto pasado como parámetro es null o no es de la clase Chocolatina, devuelve false
        Chocolatina that = (Chocolatina) o; // convierte el objeto pasado como parámetro en un objeto Chocolatina
        return unidades == that.unidades && Objects.equals(marca, that.marca); // devuelve true si los atributos "unidades" y "marca" son iguales en ambos objetos Chocolatina
    }

    @Override
    public int hashCode() { // método público "hashCode" que devuelve un valor numérico que representa al objeto
        return Objects.hash(marca, unidades); // devuelve un valor hash basado en los valores de los atributos "marca" y "unidades"
    }
}





