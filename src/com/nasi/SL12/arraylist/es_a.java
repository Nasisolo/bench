package com.nasi.SL12.arraylist;

/* ES_A: acquisire un array di n numeri interi, quindi eliminare gli elementi ripetuti */
/* arraylist version */

import java.util.ArrayList;
import java.util.Scanner;

public class es_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* chiedo quanti numeri si vogliono inserire nell'array */
        System.out.println("Quanti elementi vuoi mettere nell'array? (inserisci un numero)");
        int n = sc.nextInt();

        /* creo array di n numeri interi */
        ArrayList<Integer> numbers = new ArrayList<>();

        /* inserisci in posizione i dell'array numbers i numeri uno alla volta da tastiera */
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il " + i + " numero: ");
            numbers.add(sc.nextInt());
        }

        /* creo nuovo arraylist con l'output */
        ArrayList<Integer> newList = new ArrayList<>();

        /* scorre tutti gli elementi di numbers, ogni elemento è element*/
        for (Integer element : numbers) {
            /* se l'elemento in posizione i non è presente nel nuovo array, lo inserisco */
            if (!newList.contains(element)) {
                newList.add(element);
            }

        }

        /* stampa risultato */
        for(Integer i : newList){
            System.out.print(i + " ");
        }
    }
}
