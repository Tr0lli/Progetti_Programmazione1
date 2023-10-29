import java.util.Scanner;

public class Esercizio8_5 {
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Scrivi i valori per fare il MCD");
        do{
            System.out.println("Devono essere positivi");
            a = sc.nextInt();
            b = sc.nextInt();
        } while (a<0 || b<0);
        
        int risultato = Metodi8_5.MCD(a, b);
        System.out.println("Il Massimo comun divisore è "+ risultato);
    }
}
