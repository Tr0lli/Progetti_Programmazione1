import java.util.Scanner;

public class Esercizio7_2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String casuale = Metodi7_2.estraiStringaCasuale();
        // System.out.println(casuale);
        char[] caratteri = new char[casuale.length()];
        for (int i=0; i<casuale.length(); i++){
            caratteri[i] = casuale.charAt(i);
        }
        System.out.println("Indovina la parola: (hai 20 tentativi)");
        System.out.println("Scrivi un carattere per volta");
        boolean variabile=true;
        char[] parolaFinale = new char[casuale.length()];
        int h, g=0;
        do {
            String stringaUtente = sc.next();
            if (stringaUtente.length()==1){
                char carattereUtente = stringaUtente.charAt(0);
                for (int j= 0; j<caratteri.length; j++){
                    if (carattereUtente==caratteri[j]||parolaFinale[j]!=0){
                        System.out.print(caratteri[j]);
                        parolaFinale[j] = caratteri[j];
                    } else {
                        System.out.print("-");
                    }
                }

            } else {
                System.out.println("Errore scrivi un solo carattere");
            }
            System.out.println();
            String parola = "";
            for (h=0; h<casuale.length(); h++){
                parola = parola + parolaFinale[h];
            }
            if (parola.equals(casuale)){
                variabile = false;
                System.out.println("Hai VINTO!!!");
            }
            
            g++;
        } while (g<20&&variabile);
        

    } 
}
