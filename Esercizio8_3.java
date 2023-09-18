import java.util.Scanner;

public class Esercizio8_3 {
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        int riga, colonna;
        System.out.println("Scrivi di quante righe e colonne vuoi che sia formato l'array");
        riga = sc.nextInt();
        colonna = sc.nextInt();
        int[] array = Metodi8_3.creaMatrice(riga, colonna);

        System.out.println("Ora scrivi il numero che vuoi inserire nella Matrice");
        int elemento = sc.nextInt();
        System.out.println("Scrivi dove voui inserire il tuo elemento nella Matrice");
        int i = sc.nextInt();
        int j = sc.nextInt();
        Metodi8_3.scriviElemento(array, riga, colonna, i, j, elemento);
        /*for (int x=0; x<riga*colonna; x++){
            System.out.print(array[x] + " ");
        } System.out.println(); */
        System.out.println("Scrivi dove voui leggere l'elemento nella Matrice");
        int k = sc.nextInt();
        int l = sc.nextInt();
        Metodi8_3.leggiElemento(array, riga, colonna, k, l);

        Metodi8_3.stampaMatrice(array, riga, colonna);

    }
}
