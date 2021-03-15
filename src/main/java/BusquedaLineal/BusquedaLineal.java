package BusquedaLineal;
import java.util.Scanner;

/**
 * Recorrer una lista en forma secuencial y comparar cada elemento de la serie con el valor deseado hasta encontrarlo
 */
public class BusquedaLineal {

        public static void main(String args[])
        {
            int c, n, search, array[];

            Scanner in = new Scanner(System.in);
            System.out.println("Numeros de elementos del array:");
            n = in.nextInt();
            array = new int[n];

            System.out.println("Escriba " + n + " enteros");

            for (c = 0; c < n; c++)
                array[c] = in.nextInt();

            System.out.println("Introducir valor para encontrar");
            search = in.nextInt();

            for (c = 0; c < n; c++)
            {
                if (array[c] == search)
                {
                    System.out.println(search + "Está presente " + (c + 1) + ".");
                    break;
                }
            }
            if (c == n)  /* Searching element is absent */
                System.out.println(search + " no es presente ");
        }
    }

