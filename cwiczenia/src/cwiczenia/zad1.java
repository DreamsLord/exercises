package cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad1 {

	static Scanner sc = new Scanner(System.in);

	public static String getUserString() {
		return sc.nextLine().trim();
	}

	public static Double getUserDouble() {
		return sc.nextDouble();
	}

	static List<Double> listaNumerow = new ArrayList<Double>();

	public static void main(String[] args) {

		System.out.println("wpisuj liczby do zsumowania po każdej naciśnij enter");
		System.out.println("Gdy już wpiszesz wszystkie naciśnij wybierz x");
		String wyborUzytkownika;
		do {
			System.out.println("Wpisz liczbe do zsumowania");
			System.out.println("zakoncz [x]");
			wyborUzytkownika = getUserString();
			double suma = 0;
			if (!wyborUzytkownika.equalsIgnoreCase("x")) {

				double wczytanaLiczba;
				wczytanaLiczba = Double.valueOf(wyborUzytkownika);

				listaNumerow.add(wczytanaLiczba);

				System.out.println("Twoje liczby to:");
				for (int i = 0; i < listaNumerow.size(); i++) {

					System.out.println(listaNumerow.get(i));
					suma = suma + listaNumerow.get(i);
				}
				System.out.println("Suma Uzytkownika wynosi");
				System.out.println(suma);
			}

		} while (!wyborUzytkownika.equalsIgnoreCase("x"));

	}

}