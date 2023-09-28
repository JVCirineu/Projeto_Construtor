package TemaClasse;
 

public class ObjetoTema {
	public static void main(String[] args) {
	Tema tema1 = new Tema( 1, "Victor",1.500, "azul");
	
	System.out.println("---TEMA 1---");
	System.out.println(tema1.getId());
	System.out.println(tema1.getNome());
	System.out.println(tema1.getValorAluguel());
	System.out.println(tema1.getCorToalha());
	}
}
