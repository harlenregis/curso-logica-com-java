import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero referente ao dia da semana: ");
		Integer numero = scanner.nextInt();
		
		String diaDaSemana = null;
		
		switch (numero) {
		case 1: diaDaSemana = "Domingo";
				break;
		case 2: diaDaSemana = "Segunda-feira";
			break;
		case 3: diaDaSemana = "Ter�a-feira";
				break;
		case 4: diaDaSemana = "Quarta-feira";
			break;
		case 5: diaDaSemana = "Quinta-feira";
				break;
		case 6: diaDaSemana = "Sexta-feira";
				break;
		case 7: diaDaSemana = "S�bado";
				break;
		default:
					System.err.println("Digite um n�mero v�lido!");
					System.exit(1);
		}
					
		System.out.println("Dia da semana: " + diaDaSemana);			
		
		scanner.close();
	}

}
