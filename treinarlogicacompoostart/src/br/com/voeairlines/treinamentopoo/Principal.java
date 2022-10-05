package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("********** BEM VINDO A LISTA DE ATIVIDADES 1 **********\n");
		System.out.println("Professor, digite de 1 a 26 para imprimir a atividade que deseja vizualizar:");
		int op = Integer.parseInt(leia.nextLine());
		switch (op) {

		case 1:
			Algoritmo01 alg1 = new Algoritmo01();
			System.out.println(alg1.imprimirMensagem());
			break;

		case 2:
			Algoritmo02 alg2 = new Algoritmo02();
			System.out.println(alg2.imprimirNome());
			break;

		case 3:
			Algoritmo03 alg3 = new Algoritmo03();
			System.out.println(alg3.imprimirProduto());
			break;

		case 4:
			Algoritmo04 alg4 = new Algoritmo04();
			System.out.println(alg4.imprimirMedia());
			break;

		case 5:
			Algoritmo05 alg5 = new Algoritmo05();
			System.out.println(alg5.numInteiro());
			break;

		case 6:
			Algoritmo06 alg6 = new Algoritmo06();
			System.out.println(alg6.numInteiro1());
			System.out.println(alg6.numInteiro2());

		case 7:
			Algoritmo07 alg7 = new Algoritmo07();
			System.out.println(alg7.numAntecessorESucessor());
			break;

		case 8:
			Algoritmo08 alg8 = new Algoritmo08();
			System.out.println(alg8.Dados());
			break;

		case 9:
			Algoritmo09 alg9 = new Algoritmo09();
			System.out.println(alg9.numIntSoma());
			break;

		case 10:
			Algoritmo10 alg10 = new Algoritmo10();
			System.out.println(alg10.numIntProduto());
			break;

		case 11:
			Algoritmo11 alg11 = new Algoritmo11();
			System.out.println(alg11.numReal());
			break;
			
		case 12:
			Algoritmo12 alg12 = new Algoritmo12();
			System.out.println(alg12.medAritmetica());
			break;
			
		case 13:
			Algoritmo13 alg13 = new Algoritmo13();
			System.out.println(alg13.medPonderada());
			break;
			
		case 14:
			Algoritmo14 alg14 = new Algoritmo14();
			System.out.println(alg14.saldoReajuste());
			break;
			
		case 15:
			new Algoritmo15().salarioMinimoQuilowatts();
			break;
			
		case 16:
			new Algoritmo16().nomeResult();
			break;
			
		case 17:
			new Algoritmo17().retangulo();
			break;
			
		case 18:
			new Algoritmo18().raioCirculo();
			break;
			
		case 19:
			new Algoritmo19().ladoQ();
			break;
			
		case 20:
			new Algoritmo20().paralelepipedo();
			break;
			
		case 21:
			new Algoritmo21().Atriangulo();
			break;
			
		case 22:
			new Algoritmo22().ALosango();
			break;
			
		case 23:
			new Algoritmo23().nomeEIdade();
			break;
			
		case 24:
			new Algoritmo24().Fahrenheit();
			break;
			
		case 25:
			new Algoritmo25().volumeO();
			break;
			
		case 26:
			new Algoritmo26().prestação();
			break;
			
		}

		leia.close();
	}

}
