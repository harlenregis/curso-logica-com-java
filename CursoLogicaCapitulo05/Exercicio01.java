import java.util.Scanner;

public class Exercicio01 {
		
	static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
	
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");
		
		System.out.print("Portugu�s: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Matem�tica: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaPortugues >= NOTA_MINIMA;
		Boolean estaAcimaDoMinimoEmMatematica = notaMatematica >= NOTA_MINIMA;
		
		Double notaTotal = notaPortugues + notaMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;
		
		if(passou) {
			System.out.println("Parab�ns! Voc� passou.");
		} else {
			System.out.println("Infelizmente, n�o foi dessa vez.");
		}
		
		scanner.close();
	}	
}
