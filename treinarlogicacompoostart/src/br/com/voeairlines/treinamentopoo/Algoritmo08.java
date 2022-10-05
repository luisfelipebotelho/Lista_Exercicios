package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo08 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public String Dados() {
		String nome, end, tel;
		System.out.println("Digite seu nome: ");
		nome=sc.nextLine();
		System.out.println("Digite seu endereço: ");
		end=sc.nextLine();
		System.out.println("Digite seu telefone: ");
		tel=sc.nextLine();
		return "Nome: " + nome + "\nEndereço: " + end + "\nTelefone: " + tel;
	}

}
