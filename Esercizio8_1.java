import java.util.Scanner;

public class Esercizio8_1 {
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        boolean si = false;
        int numeroElementi;
        do {
            System.out.println("Scrivi di quanto vuoi che sia lungo l'array (Massimo 100)");
            numeroElementi = sc.nextInt();
            if (100<numeroElementi || 1>numeroElementi){
                System.out.println("Errore minimo 1 e massimo 100");
                continua = true;
            } else {
                continua = false;
            }
        } while (continua);
        
        int[] array = Metodi8_1.creaArray(numeroElementi);
        
        do {
            System.out.println("Scrivi l'elemento che vuoi verificare");
            int elemento = sc.nextInt();
            boolean numeroPresente = Metodi8_1.aggiungiElemento(array, numeroElementi, elemento);
            System.out.println(numeroPresente); 
            
            for (int i=0; i<numeroElementi; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();

            System.out.println("Scrivi l'elemento che vuoi rimuovere");
            int nonElemento = sc.nextInt();
            boolean numeroRimosso = Metodi8_1.rimuoviElemento(array, numeroElementi, nonElemento);
            System.out.println(numeroRimosso); 

            for (int i=0; i<numeroElementi; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            
            System.out.println("Vuoi continuare?");
            String siNo = sc.next();
            
            if (siNo.equalsIgnoreCase("si")){
                si = true;
            } else {
                si = false;
            }
        } while (si);
       
    }
}



