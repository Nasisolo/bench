package com.nasi.SocketClient;
import java.io.*;
import java.net.Socket;

public class Main {


	/**
	 * Questo codice fa parte del server, contiene solamente un esempio per un esercizio svolto
	 */
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.178.57",
				2841);
		PrintWriter p = new PrintWriter(s.getOutputStream(),true);
		//p.println("ciao 12234545");

		//legge il file
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\olifo\\Downloads\\Socket\\SocketClient\\src\\com\\company\\client.txt"));
		String line = reader.readLine();
		String message = "";
		/**
		 * lettura file con matricole, nome, cognome
		 */
		while(line!=null) {
			line = reader.readLine();
			//System.out.println("il client invia" + " " + line);
			//p.println(line);
			message += line + "-";
		}
		System.out.println(message);
		p.println(message);


		InputStreamReader i = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(i);
		//System.out.println("il client riceve: " + br.readLine());
		String receivedMessage = br.readLine();

		String [] receivedLines = receivedMessage.split("-");

		for (String tmp : receivedLines){
			System.out.println(tmp);
		}


		s.close();
	}
}
