import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	private static Scanner input;
    public static void main(String[] args) throws IOException {
 
        
		input = new Scanner(System.in);
	    int A = input.nextInt();
	    int B = input.nextInt();
	    int soma = A+B;
	      
	    System.out.println("X = " + soma);
 
    }
 
}