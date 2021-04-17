package InserciónOrdenada;

/**
 * Suponiendo que la lista esta ordenada se desea insertar un elemento en la posicion correcta.
 */
public class OrderInsert {

    public static void main(String[] args) {

        int itemsInArray = 6;
        int A[] = new int[itemsInArray];
        insert(A, itemsInArray, 7);
    }



    public static void insert(int[] A, int itemsInArray, int newItem){
        // suponemos que A tiene los ItemsInArray ordenados
        // añadir newItem donde corresponda
       // for(int i = 0; i < A.length ; i++){

      //  }
        int loc = itemsInArray - 1 ;
        while( loc >= 0 && A[loc] > newItem){
            A[loc + 1] = A[loc];
            loc = loc -1 ;
        }
        A[loc + 1 ] = newItem; //Pone el nuevo elemento en el hueco
    }
}
