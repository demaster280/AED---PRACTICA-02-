package practicagenericidad;
public class DemoMetodoGenerico {
    //Método genérico
    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        //Longitudes de los array son diferentes,significa que los arrays son diferentes 
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            //verifica si son diferentes
            if (!x[i].equals(y[i])) {
                return false;
            }
        }
        //array iguales
        return true;
    }    
    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};
        if (igualArrays(nums, nums)) {
            System.out.println("nums es igual a nums");
        }
        if (igualArrays(nums, nums2)) {
            System.out.println("nums es igual a nums2");
        }
        if (igualArrays(nums, nums3)) {
            System.out.println("nums es igual a num3");
        }
        if (igualArrays(nums, nums4)) {
            System.out.println("nums es igual a nums4");
        }        
        Double dvals[] = {1.1, 2.1, 3.1, 4.1, 5.1}; 
        Double dvals2[] = {1.1, 2.1, 3.1, 4.1, 5.1}; 
        //Prueba el método igualArrays
        if (igualArrays(dvals, dvals2)) { //B
            System.out.println("nums es igual a dvals"); //C
        }
    }
}