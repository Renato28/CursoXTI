package br.com.xti.logica;
/**
 * 
 * @author Renato Nobrega
 *
 */
public class Fluxo {

	public static void main(String[] args) {
		
		//criando um array boolean bidimensional
		boolean[][] matrix = { { false, true, false, false, false }, { false, false, false, false, false } };
		
		//criando e executando rotulos com a estrutural codicional for
		busca:
		for(int a = 0; a < matrix.length; a++) {
			
			System.out.println("A ");
			
			for(int b = 0; b < matrix[a].length; b++) {
				
				//criando estrutura codicional if
				if(matrix[a][b]) {
					
					//executando a condicional if
					System.out.println("TRUE");
					continue busca;
				}
				
				System.out.println("B ");
			}
		}
	}

}
