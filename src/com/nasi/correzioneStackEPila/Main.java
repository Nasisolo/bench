package com.nasi.correzioneStackEPila;

public class Main {

    public static void main(String[] args) throws Exception {
	Stack s = new Stack(8);
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	s.push(9);
	System.out.println(s.size());
		System.out.printf("2. Pop elements from stack : ");
		while (!s.isEmpty()) {
			System.out.printf(" %d", s.pop());
		}
		System.out.println(s.top());
    }
}
