public class Metodi7_2 {

    public static String estraiStringaCasuale(){
        String stringaCasuale = "";
        int numeroCasuale = (int)(Math.random()*10+1);
        switch (numeroCasuale){
            case 1:
            stringaCasuale = "francesco";
                break;
            case 2:                
            stringaCasuale = "studio";
                break;
            case 3:
            stringaCasuale = "verde";
                break;
            case 4:
            stringaCasuale = "lavatrice";
                break;
            case 5:
            stringaCasuale = "java";
                break;
            case 6: 
            stringaCasuale = "numeri";
                break;
            case 7:
                stringaCasuale = "computer";
                break;
            case 8:    
                stringaCasuale = "giallo";
                break;
            case 9:
                stringaCasuale = "arcobaleno";
                break;
            case 10:
                stringaCasuale = "ciao";
                break;
            default:
                System.out.println("Errore");
                stringaCasuale = "";
                break;
        }
        return stringaCasuale;
    }
    
}
