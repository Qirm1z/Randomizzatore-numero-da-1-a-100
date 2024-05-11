package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();

		boolean conferma = true;

		Scanner sc = new Scanner(System.in);
		do {

			int randomN = r.nextInt(100) + 1;

			System.out.println("Indovina il numero compreso tra 1 e 100.");

			int guess;
			do {
				System.out.println("Inserisci il tuo numero: ");
				guess = sc.nextInt();

				if (guess < randomN) {
					System.out.println("Il tuo numero è troppo basso.");
				} else if (guess > randomN) {
					System.out.println("Il tuo numero è troppo alto.");
				} else {
					System.out.println("Hai indovinato.");
				}
			} while (guess != randomN);
			System.out.println("Vuoi rigiocare? (sì/no)");
			String input = sc.next();
			conferma = input.equalsIgnoreCase("sì") || input.equalsIgnoreCase("si");
		} while (conferma);
		sc.close();
	}

}
