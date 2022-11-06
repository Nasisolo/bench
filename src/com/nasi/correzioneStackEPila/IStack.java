package com.nasi.correzioneStackEPila;

public interface IStack {
    void push(Object o);
    Object pop() throws Exception;
    Object top();
    int size();
    boolean isEmpty();
}
