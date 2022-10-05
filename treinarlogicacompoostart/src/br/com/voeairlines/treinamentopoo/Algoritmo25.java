package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo25 {
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	public void volumeO() {
		System.out.println("Informe a altura da lata: ");
		double altura = sc.nextDouble();
		System.out.println("Informe o raio da lata: ");
		double raio = sc.nextDouble();
		double volume = 3.14159 * Math.pow(raio, 2) * altura;

		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Volume: %.3f", volume);

	}
}
