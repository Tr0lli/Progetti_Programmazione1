public class Metodi8_4 {
    public static int somma(int a, int b){
        if (b<=0){
        } else {
            //a = a + 1;
            //System.out.println(a +" "+ b);
            a = somma(a + 1, b - 1);
        }

        return a;
    }
}
