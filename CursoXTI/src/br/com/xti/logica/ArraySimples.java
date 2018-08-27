package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class ArraySimples {

	public static void main(String[] args) {
		
		//criando um array de numeros inteiros impares
		
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		//criando um array de String com nome de países
		
		String[] paises = {"Brasil", "Argentina", "Uruguai", "Paraguai"};
		
		//executando o array de String com o metodo toString
		
		System.out.println(Arrays.toString(paises));
		
		/*
		 * criando uma variavel e recebendo o valor do elemento
		 * atraves do metodo toString da classe Arrays
		 */
		int posicao = Arrays.binarySearch(paises, "Russia");
		
		//executando e mostrando a posicao do elemento encontrado
		
		System.out.println(posicao);
		
		/*
		 * ordenando as posições dos elementos do array
		 * de String com o metodo sort da classe Arrays
		 */
		
		Arrays.sort(paises, 0, paises.length);
		
		//executando e mostrando os elementos ordenados
		
		System.out.println(Arrays.toString(paises));
		
		//executando e mostrando o elemento na posicao zero
		
		System.out.println(paises[0]);
		
		/*
		 * executando e mostrando o tamanho do array 
		 * de numeros inteiros impares
		 */
		
		System.out.println(impares.length);
		
		/*
		 * executando e mostrando o elemento do array
		 * de numeros  na posicao 2
		 */
		System.out.println(impares[2]);
		
		//criando um array de Double
		
		Double[] valores = {12.35, 3456.3456};
		
		//executando o array e mostrando o elemento na posicao zero
		System.out.println(valores[0].doubleValue());
		
		//criando um array de String
		
		String[] uma = {"Ricardo", "Sandra"};
		
		//executando e mostrando o elemento na posicao zero
		
		System.out.println(uma[0]);
		
		//executando e mostrando o tamanho do array
		
		System.out.println(uma.length);
		
		//criando um array de String bidimensional
		
		String[][] duas = {{"Ricardo", "M", "DF"},{"Sandra", "F", "MG"}};
		
		//executando e mostrando os elementos na posicao 1 e 0
		
		System.out.println(duas[1][0]);
		
		//executando e mostrando o tamanho do array bidimensional
		
		System.out.println(duas.length);
		
		//executando e mostrando o tamanho do array na posicao zero
		
		System.out.println(duas[0].length);
		
		//executando e mostrando o tamanho do array na posicao um
		
		System.out.println(duas[1].length);
		
		//criando arrays de String
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Valete", "Reis"};
		String[] naipes = {"Espada", "Paus", "Copas", "Ouros"};
		
		//criando a classe Random
		
		Random r = new Random();
		
		/*
		 * criando uma variavel para receber o tamanho do array
		 * e sortear o valor aleatoriamente
		 */
		
		int indiceFace = r.nextInt(faces.length);
		
		//criando uma variavel para receber o valor sorteado aleatoriamente
		String face = faces[indiceFace];
		
		/*
		 * criando uma variavel para receber o tamanho do array
		 * e sortear o valor aleatoriamente
		 */
		int indiceNaipe = r.nextInt(naipes.length);
		
		//criando uma variavel para receber o valor sorteado aleatoriamente
		
		String naipe = naipes[indiceNaipe];
		
		//criando uma variavel para receber os valores sorteados
		String carta = face + " " + naipe;
		
		//executando e mostrando os valores sorteados aleatoriamente
		System.out.println(carta);
		
		//criando um ArrayList de String
		ArrayList<String> cores = new ArrayList<>();
		
		//adicionando elementos no ArrayList
		
		cores.add("Amarelo");
		cores.add("Branco");
		cores.add("Azul");
		
		//adicionando elemento e posicao no ArrayList
		
		cores.add(0, "Vermelho");
		
		//executando e mostrando os elementos do ArrayList com o metodo toString
		System.out.println(cores.toString());
		
		//executando e mostrando o tamanho do ArrayList
		
		System.out.println("Tamanho: " + cores.size());
		
		//executando e mostrando o elemento na posicao 2
		
		System.out.println("Elemento:" + cores.get(2));
		
		//executando e mostrando o indice do elemento
		
		System.out.println("Indice Branco: " + cores.indexOf("Branco"));
		
		//removendo elemento do ArrayList
		
		cores.remove("Branco");
		
		//executando e mostrando os elementos com o metodo contains retornando true ou false
		
		System.out.println("Tem Amarelo? " + cores.contains("Amarelo"));
		System.out.println("Tem Cinza? " + cores.contains("Cinza"));
	}

}
