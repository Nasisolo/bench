package com.nasi.SL12;

/* ES_D: data una matrice m x n, indivudare la riga/le righe con il maggior numero di numeri negativi*/

import java.util.Scanner;

public class es_d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quante righe avrà la matrice? ");
        int m = sc.nextInt();
        System.out.print("Quante colonne avrà la matrice? ");
        int n = sc.nextInt();

        int [][] matr = new int[m][n];

        /* acquisizione numeri da tastiera */
        for(int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print("Inserisci numero in riga " + i + " e colonna " + j + ": ");
                matr [i][j] = sc.nextInt();
            }
        }

        /* stampa matrice - per avere una chiara visualizzazione */
        for(int i = 0; i < matr.length; i++){
            for(int j = 0; j < matr[i].length; j++){
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

        /* memorizza in un array di dimensione m(righe) quanti negativi sono presenti in tale riga */
        int[] negativi_per_riga = new int[m];
        for(int i = 0; i < matr.length; i++) {
            negativi_per_riga[i] = conta_negativi_per_riga(matr, i);
        }

        /* trovo il valore massimo nell'array */
        int max = 0;
        for(int i = 0; i < m; i++){
            if(negativi_per_riga[i] > max)
                max = negativi_per_riga[i];
        }

        /* stampa a video le soluzioni */
        for(int i = 0; i < m; i++){
            if(negativi_per_riga[i] == max)
                System.out.println("Riga di indice: " + i + " con massimo numero di numeri negativi");
        }

    }

    public static int conta_negativi_per_riga(int[][] mat, int x){ // x = riga y = colonna
        int res = 0;
        /* scorrimento sulla riga x */
        for (int i = 0; i < mat.length; i++){
            if(mat[x][i] < 0) {
                res++;
            }
        }

        return res;
    }
}
