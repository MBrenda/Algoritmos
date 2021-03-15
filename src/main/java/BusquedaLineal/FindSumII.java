package BusquedaLineal;

/**
 * Dada una lista de numeros y un numero k, devolver si la suma de esos dos suman k
 *
 * Si tuvieramos muchos elementos el costo de ejecucion sobre dos arrays es muy grande
 */
public class FindSumII {

    public static void main(String[] args) {

        int array[]= {10,5,6,3};
        findSum(array, 11);
    }

    private static boolean findSum(int[] array, int k) {

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if( i != j && (array[i] + array[j]) == k){
                    System.out.println("num: " + array[i] + " + num: " + array[j] + " = " + k);
                    return  true;
                }
            }
        }
        System.out.println("No hubieron valores que sumaran el total: " + k);
        return false;
    }
}
