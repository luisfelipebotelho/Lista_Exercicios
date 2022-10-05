package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo10 {

	Scanner sc = new Scanner(System.in);

	public String numIntProduto() {

		System.out.println("Digite o primeiro número inteiro: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o segundo número inteiro: ");
		int num2 = Integer.parseInt(sc.nextLine());
		return "Produto: " + (num1 * num2);
	}

}
