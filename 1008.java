/*
URI Online Judge | 1008
Salário
Adaptado por Neilor Tonin, URI  Brasil
Timelimit: 1
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada

O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída

Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

Exemplos de Entrada	Exemplos de Saída
25
100
5.50
NUMBER = 25
SALARY = U$ 550.00
1
200
20.50
NUMBER = 1
SALARY = U$ 4100.00
6
145
15.55
NUMBER = 6
SALARY = U$ 2254.75
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

public class Main {
	private static Scanner input;
    public static void main(String[] args) throws IOException {
    	
		double B, SALARIO = 0;
		int A;
    	
    	DecimalFormat df = new DecimalFormat();
    	df.setMaximumFractionDigits(2);
    	
		input = new Scanner(System.in);
		A = input.nextInt();
		B = input.nextDouble();
		SALARIO = input.nextDouble();

		SALARIO *= B;

	    System.out.println("NUMBER = " + A);
	    System.out.println("SALARY = U$ " + df.format(SALARIO));
    }
}

