package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Harlen";
		cliente.ultimoNome = "Lima";
		cliente.telefone = "85999630145";
		cliente.email = "harlenregis@hotmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Alessandra";
		cliente2.ultimoNome = "Lima";
		cliente2.telefone = "88988889290";
		cliente2.email = "alessandralima@hotmail.com";
		
//		System.out.println("Nome do cliente: " + cliente.obterNomeCompleto(cliente)); // Esse é o método estático.
		
		System.out.println("Nome do cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome do cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;
//	}

}
