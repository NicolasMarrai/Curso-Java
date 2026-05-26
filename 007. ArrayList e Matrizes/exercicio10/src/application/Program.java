package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Players;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Players> players = new ArrayList<>();

		System.out.print("How many players?");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {

			System.out.println("Player: #" + (i + 1) + ":");

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Score: ");
			int score = sc.nextInt();

			players.add(new Players(name, score));
		}

		players.sort((p1, p2) -> p2.getScore().compareTo(p1.getScore()));

		System.out.println();
		System.out.println("RANKING:");
		System.out.println();

		for (int i = 0; i < players.size(); i++) {

			Players p = players.get(i);

			System.out.println((i + 1) + " - " + p.getName() + " - " + p.getScore());

		}

		sc.close();
	}

}
