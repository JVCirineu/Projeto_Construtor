package TemaClasse;

public class ObjetoEndereço {
	public static void main(String[] args) {
		 Endereco endereco1 = new Endereco ( 1, "rua dos bobos",12, "casa", 
				 "vila da paz", "itape", "12-208-030","sp");
		
		System.out.println("---ITEM TEMA 1---");
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());
		
		}
}
