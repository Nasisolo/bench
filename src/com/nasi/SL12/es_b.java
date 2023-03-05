package com.nasi.SL12;

/* ES_B: dato un vettore, dire quanti sono gli elementi diversi */

import org.jetbrains.annotations.NotNull;

public class es_b {

    public static void main(String[] args){

        int[] v_1 = {1,3,4,5,1,4,33,2,8};
        int[] v_2 = {0,6,1,2,3,2,3,2,2,7,1,9,3,2};
        int[] v_3 = {-3, 1,-9, 4, -3, -2, 1, 0, -9};
        /* TEST */
        System.out.println("V_1 ha " + count_differents_nums(v_1) + " numeri diversi");
        System.out.println("V_2 ha " + count_differents_nums(v_2) + " numeri diversi");
        System.out.println("V_3 ha " + count_differents_nums(v_3) + " numeri diversi");

    }

    public static int count_differents_nums(int @NotNull [] vet){
        /* ordino l'array - Bubble sort */
        for (int i = 0; i < vet.length-1; i++)
            for (int j = 0; j < vet.length-i-1; j++)
                if (vet[j] > vet[j+1]) {
                    int temp = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = temp;
                }

        /* conta quanti elementi diversi ci sono in numbers*/
        int different_nums = 1;  // c'è sicuramente almeno 1 un numero diverso

        for(int i = 0; i < vet.length-1; i++){
            if(vet[i] != vet[i+1])
                different_nums++;
        }

        return different_nums;
    }
}
