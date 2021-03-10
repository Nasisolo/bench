package com.nasi.SL12.arraylist;

/* ES_B: dato un vettore, dire quanti sono gli elementi diversi */
/* arraylist version */

import java.util.ArrayList;

public class es_b {

    public static void main(String[] args){

        ArrayList<Integer> v_1 = new ArrayList<>() ;
        v_1.add(1);
        v_1.add(3);
        v_1.add(4);
        v_1.add(5);
        v_1.add(1);
        v_1.add(4);
        v_1.add(33);
        v_1.add(2);
        v_1.add(8);


        ArrayList<Integer> v_2 = new ArrayList<>();
        v_2.add(0);
        v_2.add(6);
        v_2.add(1);
        v_2.add(2);
        v_2.add(3);
        v_2.add(2);
        v_2.add(3);
        v_2.add(2);
        v_2.add(2);
        v_2.add(7);
        v_2.add(1);
        v_2.add(9);
        v_2.add(3);
        v_2.add(2);

        ArrayList<Integer> v_3 = new ArrayList<>();
        v_3.add(-3);
        v_3.add(1);
        v_3.add(-9);
        v_3.add(4);
        v_3.add(-3);
        v_3.add(-2);
        v_3.add(1);
        v_3.add(0);
        v_3.add(-9);

        /* TEST */
        System.out.println("V_1 ha " + count_differents_nums(v_1) + " numeri diversi");
        System.out.println("V_2 ha " + count_differents_nums(v_2) + " numeri diversi");
        System.out.println("V_3 ha " + count_differents_nums(v_3) + " numeri diversi");

    }

    public static int count_differents_nums(ArrayList<Integer> vet){

        /* conta quanti elementi diversi ci sono in numbers*/
        int different_nums = 0;  // c'è sicuramente almeno 1 un numero diverso

        ArrayList<Integer> res = new ArrayList<>();

        for(Integer i : vet){
            if(!res.contains(i)){
                res.add(i);
                different_nums++;
            }
        }

        return different_nums;
    }
}
