/*
URI Online Judge | 1004
Produto Simples
Adaptado por Neilor Tonin, URI  Brasil
Timelimit: 1
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD. A seguir mostre a vari�vel PROD com mensagem correspondente.   

Entrada

O arquivo de entrada cont�m 2 valores inteiros.

Sa�da

Imprima a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

Exemplos de Entrada	Exemplos de Sa�da
3
9
PROD = 27
-30
10
PROD = -300
0
9
PROD = 0
*/

import java.io.IOException;
import java.util.Scanner;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

public class Main {
 
	private static Scanner input;
    public static void main(String[] args) throws IOException {
    	 
		input = new Scanner(System.in);
		int A, B, PROD;
		A = input.nextInt();
		B = input.nextInt();
	     
		PROD = A * B;
				
	    System.out.println("PROD = " + PROD);
 
    }
 
}