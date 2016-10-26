package cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad2 {
	static Scanner sc = new Scanner(System.in);

	public static String getUserString() {
		return sc.nextLine().trim();
	}

	public static Double getUserDouble() {
		return sc.nextDouble();
	}

	static List<String> listaLiczb = new ArrayList<String>(30);

	public static void main(String[] args) {
		listaLiczb.add("zero");
		listaLiczb.add("jeden");
		listaLiczb.add("dwa");
		listaLiczb.add("trzy");
		listaLiczb.add("cztery");
		listaLiczb.add("piec");
		listaLiczb.add("szesc");
		listaLiczb.add("siedem");
		listaLiczb.add("osiem");
		listaLiczb.add("dziewiec");
		listaLiczb.add("dziesiec");
		listaLiczb.add("jedenascie");
		listaLiczb.add("dwanascie");
		listaLiczb.add("trzynascie");
		listaLiczb.add("czternascie");
		listaLiczb.add("pietnascie");
		listaLiczb.add("szesnascie");
		listaLiczb.add("siedemnascie");
		listaLiczb.add("osiemnascie");
		listaLiczb.add("dziewietnascie");
		listaLiczb.add("dwadziescia");
		// dodawanie do tablicy liczb powyzej dwudziestu

		for (int i = 1; i < 10; i++) {

			listaLiczb.add("dwadziescia " + listaLiczb.get(i));
		}
		listaLiczb.add("trzydziesci");
		// powyzej trzydziestu do 39
		for (int i = 1; i < 10; i++) {

			listaLiczb.add("trzydziesci " + listaLiczb.get(i));
		}
		System.out.println("Podaj Liczbe słownie, zamienie ją na liczbę dziesietną");
		System.out.println("nie uzywaj Polskich znakow");
		String wczytanaLiczba;

		do {
			int a = 0;
			wczytanaLiczba = getUserString();

			for (int i = 0; i < listaLiczb.size(); i++) {

				wczytanaLiczba.equals(listaLiczb.get(i));

				if (wczytanaLiczba.equals(listaLiczb.get(i))) {
					System.out.println("Twoja Liczba to");
					System.out.println(a);
					break;

				} else
					a += 1;

			}
			if (a == 40) {
				System.out.println(
						"Musisz podać Liczbę słownie w przedziale od 0 do 39, bez polskich znaków, sproboj ponownie");
			}

		} while (!wczytanaLiczba.equalsIgnoreCase("x"));
	}
}
