package com.nasi.SL12;
import java.util.Scanner;

/* ES_A: acquisire un array di n numeri interi, quindi eliminare gli elementi ripetuti */

public class es_a {

    /* senza funzioni ausiliarie */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        /* chiedo quanti numeri si vogliono inserire nell'array */
        System.out.println("Quanti elementi vuoi mettere nell'array? (inserisci un numero)");
        int n = sc.nextInt();

        /* creo array di n numeri interi */
        int[] numbers = new int[n];

        /* inserisci in posizione i dell'array numbers i numeri uno alla volta da tastiera */
        for(int i=0; i<n; i++){
            System.out.print("Inserisci il " + i + " numero: ");
            numbers[i] = sc.nextInt();
        }

        /* ordino l'array - Bubble sort */
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }

        /* conta quanti elementi diversi ci sono in numbers*/
        int different_nums = 1;  // c'è sicuramente almeno 1 un numero diverso
        for(int i = 0; i < n-1; i++){
            if(numbers[i] != numbers[i+1])
                different_nums++;
        }

        /* creo un nuovo array di different_nums posizioni */
        int[] res_array = new int[different_nums];

        /* rimuovo duplicati */
        int iter = 1;
        int res_iter = 1;
        res_array[0] = numbers[0]; //primo elemento sicuramente diverso

        /* riomuovo duplicati a partire dagli indici 1 (iter and res_iter */
        while(iter < n){
            if(numbers[iter-1] != numbers[iter]) {
                res_array[res_iter] = numbers[iter];
                res_iter++;
            }
            iter++;
        }

        /* stampa risultato */
        for(int i = 0; i < different_nums; i++){
            System.out.print( res_array[i] +" ");
        }


    }
}
