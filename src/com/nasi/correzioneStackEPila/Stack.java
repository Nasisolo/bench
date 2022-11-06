package com.nasi.correzioneStackEPila;

public class Stack implements IStack{

    public Object arr [];
    public Object size;
    public int index = 0;

    public Stack(int size) {
        this.size = size;
        arr = new Object[size];
    }

    @Override
    public void push(Object o) {
        if (!(isFull())){
            System.out.println("stack full");
        }
        arr[index] = o;
        index++;
    }

    @Override
    public Object pop() throws Exception {
        if (isEmpty()){
            throw new Exception("");
        }else {
            return arr[--index];
        }
    }

    @Override
    public Object top() {
        int i = arr.length;
        if ((i == 0)) {
            return null;
        }
           /* for (int i = 0; i < arr.length - 1; ) {
                return arr[i];

            }*/
        return i;
    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        if (this.index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (index == size()) {
            return true;
        }
        return false;
    }
}
