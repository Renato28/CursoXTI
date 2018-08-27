package br.com.xti.logica;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class AutoBoxing {

	public static void main(String[] args) {
		
		Integer x = new Integer(555); //empacotado
		int a = x.intValue(); //desempacotar
		a++; //incrementa
		x = new Integer(a); //re-empacota
		System.out.println(x.intValue());
		
		//codigo comentado
		
		/*Integer x = 555;
		x++; //desempacota, incrementa e re-empacota
		System.out.println(x.intValue());*/
		
		//codigo comentado
		
		/*Boolean v = new Boolean("true");
		if(v.booleanValue()) {
			
			System.out.println(v);
		}*/
		
		//criando uma variavel do tipo Boolean
		Boolean v = true;
		
		//criando uma condicao if-else
		if(!v) {
			
			System.out.println(v);	
			
		}else {
			
			System.out.println("false");
		}
	}

}
