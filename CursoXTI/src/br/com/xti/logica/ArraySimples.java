package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArraySimples {

	public static void main(String[] args) {
		
		
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		String[] paises = {"Brasil", "Argentina", "Uruguai", "Paraguai"};
		System.out.println(Arrays.toString(paises));
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		System.out.println(paises[0]);
		System.out.println(impares.length);
		System.out.println(impares[2]);
		
		Double[] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue());
		
		String[] uma = {"Ricardo", "Sandra"};
		System.out.println(uma[0]);
		System.out.println(uma.length);
		
		String[][] duas = {{"Ricardo", "M", "DF"},{"Sandra", "F", "MG"}};
		System.out.println(duas[1][0]);
		System.out.println(duas.length);
		System.out.println(duas[0].length);
		System.out.println(duas[1].length);
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Valete", "Reis"};
		String[] naipes = {"Espada", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();
		
		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];
		
		int indiceNaipe = r.nextInt(naipes.length);
		String naipe = naipes[indiceNaipe];
		
		String carta = face + " " + naipe;
		System.out.println(carta);
		
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Amarelo");
		cores.add("Branco");
		cores.add("Azul");
		cores.add(0, "Vermelho");
		System.out.println(cores.toString());
	}

}
