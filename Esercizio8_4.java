import java.util.Scanner;

public class Esercizio8_4 {
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi i sue numeri con cui fare la somma ricorsiva");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>=0&&b>=0){
            int somma = Metodi8_4.somma(a, b);
            System.out.println(somma);
        }
        
    }
}
