import java.util.Scanner;

public class Exercicio05 {
	
	static final Integer NOTA_MINIMA_PARA_APROVACAO = 7;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe sua nota: ");
		Double nota = scanner.nextDouble();
		
		Boolean aprovado = nota >= NOTA_MINIMA_PARA_APROVACAO;
		
		if (aprovado) {
			System.out.println("Parab�ns, voc� foi aprovado(a)!");
		} else {
			System.out.println("Infelizmente voc� foi reprovado(a).");
		}
		
		scanner.close();
	}
}