import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Infome seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Infome seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Olá, " + nome + " " + sobrenome + "!");
		
		scanner.close();
	}
	
}