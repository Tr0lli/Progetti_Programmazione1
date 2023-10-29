public class Esercizio8_2 {
    public static void main(String Arg[]){
        //System.out.println(Arg[0] + " " + Arg[1]); come stampare scritte dopo java ... 
        int[][] mondo = Metodi8_2.creaMondo();
        /* for (int i=0; i<20; i++){
            for (int j=0; j<20; j++){
                System.out.print(mondo[i][j]);
                // fare stessa cosa ma con if e a seconda di cosa c'è stampare caratteri chiesti
            }
            System.out.println();
        } */
        int riga = 0, colonna = 0;
        String riga1 = Arg[0];
        if (riga1.length()>2||riga1.length()<1){
            System.out.println("Errore riga non trovata");
            System.exit(0);
        } else if (riga1.length()==2){
            char numeroRiga0 = riga1.charAt(1);
            riga += numeroRiga0-48; 
            //System.out.println(numeroRiga0+ " " + riga);
            char numeroRiga1 = riga1.charAt(0);
            riga += (numeroRiga1-48)*10; 
            //System.out.println(numeroRiga1+ " " + riga);
        } else if (riga1.length()==1){
            char numeroRiga0 = riga1.charAt(0);
            riga += numeroRiga0-48; 
            //System.out.println(numeroRiga0+ " " + riga);
        }
        String colonna1 = Arg[1];
        if (colonna1.length()>2||colonna1.length()<1){
            System.out.println("Errore riga non trovata");
            System.exit(0);
        } else if (colonna1.length()==1){
            char numeroRiga0 = colonna1.charAt(0);
            colonna += numeroRiga0-48; 
            //System.out.println(numeroRiga0+ " " + colonna);
        } else if (colonna1.length()==2){
            char numeroRiga0 = colonna1.charAt(1);
            colonna += numeroRiga0-48; 
            //System.out.println(numeroRiga0+ " " + colonna);
            char numeroRiga1 = colonna1.charAt(0);
            colonna += (numeroRiga1-48)*10; 
            //System.out.println(numeroRiga1+ " " + colonna);
        }

        boolean obbiettivo = Metodi8_2.aggiungiObbiettivo(mondo, riga, colonna);
        //System.out.println(obbiettivo);

        for (int i=0; i<10; i++){
            Metodi8_2.aggiungiOstacolo(mondo);
        }
        int risultatoPercorso = Metodi8_2.aggiungiPosizioneRobot(mondo, Arg[2]);
        System.out.println(risultatoPercorso);
        /*
        for (int i=0; i<20; i++){
            for (int j=0; j<20; j++){
                System.out.print(mondo[i][j]);
                // fare stessa cosa ma con if e a seconda di cosa c'è stampare caratteri chiesti
            }
            System.out.println();
        } */
        Metodi8_2.stampaMondo(mondo);
        if (risultatoPercorso==1){
            System.out.println("HAI VINTO");
        } else {
            System.out.println("HAI PERSO COGLIONE ");
        }
    }
}
