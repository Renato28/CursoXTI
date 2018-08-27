package br.com.xti.logica;

public class AutoBoxing {

	public static void main(String[] args) {
		
		Integer x = new Integer(555); //empacotado
		int a = x.intValue(); //desempacotar
		a++; //incrementa
		x = new Integer(a); //re-empacota
		System.out.println(x.intValue());
	}

}
