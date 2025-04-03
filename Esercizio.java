
import java.util.Scanner;

class Esercizio {
    public static void bubblesortparalleli(int[] nomi,int[] posizione ) {
        int i, j, cont, t , t1;
        boolean scambio;
        int n = nomi.length;
        int n = posizione.length;

        cont = 0;
        i = 0;
        scambio = true;

      
        while (i <= n - 1 && scambio) {
            scambio = false;
            j = 0;

      
            while (j <= n - 2 - i) {
                if (nomi[j] > nomi[j+1]) {
                    t = nomi[j];
                    nomi[j] = nomi[j + 1];
                    nomi[j + 1] = t;
                    t1 = posizione[j];
                    posizione[j] = posizione[j + 1];
                    posizione[j + 1] = t1;
                    scambio = true;
                }
                j = j + 1;
            }
            i = i + 1;
        }
    }

        public static void VisualizzaVettore (int[] nomi,int[] posizione ,N){ 
            int i;
            i=0;
            while (i<N){
                System.out.println("La scuderia"+nomi[i]+"si trova in posizione:"+posizione[i]);
                i++;
            }

        }

            

        public static void impostaVettoreRandom e (int[] nomi,int[] posizione ,N){
            int i;
            i=0;
            while (i<N){
                posizione[i]=random(N*10 + 1);
                posizioni[i]=nome[i];
                System.out.println("La scuderia"+nomi[i]+"si trova in posizione:"+posizione[i])
                i++;
            }


        
        }

            


    

    public static void main(String args[])
    {

        Scanner in = new Scanner( System.in );
        int n, i;

        System.out.println("Inserisci il numero di scuderie");
        n = input.nextInt();
        String[] nomi = new String[n];
        int[] posizione = new int[n];

        i = 0;
        while (i < n) {
            nomi[0] = Ferrari;
            nomi[1] = RedBull;
            nomi[2] = Mclaren;
            nomi[3] = AstonMartin;
            nomi[4] = Sauber;
            nomi[5] = Williams;
            nomi[6] = AstonMartin;
            nomi[7] = Haas;
            nomi[8] = Alpine;
            nomi[9] = RacingBull;
        }
        System.out.println("Genera le posizioni");
        impostaVettoreRandom(posizione, n, nomi);
        System.out.println("posizioni generate");
        visualizzaVettore(nomi, posizione, n);
        System.out.println("Ordinamento posizioni in corso");
        bubblesortparalleli(nomi, posizione, n);
        System.out.println("Tabellone gara con posizioni ordinate");
        visualizzaVettore(nomi, posizione, n);

    }
}

