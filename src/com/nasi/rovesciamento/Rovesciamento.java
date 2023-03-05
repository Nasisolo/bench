package com.nasi.rovesciamento;

public class Rovesciamento {

    /*  RICORSIONE:
        Sia x un array di caratteri (che rappresenta una sola parola). Definiamo ricorsivamente il
        rovesciamento di x come segue:
        - se x ha lunghezza <= 1 allora il rovesciamento di x è x.
        - altrimenti se x[1...x.length-2] è stato già rovesciato, allora il rovescio di x è ottenuto scambiando x[0]
          con x[x.length-1].

       Scrivi un metodo ricorsivo
       public static void rovesciamento(char[] x)
       che rovescia l'array
     */

    public static void main  (String[] args){

        char[] parola = new char[]{'p', 'a', 'r', 'o', 'l', 'a'};
        System.out.println(parola);
        rovesciamento(parola);
        System.out.println(parola);
    }

    /* se l'array contiene al più un elemento non è necessario rovesciarlo, altrimenti rimanda alla funzzione
    *  ausiliaria che rovescerà l'array ricorsivamente */
    public static void rovesciamento(char[] x){
        if(x.length <= 1)
            return;
        else{
            rovesciamento_aux(x, 0, x.length-1);
        }
    }

    /* questa funzione scambia l'elemento in indice head con l'elemento in posizione tail ed esegue la ricorsione
    *  sull'array MENO i due elementi già scambiati */
    public static void rovesciamento_aux(char[] x, int head, int tail){
        if(head > tail)
            return;
        else{
            char tmp = x[head];
            x[head] = x[tail];
            x[tail] = tmp;
            rovesciamento_aux(x, ++head, --tail);
        }
    }
}
