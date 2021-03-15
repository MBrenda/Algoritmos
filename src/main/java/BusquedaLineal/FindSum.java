package BusquedaLineal;

import java.util.HashSet;

/**
 * Dada una lista de numeros y un numero k, devolver si la suma de esos dos suman k
 *
 * Calculamos el resto para obtener k y revisamos en un hashSet si ese numero que falta lo tenemos
 * si el numero esta devovlemos true, si no está lo agregamos como un numero ya visto.
 *
 * El tiempo de ejecución es mejor que hacer dos arrays y reiterar sobre ambos
 */
public class FindSum {

    public static void main(String[] args) {

        int array[]= {10,5,6,3};
        findSum(array, 15);
    }

    public static boolean findSum(int[] numbers, int k){
        //guardo en un hash los numeros vistos
        HashSet<Integer> numVistos = new HashSet<>();
        for (int i = 0; i < numbers.length; i++){
            //para luego solo calcular el resto
            int resto = k - numbers[i];
            if(numVistos.contains(resto)){
                System.out.println("num: " + resto);
                System.out.println("num: " + numbers[i]);
                System.out.println("Total: " + k);
                return true;
            }
            numVistos.add(numbers[i]);
        }
        System.out.println("No hubo coincidencias");
        return false;
    }
}
