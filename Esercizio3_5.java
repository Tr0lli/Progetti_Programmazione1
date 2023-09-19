import java.util.Scanner;

public class Esercizio3_5 {
    public static void main(String Arg[]){
        Scanner tastiera = new Scanner(System.in);

        String scelta1;
        String nuovaGiocata;
        boolean nuovaPartita = false;
        int random = 0;
        
        do {
            System.out.println("Bene, giochiamo!");
            System.out.println("Adesso il giocatore e il computer dovrà scegliere tra: carta, forbice e pietra");
            random = (int)(Math.random()*3);
            scelta1 = tastiera.next();
            
            boolean pietra1 = scelta1.equalsIgnoreCase("pietra");
            boolean carta1 = scelta1.equalsIgnoreCase("carta");
            boolean forbice1 = scelta1.equalsIgnoreCase("forbice");
            boolean pietra2 = random == 2;
            boolean carta2 = random == 1;
            boolean forbice2 = random == 0;

            if ((forbice1 && carta2) || (carta1 && pietra2) || (pietra1 && forbice2)){
                System.out.println("Ha vinto il giocatore");
                       }
            else if ((forbice2 && carta1) || (carta2 && pietra1) || (pietra2 && forbice1)){
                System.out.println("Ha vinto il computer");
            }
            else if ((forbice1 && forbice2) || (carta1 && carta2) || (pietra1 && pietra2)){
                System.out.println("La giocata è pari");
            }
            else if (!carta1 || !carta2 || !forbice1 || !forbice2 || !pietra1 || !pietra2) {
                System.out.println("Errore: le parole inserite non sono corrette");
            }
            System.out.println("Il computer ha giocato: "+ random);
            System.out.println("Volete giocare di nuovo? (rispondete si o no)");
            nuovaGiocata = tastiera.next();
            if (nuovaGiocata.equalsIgnoreCase("si")){
                nuovaPartita = true;
            }
            else {
                nuovaPartita = false;
            }

        }
        while (nuovaPartita);

    }
}
