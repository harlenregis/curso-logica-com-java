import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Informe seu tempo de contibui�ao com a previd�ncia: ");
		Integer tempoContibuicao = scanner.nextInt();
		
		Boolean podeAposentar = idade >= 55 && tempoContibuicao >= 25;
		
		if (podeAposentar) {
			System.out.println("Sim, pode se aposentar!");
		}	
		else {
			System.out.println("N�o pode se aposentar!");
		
		scanner.close();
		}
	}
}