package activity1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomNumber {

	private int randNum;

	public RandomNumber() {
		randomNumber();
	}

	public void randomNumber() {
		this.randNum = (int) (Math.random() * 500 + 1);
	}

	/*
	 * Combrueba si el numero es igual, mayor o mas pequeño que el numero generado
	 * aleatoriamente
	 */

	public boolean findNumber() throws IOException {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.print("Input a number: ");
			int num = sc.nextInt();

			if (num < this.randNum) {

				System.out.println("The number is bigger");
				return false;

			} else if (num > this.randNum) {

				System.out.println("The number is smaller");
				return false;

			} else {
				System.out.println("You find the number!");
				sc.close();
				return true;
			}

		} catch (InputMismatchException ex) {
			System.out.println("The input is not correct, please try again");
			return false;

		}

	}
	
	/*
	 * Contador de intentos del usuario
	 */

	public void countAnswers() throws IOException {

		int cont = 1;

		while (!findNumber()) {
			cont++;
		}

		System.out.println("You've tried: " + cont);

	}

}
