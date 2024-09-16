import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)  {
    int vetor [] = new int [10];
    Random rand = new Random ();
    preencherValor (vetor, 0 , rand);
    imprimirValor (vetor, 0);
    
    System.out.println("qual valor deseja encontrar?");
    int valorBuscado = entrada.nextInt();
    int valorEncontrado = buscarValor(valorBuscado, vetor, 0);
    
    if (valorEncontrado == -1) {
    	System.out.println("valor nao encontrado");
    }
    else {
    	System.out.println("valor encontrado na posicao "+ valorEncontrado);
    }
    }
    
    public static void preencherValor (int vetor[], int indice, Random rand) {
    	if (indice < vetor. length) {
    		vetor[indice] = rand.nextInt(100);
    		preencherValor (vetor, indice + 1, rand);
     	}
    }
    
    public static void imprimirValor (int vetor[], int indice) {
    	if (indice < vetor.length) {
    		System.out.println(vetor[indice]);
    		imprimirValor (vetor, indice + 1);
    	}
    }
    
    public static int buscarValor (int valorBuscado, int vetor[],int indice) {
    	if (indice >= vetor.length) {
    		return - 1;
    	}
    	else if (valorBuscado == vetor[indice]) {
    		return indice;
    	}
    	else {
    		return buscarValor (valorBuscado, vetor, indice + 1);
    	}
    }
 }
