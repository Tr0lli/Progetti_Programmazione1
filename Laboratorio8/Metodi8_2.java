public class Metodi8_2 {
    
    public static int[][] creaMondo(){
        int[][] creaMondo = new int[20][20];
        for (int i=0; i<20; i++){
            for (int j=0; j<20; j++){
                creaMondo[i][j] = 0;
            }
        }
        return creaMondo;
    }
    
    public static boolean aggiungiObbiettivo(int[][] mondo, int riga, int colonna){
        boolean libero = false;
        if (riga>20||riga<1||colonna>20||colonna<1){
            libero = false;
        } else if (mondo[riga-1][colonna-1]==0){
            libero = true;
            mondo[riga-1][colonna-1] = 1;
        }
        return libero;
    }

    public static void aggiungiOstacolo(int[][] mondo){
        int random_i = (int)(Math.random()*10);
        int random_j = (int)(Math.random()*10);
        do {
            random_i = (int)(Math.random()*20);
            random_j = (int)(Math.random()*20);
            if (mondo[random_i][random_j]==0){
                mondo[random_i][random_j] = 2;
            }

        } while (mondo[random_i][random_j]!=2);
    }

    public static int aggiungiPosizioneRobot(int[][] mondo, String percorso){
        int risultato = 0;
        int riga = 0, colonna = 0;
        int i = 0;
        if (mondo[riga][colonna]==0){
            risultato = 0;
            mondo[riga][colonna] = 3;
        } else if (mondo[riga][colonna]==1){
            risultato = 1;
            i = percorso.length();
        } else if (mondo[riga][colonna]==2){
            risultato = 2;
            i = percorso.length();
        } 

        while ( i<percorso.length()){
            char carattere = percorso.charAt(i);
            
            if (carattere=='s'){
                riga += 1;
            } else if (carattere=='n'){
                riga -= 1;
            } else if (carattere=='e'){
                colonna += 1;
            } else if (carattere=='o'){
                colonna -= 1;
            } else {
                System.out.println("Scrivi solo s, e, n, o");
            }
            if (riga<0||riga>19||colonna<0||colonna>19){
                risultato = 3;
                i = percorso.length();
            } else if (mondo[riga][colonna]==0){
                risultato = 0;
                mondo[riga][colonna] = 3;
            } else if (mondo[riga][colonna]==1){
                risultato = 1;
                i = percorso.length();
            } else if (mondo[riga][colonna]==2){
                risultato = 2;
                i = percorso.length();
            } 
            i++;
        }
        return risultato;
    }

    public static void stampaMondo(int[][] mondo){
        for (int c=0; c<22; c++){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0; i<20; i++){
            System.out.print("*");
            for (int j=0; j<20; j++){
                if (mondo[i][j]==0){
                    System.out.print(" ");
                } else  if (mondo[i][j]==1){
                    System.out.print("X");
                } else  if (mondo[i][j]==2){
                    System.out.print("#");
                } else  if (mondo[i][j]==3){
                    System.out.print("o");
                }
            }
            System.out.println("*");
        }
        for (int c=0; c<22; c++){
            System.out.print("*");
        }
        System.out.println();
    }
}