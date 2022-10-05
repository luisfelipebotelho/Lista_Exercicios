package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo16 {
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public void nomeResult() {
		String nome;
		int tamNome, indice;
		do {
		System.out.print("Informe um nome: ");
		nome = sc.nextLine();
		tamNome = nome.length();
		if (nome.length() < 4) {
				System.out.println("Informe um nome que contenha 4 letras ou mais!");
			}
		}while(nome.length() < 4);
		System.out.println("\nResultado: ");
		System.out.println();
		
		if (nome.length() >= 4) {
			System.out.println("Todo nome: " + nome);
			System.out.println("Primeiro caractere: " + nome.charAt(0));
			System.out.println("Ultimo caractere: " + nome.charAt(tamNome - 1));
			System.out.print("Do primeiro até o terceiro: ");
			for (indice = 0; indice < 3; indice++) {
				System.out.print(nome.charAt(indice));
			}
			System.out.println("\nQuarto caractere: " + nome.charAt(3));
			System.out.print("Todos menos o primeiro: ");
			for (indice = 1; indice < tamNome; indice++) {
				System.out.print(nome.charAt(indice));
			}
			System.out.println("\nOs dois últimos: " + nome.charAt(tamNome - 2) + "" + nome.charAt(tamNome - 1));
		}
	}	

}
