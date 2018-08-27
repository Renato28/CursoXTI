package br.com.xti.logica;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu palpite?");
		int palpite = entrada.nextInt();

		Random r = new Random();
		int dado = r.nextInt(6) + 1;

		System.out.println("Palpite: " + palpite);
		System.out.println("Dado: " + dado);

		if (palpite == dado) {

			System.out.println("Você acertou!");

		} else {

			System.out.println("Você errou!");
		}
	}

}
