import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculando o quadrado de um n�mero");
		
		System.out.print("Informe um n�mero: ");
		Integer numero = scanner.nextInt();
		
		Integer quadrado = numero * numero;
		
		System.out.println("O quadrado de: " + numero + " � " + quadrado);
		
		scanner.close();
	}
}