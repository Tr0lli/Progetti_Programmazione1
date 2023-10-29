import java.util.Scanner;

public class Metodi8_6 {
    public static void creaNuovaConfigurazione(char[][] tabella){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                tabella[i][j] = ' ';
                System.out.print(tabella[i][j]);
                if (j!=2)
                System.out.print("|");
            }
            System.out.println();
            if (i!=2)
            System.out.println("-+-+-");
        }
    }

    public static void stampaConfigurazioneDiGioco(char[][] tabella){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(tabella[i][j]);
                if (j!=2)
                System.out.print("|");
            }
            System.out.println();
            if (i!=2)
            System.out.println("-+-+-");
        }
    }

    public static void mossaComputer(char[][] tabella){

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (tabella[i][j]=='X'){ //contro Utente
                    if (i==0 && tabella[i+1][j]=='X' && tabella[i+2][j]==' '){
                        tabella[i+2][j] = 'O';
                        j = 10; return;
                    } else if (i==2 && tabella[i-1][j]=='X' && tabella[i-2][j]==' '){
                        tabella[i-2][j] = 'O';
                        j = 10; return;
                    } else if (j==0 && tabella[i][j+1]=='X' && tabella[i][j+2]==' '){
                        tabella[i][j+2] = 'O';
                        j = 10; return;
                    } else if (j==2 && tabella[i][j-1]=='X' && tabella[i][j-2]==' '){
                        tabella[i][j-2] = 'O';
                        j = 10; return;
                    } else if (j==0 && i==0 && tabella[i+1][j+1]=='X' && tabella[i+2][j+2]==' '){
                        tabella[i+2][j+2] = 'O';
                        j = 10; return;
                    } else if (j==2 && i==2 && tabella[i-1][j-1]=='X' && tabella[i-2][j-2]==' '){
                        tabella[i-2][j-2] = 'O';
                        j = 10; return;
                    } else if (i==0 && tabella[i+1][j]==' ' && tabella[i+2][j]=='X'){
                        tabella[i+1][j] = 'O';
                        j = 10; return;
                    } else if (j==0 && tabella[i][j+1]==' ' && tabella[i][j+2]=='X'){
                        tabella[i][j+1] = 'O';
                        j = 10; return;
                    }
                } else if (tabella[i][j]=='O'){ //triss del PC
                    if (j==0 && tabella[i][j+1]==' ' && tabella[i][j+2]=='O'){
                        tabella[i][j+1] = 'O';
                        j = 10; return;
                    } else if (j==0 && tabella[i][j+1]=='O' && tabella[i][j+2]==' '){
                        tabella[i][j+2] = 'O';
                        j = 10; return;
                    } else if (i==0 && tabella[i+1][j]==' ' && tabella[i+2][j]=='O'){
                        tabella[i+1][j] = 'O';
                        j = 10; return;
                    } else if (i==0 && tabella[i+1][j]=='O' && tabella[i+2][j]==' '){
                        tabella[i+2][j] = 'O';
                        j = 10; return;
                    } else if (j==2 && tabella[i][j-1]=='O' && tabella[i][j-2]==' '){
                        tabella[i][j-2] = 'O';
                        j = 10; return;
                    } else if (i==2 && tabella[i-1][j]=='O' && tabella[i-2][j]==' '){
                        tabella[i-2][j] = 'O';
                        j = 10; return;
                    } else if (i==0 && j==0 && tabella[i+1][j+1]=='O' && tabella[i+2][j+2]==' '){
                        tabella[i+2][j+2] = 'O';
                        j = 10; return;
                    } else if (i==0 && j==0 && tabella[i+1][j+1]==' ' && tabella[i+2][j+2]=='O'){
                        tabella[i+1][j+1] = 'O';
                        j = 10; return;
                    } else if (i==2 && j==2 && tabella[i-1][j-1]=='O' && tabella[i-2][j-2]==' '){
                        tabella[i-2][j-2] = 'O';
                        j = 10; return;
                    } else if (i==0 && j==2 && tabella[i+1][j-1]=='O' && tabella[i+2][j-2]==' '){
                        tabella[i+2][j-2] = 'O';
                        j = 10; return;
                    } else if (i==0 && j==2 && tabella[i+1][j-1]==' ' && tabella[i+2][j-2]=='O'){
                        tabella[i+1][j-1] = 'O';
                        j = 10; return;
                    } else if (i==2 && j==0 && tabella[i-1][j+1]=='O' && tabella[i-2][j+2]==' '){
                        tabella[i-2][j+2] = 'O';
                        j = 10; return;
                    } else if (i==2 && j==0 && tabella[0][2]=='O' && tabella[1][2]==' ' && tabella[2][2]==' ' && tabella[2][1]==' '){
                        tabella[2][2] = 'O';
                        j = 10; return;
                    } else  if (i==2 && j==0 && tabella[0][2]=='O' && tabella[1][0]==' ' && tabella[0][0]==' ' && tabella[0][1]==' '){
                        tabella[0][0] = 'O';
                        j = 10; return;
                    } else if (i==0 && j==0 && tabella[2][2]=='O' && tabella[1][2]==' ' && tabella[0][2]==' ' && tabella[0][1]==' '){
                        tabella[2][2] = 'O';
                        j = 10; return;
                    } else  if (i==0 && j==0 && tabella[2][2]=='O' && tabella[1][0]==' ' && tabella[2][0]==' ' && tabella[2][1]==' '){
                        tabella[0][0] = 'O';
                        j = 10; return;
                    }
                }
            }
        }
       
            if (tabella[1][1]==' '){
                tabella[1][1] = 'O';
                
            } else if (tabella[0][0]=='X' && tabella[2][2]==' '){
                tabella[2][2] = 'O';
        
            } else if (tabella[2][2]=='X' && tabella[0][0]==' '){
                tabella[0][0] = 'O';
        
            } else if (tabella[0][2]=='X' && tabella[2][0]==' '){
                tabella[2][0] = 'O';
        
            } else if (tabella[2][0]=='X' && tabella[0][2]==' '){
                tabella[0][2] = 'O';
        
            } else if (tabella[2][2]==' '){
                tabella[2][2] = 'O';
        
            } else if (tabella[0][2]==' '){
                tabella[0][2] = 'O';
        
            } else if (tabella[2][0]==' '){
                tabella[2][0] = 'O';
        
            } else if (tabella[0][0]==' '){
                tabella[0][0] = 'O';
        
            } else {
                for (int i=0; i<3; i++){ //posiziona a caso
                    for (int j=0; j<3; j++){
                        if (tabella[i][j]==' '){
                            tabella[i][j] = 'O';
                            j = 10; return;
                        }
                    }
                }
            }
            

    }

    public static void mossaUtente(char[][] tabella){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi la riga e la colonna dove vuoi inserire la X");
        boolean riprova = false;
        do {
            int r = sc.nextInt();
            int c = sc.nextInt();
            r--; c--;
       
            if (tabella[r][c]==' '){
                tabella[r][c] = 'X';
                riprova = false;
            } else {
                System.out.println("ERRORE non puoi inserire la X in questo punto");
                riprova = true;
            }
        } while (riprova);    
    }

    public static int verificaVittoria(char[][] tabella){
        int risultato = 2;
        int orizzontaleUtente = 0;
        int verticaleUtente = 0;
        int orizzontaleComputer = 0;
        int verticaleComputer = 0;
        int tabellaPiena = 0;

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (tabella[i][j]=='X'){
                    orizzontaleUtente += 1;
                } else {
                    orizzontaleUtente = 0;
                } if (tabella[j][i]=='X'){
                    verticaleUtente += 1;
                } else {
                    verticaleUtente = 0;
                } if (tabella[0][0]=='X' && tabella[1][1]=='X' && tabella[2][2]=='X'){
                    risultato = 1;
                } else if (tabella[2][0]=='X' && tabella[1][1]=='X' && tabella[0][2]=='X'){
                    risultato = 1;
                } else if (tabella[i][j]=='O'){
                    orizzontaleComputer += 1;
                } else {
                    orizzontaleComputer = 0;
                } if (tabella[j][i]=='O'){
                    verticaleComputer += 1;
                } else {
                    verticaleComputer = 0;
                } if (tabella[0][0]=='O' && tabella[1][1]=='O' && tabella[2][2]=='O'){
                    risultato = -1;
                } else if (tabella[2][0]=='O' && tabella[1][1]=='O' && tabella[0][2]=='O'){
                    risultato = -1;
                } if (tabella[i][j]==' '){
                    tabellaPiena += 1;
                }

            }
        }
        if (orizzontaleUtente==3 || verticaleUtente==3){
            risultato = 1;
        } else if (orizzontaleComputer==3 || verticaleComputer==3){
            risultato = -1;
        } else if (tabellaPiena==0){
            risultato = 0;
        }
        
        return risultato;
    }
} 
