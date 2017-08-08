/*
URI Online Judge | 1007
Diferença
Adaptado por Neilor Tonin, URI  Brasil
Timelimit: 1
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada

O arquivo de entrada contém 4 valores inteiros.

Saída

Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

Exemplos de Entrada	Exemplos de Saída
5
6
7
8
DIFERENCA = -26
0
0
7
8
DIFERENCA = -56
5
6
-7
8
DIFERENCA = 86
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

public class Main {
	private static Scanner input;
    public static void main(String[] args) throws IOException {
    	
		int A, B, C, D, DIFERENCA;
    	
    	DecimalFormat df = new DecimalFormat();
    	df.setMaximumFractionDigits(1);
    	
		input = new Scanner(System.in);
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();

		DIFERENCA = (A * B - C * D);
		
	    System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
