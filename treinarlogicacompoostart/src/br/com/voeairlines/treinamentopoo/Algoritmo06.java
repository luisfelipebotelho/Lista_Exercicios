package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo06 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public String numInteiro1() {
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		return "O primeiro número digitado foi : "+ n1;
	}
	public String numInteiro2() {
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		return "O segundo número digitado foi: " +n2;
	} 

}
