public class Metodi8_1 {

    public static int[] creaArray(int numeroElementi){
        int[] creaArray = new int[numeroElementi];
        return creaArray;
    }

    public static boolean aggiungiElemento(int[] array,int numeroElementi,int elemento){
        boolean presente = false, ugugale = true;
        for (int i=0; i<numeroElementi; i++){
            if (array[i] == elemento){
                ugugale = false;
            } else if (ugugale&&array[i]==0){
                array[i] = elemento;
                ugugale = false;
                presente = true;
            }
        }
        return presente;
    }

    public static boolean rimuoviElemento(int[] array, int numeroElementi, int elemento){
        boolean rimosso = false;
        for (int i=0; i<numeroElementi; i++){
          if (array[i] == elemento){
              rimosso = true;
          } else if (rimosso){
              array[i-1] = array[i];
          }
        }
        return rimosso;
    }
    
}
