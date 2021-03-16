package BusquedaBinaria;

public class BinarySearch {

    public static void main(String[] args) {

        int array[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        binarySearch(array, 6);
    }

    public static int binarySearch(int[] A, int N){

        int valorMasBajoPosible = 0;
        int valorMasAltoPosible = A.length -1 ;

        while(valorMasAltoPosible >= valorMasBajoPosible){
            int middle = (valorMasAltoPosible + valorMasBajoPosible ) / 2;
            if(A[middle] == N ){
                System.out.println("Numero a encontrar: " + N + " esta en la posicion: " + middle);
                return middle; //N is in the middle
            }
            else if (A[middle] > N) {
                System.out.println("valorMasAltoPosible: " + valorMasAltoPosible);
                valorMasAltoPosible = middle - 1; //delete positions >= middle
            }
            else {
                System.out.println("valorMasBajoPosible: " + valorMasBajoPosible);
                valorMasBajoPosible = middle + 1 ; // delete positions <= middle
            }
        }
        //en este punto N no esta en la serie
        return - 1;
    }

}
