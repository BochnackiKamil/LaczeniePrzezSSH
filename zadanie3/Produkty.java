public class Produkty{
	String nazwa;
	int liczba;
	int cena;

	public Produkty(String nazwa, int liczba, int cena){
		this.nazwa = nazwa;
		this.liczba = liczba;
		this.cena = cena;
	}

	public void wyswietl(){
		System.out.println("Nazwa: " + nazwa + ", Ilosc: " + liczba + ", Cena: " + cena);
	}
}
