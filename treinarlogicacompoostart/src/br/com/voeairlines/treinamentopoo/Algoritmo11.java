package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo11 {

	Scanner sc = new Scanner(System.in);

	public String numReal() {

		System.out.println("Entre com um número real: ");
		double num = sc.nextDouble();
		return "A terceira parte deste número é: " + (num / 3);
	}

}
