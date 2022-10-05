package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo05 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public String numInteiro() {
		System.out.println("Digite um número inteiro: ");
		int nI = Integer.parseInt(sc.nextLine());
		return "O número digitado foi: " + nI;
	}

}
