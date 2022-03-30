package com.phogi.sandbox;

import java.util.Random;

public class RandomX {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			double rand = Math.random();
			int min = -5; // shift
			int max = 10;
			int range = max - min + 1;
			int shift = 65;
			int jumps = 3;

			System.out.println(rand + " : " + ((int) (rand * range)) + " : " + ((int) (min + (rand * range))) + " : "
					+ ((int) (shift + (rand * range))) + " : " + (jumps * ((int) (rand * range))));
		}

		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			double rand = random.nextDouble();
			int min = -5; // shift
			int max = 10;
			int range = max - min + 1;
			int shift = 65;
			int jumps = 3;

			System.out.println(rand + " : " + ((int) (rand * range)) + " : " + ((int) (min + (rand * range))) + " : "
					+ ((int) (shift + (rand * range))) + " : " + (jumps * ((int) (rand * range))));
		}

		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int rand = random.nextInt();
			int shift = 65;
			int jumps = 3;

			System.out.println(rand + " : " + (shift + rand) + " : " + (jumps * rand));

			System.out.println(rand);
			// int min = -5; // shift
			// int max = 10;
			// int range = max - min + 1;
			//
			// System.out.println(rand + " : " +
			// ((int) (rand * range)) + " : " +
			// ((int) (min + (rand * range))) + " : " +
			// ((int) (shift + (rand * range)))
			// );
		}

		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int min = -5; // shift
			int max = 10;
			int range = max - min + 1;
			int shift = 65;
			int jumps = 3;

			int rand = random.nextInt(range);

			System.out.println(rand + " : " + (min + rand) + " : " + (shift + rand) + " : " + (jumps * rand));
		}

	}

}
