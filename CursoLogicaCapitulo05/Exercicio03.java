import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número referente ao dia da semana: ");
		Integer numero = scanner.nextInt();
		
		String diaDaSemana = null;
		
		switch (numero) {
		case 1: diaDaSemana = "Domingo";
				break;
		case 2: diaDaSemana = "Segunda-feira";
			break;
		case 3: diaDaSemana = "Terça-feira";
				break;
		case 4: diaDaSemana = "Quarta-feira";
			break;
		case 5: diaDaSemana = "Quinta-feira";
				break;
		case 6: diaDaSemana = "Sexta-feira";
				break;
		case 7: diaDaSemana = "Sábado";
				break;
		default:
					System.err.println("Digite um número válido!");
					System.exit(1);
		}
					
		System.out.println("Dia da semana: " + diaDaSemana);			
		
		scanner.close();
	}

}
