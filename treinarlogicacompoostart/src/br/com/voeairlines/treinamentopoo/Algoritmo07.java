package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo07 {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public String numAntecessorESucessor() {
		System.out.println("Digite o número: ");
		int numInt = Integer.parseInt(sc.nextLine());
		int antecessor=numInt-1;
		int sucessor=numInt+1;
		return "O antecessor é : "+antecessor+"\nE o sucessor é: "+sucessor;
	} 
	
}
