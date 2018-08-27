package br.com.xti.logica;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class JogoDado {

	public static void main(String[] args) {
		
		//criacao da classe Scanner
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu palpite?");
		
		//criacao de variavel para receber o valor do palpite
		
		int palpite = entrada.nextInt();
		
		//instanciando um objeto da classe Random
		
		Random r = new Random();
		
		//criacao de uma variavel para receber o valor sorteado aleatoriamente
		
		int dado = r.nextInt(6) + 1;
		
		//executando os valores das variaveis palpite e dado
		
		System.out.println("Palpite: " + palpite);
		System.out.println("Dado: " + dado);
		
		//criando uma estrutura codicional if
		
		if (palpite == dado) {
			
			//executando a codicao if
			
			System.out.println("Você acertou!");

		} else {
			
			//executando a codicao else
			System.out.println("Você errou!");
		}
	}

}
