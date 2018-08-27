package br.com.xti.logica;

import java.util.Scanner;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Entrada {

	public static void main(String[] args) {
		
		//codigo comentado
		
		//System.out.println(args[0]);
		
		//criando a classe Scanner
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		//codigo comentado
		
		//System.out.println(s.nextLine());
		
		//criacao e execucao da variavel
		
		System.out.println("Qual é o seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem vindo " + nome);

	}

}
