package br.com.xti.logica;

import javax.swing.JOptionPane;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class IMC {

	public static void main(String[] args) {
		
		//criacao das variaveis para receber o peso e altura
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso em quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
		
		//criacao de variavel para receber os valores convertidos das variaveis peso e altura para double
		
		double pesoEmQuilograma = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		
		//criacao de variavel para calcular o imc
		
		double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);
		
		//criacao do operador ternario
		
		String msg = (imc >= 20 && imc <= 25 ) ? "Peso Ideal" : "Fora do peso ideal";
		
		//execucao das variaveis imc e msg
		
		System.out.println("IMC: " + imc);
		System.out.println(msg);
		
	}

}
