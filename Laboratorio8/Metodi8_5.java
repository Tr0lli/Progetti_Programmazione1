public class Metodi8_5 {
    public static int MCD(int x, int y){
        int ris;
        if (x == y){
            return x;
        } else if (x<y){
            return MCD(y, x);
        } else if (x>y){
            return MCD(x - y, y);
        } 
        return -1;
    }
}
