package TemaClasse;

public class ObjetoCliente {
	public static void main(String[] args) {
		 Cliente cliente1 = new Cliente (1,"JU","15 99856-9442","533-366-788-99","55-725-522-55");
		
		System.out.println("---CLIENTE 1---");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		}
}
