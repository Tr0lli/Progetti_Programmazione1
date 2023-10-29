import java.util.Scanner;

public class Esercizio8_6{
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuoi iniziare te o il computer?");
        String primoGiocatore = sc.next();
        boolean primaIo = false;
        char[][] tabella = new char[3][3];
        if (primoGiocatore.equalsIgnoreCase("io")){
            primaIo = true;
        } 
        Metodi8_6.creaNuovaConfigurazione(tabella);
        int verificaVittoria = 2;
        /*if (primaIo){
            //Mossa Utente
            Metodi8_6.mossaUtente(tabella);
            //Metodi8_6.stampaConfigurazioneDiGioco(tabella);
        } */

        do {
            //mossa Computer e poi utente
            if (primaIo){
                Metodi8_6.mossaUtente(tabella);
            }
            if (verificaVittoria==2){
                Metodi8_6.mossaComputer(tabella);
            }
            Metodi8_6.stampaConfigurazioneDiGioco(tabella);
            //Metodi8_6.stampaConfigurazioneDiGioco(tabella);
            primaIo = true;
            //controllo da metodo verificaVittoria
            verificaVittoria = Metodi8_6.verificaVittoria(tabella);
        } while (verificaVittoria==2);
        if (verificaVittoria==1){
            System.out.println("Hai vinto!!");
        } else if (verificaVittoria==-1){
            System.out.println("Ha vinto il Computer!");
        } else if (verificaVittoria==0){
            System.out.println("Non ha vinto nessuno");
        }

        //System.out.println(verificaVittoria);
    }
}