import java.util.Scanner;

public class Esercizio7_1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        boolean nuovaPartita = false;
        System.out.println("Indovina il numero");
        do {
            boolean  continua = true;
            int numeroCasuale = Metodi7_1.estraiNumerocasuale();
            int[] numUtente = new int[10];
            int maggioreMiniore, contatore = 0;
            int i;

            for ( i=0; i<10&&continua; i++){
                numUtente[i] = sc.nextInt();
                if (numUtente[i]>0 && numUtente[i]<101){
                maggioreMiniore = Metodi7_1.confrontaNumeri(numUtente[i], numeroCasuale);
                    
                if (maggioreMiniore==0&&continua){
                        contatore = i;
                        continua = false;
                } else if (maggioreMiniore==-1){
                        int minore = 0;
                        if (numUtente[i]>minore){
                            System.out.println("Il numero "+ numUtente[i] +" e' piu' piccolo di quello da indovinare");
                            minore = numUtente[i];
                        } else {
                            System.out.println("Hai inserito "+ numUtente[i] +", ma se ti avevo detto che è piu' grande di "+ minore);
                        }
                } else if (maggioreMiniore==1) {
                        int maggiore = 100;
                        if (numUtente[i]<maggiore){
                            System.out.println("Il numero "+ numUtente[i] +" e' piu' grande di quello da indovinare");
                            maggiore = numUtente[i];
                        } else {
                            System.out.println("Hai inserito "+ numUtente[i] +", ma se ti avevo detto che è piu' piccolo di "+ maggiore);
                        }
                }
                } else {
                    continua = false;
                }
            }        
            System.out.println(numeroCasuale);
            if (i<5){
                if (contatore > 0) {
                    System.out.println("Hai indovinato il numero al "+ contatore +" tentativo");
                } else {
                    System.out.println("Non hai mai indovinato");
                }
            } else {
                if (contatore - 4 > 0) {
                    System.out.println("Hai indovinato il numero al "+ (contatore) +" tentativo");
                } else {
                    System.out.println("Non hai mai indovinato");
                }
            }
            System.out.println("Vuoi giocare di nuovo?");
            String siNo = sc.next();
            if (siNo.equalsIgnoreCase("si")){
                nuovaPartita = true;
            } else {
                nuovaPartita = false;
            }
        } while (nuovaPartita);
    }
}
