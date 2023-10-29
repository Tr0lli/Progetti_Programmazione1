public class Metodi8_3 {
    public static int[] creaMatrice(int n, int m){
        int x = n * m;
        int[] matrice = new int[x];
        return matrice;
    }

    public static void scriviElemento(int[] array, int n, int m, int i, int j, int elemento ){
        int k=0;
        if (array.length==n*m){
            if (i>=0&&i<=n && j>=0&&j<=m ){
                for (int x=1; x<i; x++){
                    k += m;
                }
                k += j-1;
                array[k] = elemento;
            }else {
                System.out.println("Errore");
                System.exit(0);
            }
        }else {
            System.exit(0);
        }
    }

    public static void leggiElemento(int[] array, int n, int m, int i, int j ){
        int k=0;
        if (array.length==n*m){
            if (i>=0&&i<=n && j>=0&&j<=m ){
                for (int x=1; x<i; x++){
                    k += m;
                }
                k += j-1;
                System.out.println(array[k]);
            }else {
                System.out.println("Errore");
                System.exit(0);
            }
        }else {
            System.exit(0);
        }
    }

    public static void stampaMatrice(int[] array, int n, int m){
        int k = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(array[k] + " ");
                k++;
            }
            System.out.println();
        }
    }
}
