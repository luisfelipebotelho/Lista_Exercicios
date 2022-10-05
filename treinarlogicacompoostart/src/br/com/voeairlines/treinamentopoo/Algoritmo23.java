package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo23 {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	public void nomeEIdade() {

		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
	}

}
