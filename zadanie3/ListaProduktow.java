import java.util.ArrayList;

public class ListaProduktow{
	public static void main(String[] args){
		ArrayList<Produkty> listaProduktow = new ArrayList<>();

		listaProduktow.add(new Produkty("Japek",5 ,7));
		listaProduktow.add(new Produkty("Pomarancz",1 ,5));
		listaProduktow.add(new Produkty("Grape",6 ,7));

		for(Produkty produkty : listaProduktow){
			System.out.println("========================================");
			produkty.wyswietl();
		}
	}
}
