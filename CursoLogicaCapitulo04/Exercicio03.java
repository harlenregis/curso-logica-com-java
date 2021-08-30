import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Double total = 0.0;
		
		System.out.print("Informe o valor da Conta de luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Informe o valor da Conta de água: ");
		total += scanner.nextDouble();
		
		System.out.print("Informe o valor da Conta de telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Informe o valor da Escola do filho: ");
		total += scanner.nextDouble();
		
		System.out.print("Informe o valor da Fatura do cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Informe o valor dos Gastos com supermercado: ");
		total += scanner.nextDouble();		
		
		System.out.print("O gasto total foi: " + total);
				
		scanner.close();
	}

}
