package TemaClasse;

public class ObjetoItemTema {
	public static void main(String[] args) {
		ItemTema itemTema1 = new ItemTema( 1, "Victor", "azul");
		
		System.out.println("---ITEM TEMA 1---");
		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
		System.out.println(itemTema1.getDescricao());
		}
}
