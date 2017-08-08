/*
URI Online Judge | 1005
Média 1
Adaptado por Neilor Tonin, URI  Brasil
Timelimit: 1
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada

O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída

Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada	Exemplos de Saída
5.0
7.1
MEDIA = 6.43182
0.0
7.1
MEDIA = 4.84091
10.0
10.0
MEDIA = 10.00000
*/
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

public class Main {
	private static Scanner input;
    public static void main(String[] args) throws IOException {
    	
    	DecimalFormat df = new DecimalFormat();
    	df.setMaximumFractionDigits(5);
    	
		input = new Scanner(System.in);
		double A, B, MEDIA;
		A = input.nextDouble();
		B = input.nextDouble();

		MEDIA = (A*3.5 + B*7.5)/11;
				
	    System.out.println("MEDIA = " + df.format(MEDIA));
    }
}
