import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		MatchHelper();

	}

	static Scanner in = new Scanner(System.in);

	static void MatchHelper() {
		int n = 0; // numer elementu ciagu

		int a1 = 1; // pierwszy wyraz ciagu
		int q = 2;// wartosc iloczynu

		System.out.println("Podaj numer elementu ci�gu");
		n = in.nextInt();
		System.out.println("Podaj pierwszy wyraz Ci�gu");
		a1 = in.nextInt();
		System.out.println("Podaj warto�� iloczynu");
		q = in.nextInt();

		int wynik;
		wynik = a1;

		for (int x = 0; x < n; x++) {
			wynik = wynik * q;

		}
		System.out.println("Poszukiwana warto�� to"+ wynik);

	}
}
