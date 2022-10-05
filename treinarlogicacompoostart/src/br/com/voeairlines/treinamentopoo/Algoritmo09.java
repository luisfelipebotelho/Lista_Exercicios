package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo09 {

	Scanner sc = new Scanner(System.in);

	public String numIntSoma() {

		System.out.println("Digite o primeiro número inteiro: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int num2 = sc.nextInt();
		return "Soma: " + (num1 + num2);

	}

}
