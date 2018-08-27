package br.com.xti.logica;

public class DesafioFebonacci {

	/**
	 * 
	 * @author Renato Nobrega
	 */
	public static void main(String[] args) {
		
		//criacao de variaveis
		
		int anterior = 0;
		int proximo = 1;
		
		//executando a variavel
		
		System.out.println(anterior);
		
		//criacao da estrutura codicional for
		while(proximo < 50) {
			
			//execucao da estrutura codicional for
			System.out.println(proximo);
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			
		}
	}
}
