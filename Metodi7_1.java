public class Metodi7_1 {
    public static int estraiNumerocasuale(){
        int numeroCasuale = (int)(Math.random()*100+1);
        return numeroCasuale;
    }

    public static int confrontaNumeri(int n, int nCasuale){
        int maggioreMiniore = 2;
        if (n==nCasuale){
            System.out.println("Hai indovinato il numero");
            maggioreMiniore = 0;
        } else if (n>nCasuale){
            maggioreMiniore = 1;
        } else if (n<nCasuale){
            maggioreMiniore = -1;
        }
        return maggioreMiniore;
    }
}
