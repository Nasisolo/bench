package com.nasi.SL12;

/* ES_C: data una matrice trovare, esistono, le posizioni degli elementi che sono contemporaneamente
*  MASSIMI di RIGA && MINIMI di COLONNA
* */
public class es_c {
    public static void main(String[] argv){
        int[][] matrix = {
                {-4, -9, -2},
                {-1, 4, 0},
                {7, 3, 3}
        };

        /* test su ogni cella della matrice restituendo la posizione degli indici se possiede la proprietà */
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(isMaxRiga(matrix, i, j) && isMinColonna(matrix, i, j)){
                    System.out.println("RIGA: " + i + "\nCOLONNA: " + j + "\nVALORE: " + matrix[i][j]);
                }
            }
        }

    }

    public static boolean isMaxRiga(int[][] mat, int x, int y){ // x = riga y = colonna
        boolean res = true;
        /* scorrimento sulla riga x */
        for (int i = 0; i < mat.length; i++){
            if(mat[x][y] < mat[x][i]) {
                res = false;
            }
        }

        return res;
    }

    public static boolean isMinColonna(int[][] mat, int x, int y){ // x = riga y = colonna
        boolean res = true;
        /* scorrimento sulla riga x */
        for (int i = 0; i < mat[y].length; i++){
            if(mat[x][y] > mat[i][y]) {
                res = false;
            }
        }

        return res;
    }
}
