import java.util.Scanner;

public class Esercizio3_6 {
    public static void main(String Arg[]){
        Scanner tastiera = new Scanner(System.in);
        String risposta = "";
        int numero1, numero2;
        boolean continuaCiclo = true;
        
        while (continuaCiclo){
            System.out.println("Scegli un opzione: ");
            System.out.println("+ per sommare");
            System.out.println("- per sottrarre");
            System.out.println("* per moltiplicare");
            System.out.println("/ per dividere");
            System.out.println("u per uscire dal programma");
    
            risposta = tastiera.next();
            if (risposta.equals("u")){
                continuaCiclo = false;
            }
            else if (risposta.equals("+")){
                System.out.println("Scrivi i numeri da sommare: ");
                numero1 = tastiera.nextInt();
                numero2 = tastiera.nextInt();
                System.out.println("Ecco la somma: "+ (numero1 + numero2));
            }
            else if (risposta.equals("-")){
                System.out.println("Scrivi i numeri da sottrarre: ");
                numero1 = tastiera.nextInt();
                numero2 = tastiera.nextInt();
                System.out.println("Ecco la sottrazione: "+ (numero1 - numero2));
            }
            else if (risposta.equals("*")){
                System.out.println("Scrivi i numeri da moltiplicare: ");
                numero1 = tastiera.nextInt();
                numero2 = tastiera.nextInt();
                System.out.println("Ecco la moltiplicazione: "+ (numero1 * numero2));
            }
            else if (risposta.equals("/")){
                System.out.println("Scrivi i numeri da dividere: ");
                Double divisione1 = tastiera.nextDouble();
                Double divisione2 = tastiera.nextDouble();
                if (divisione2 == 0.0 ){
                    System.out.println("Non puoi dividere per 0");
                }
                else 
                System.out.println("Ecco la sottrazione: "+ (divisione1 / divisione2));
            }
            else{
                System.out.println("Errore carattere non trovato riprova");
            }
        }
    }
}
