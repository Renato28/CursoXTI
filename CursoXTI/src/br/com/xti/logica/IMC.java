package br.com.xti.logica;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso em quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
		
		double pesoEmQuilograma = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25 ) ? "Peso Ideal" : "Fora do peso ideal";
		System.out.println("IMC: " + imc);
		System.out.println(msg);
		
	}

}
