package activity5;

import java.util.Scanner;

public class MainActivity5 {

	public static void main(String[] args) {

		Password pw[] = new Password[10];

		Scanner sc = new Scanner(System.in);
		Integer lengthPassword[] = new Integer[30];

		for (int i = 0; i < pw.length; i++) {
			System.out.print("Input a length for the password: ");
			lengthPassword[i] = sc.nextInt();
		}

		sc.close();
		
		for (int i = 0; i < pw.length; i++) {

			pw[i] = new Password(lengthPassword[i]);

		}
		
		Boolean isStrong[] = new Boolean[30];

		
		for (int i = 0; i < pw.length; i++) {

			isStrong[i]= pw[i].isStrong();

		}
		
		for (int i = 0; i < pw.length; i++) {

			System.out.println(pw[i].getPassword()+" "+ isStrong[i]);
			

		}

	}

}
