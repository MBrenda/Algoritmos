package BusquedaLineal;

import java.util.Scanner;

/**
 * Recorrer una lista en forma secuencial y comparar cada elemento de la serie con el valor deseado hasta encontrarlo
 */
public class BusquedaLineal {

    public static void main(String args[]){

        int i, n, numeroBuscado, A[];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuántos numeros tendrá el array?: ");
        n = entrada.nextInt();
        A = new int[n];

        System.out.println("Qué" + n + "numeros tendrá el array?: ");

        for( i = 0; i < n; i++)
            A[i] = entrada.nextInt();

        System.out.println("Cuál desea encontrar?: ");
        numeroBuscado =  entrada.nextInt();

        for( i = 0; i < n; i++) {
            A[i] = entrada.nextInt();
                if(A[i] == numeroBuscado){

                    System.out.println(numeroBuscado + " Está en la posicion " + (i + 1) + ".");
                    break;

                }
                if(i == n){
                    System.out.println(numeroBuscado + " no esta presente ");
                }
        }

       /* La logica seria la siguiente si recorriendo el vector en alguna posicion encuentra el numero N buscado
           retorna la posicion
           si no sale
       for (int i = 0; i < vector.length; i++){
            if(vector[i] == N){
                return i;
            }
            return -1;
        }*/
    }
}
