package Itens;

public class ItemMain {

	public static void main(String[] args) {
		
		

		Item i = new Item(5625, "chave biblioteca");
		System.out.println(i);

		

		Livro l = new Livro(5625, "chave conta", "O Pequeno Príncipe");
		System.out.println(l);

		

		Midia m = new Midia(5625, "chave conta", "Deck", 55);
		System.out.println(m);

		

		CD cd = new CD(5625, "chave conta", "Deck", 55, 5, "Matanza", "Clube dos Canalhas");
		System.out.println(cd);

		

		VHS VHS = new VHS(5625, "chave conta", "Howard Hawks", 55, "Bola De Fogo");
		System.out.println(VHS);
	}

}