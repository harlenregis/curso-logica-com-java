import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		Double numero1 = scanner.nextDouble();
		
		System.out.print("Informe o tipo de operação [1 = soma / 2 = subtração / 3 = multiplicação / 4 = divisão]: ");
		Integer Operacao = scanner.nextInt();
		
		System.out.print("Digite outro número: ");
		Double numero2 = scanner.nextDouble();
						
		Double resultado = null;
		
		if(Operacao.equals(1)) {
			resultado = numero1 + numero2;
		}
		
		if(Operacao.equals(2)) {
			resultado = numero1 - numero2;
		}
		
		if(Operacao.equals(3)) {
			resultado = numero1 * numero2;
		}
		
		if(Operacao.equals(4)) {
			resultado = numero1 / numero2;
		}
				
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}

}
