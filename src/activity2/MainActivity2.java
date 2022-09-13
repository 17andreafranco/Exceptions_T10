package activity2;

import java.util.Scanner;

public class MainActivity2 {

	public static void main(String[] args) {
		String email = "andrea@gmail.com";
		
		try {
			System.out.print("Email: ");
			
			Scanner sc = new Scanner(System.in);
			String emailInput = sc.nextLine();
			sc.close();
			
			
			if(emailInput.equalsIgnoreCase(email)) {
				throw new MyException(1);
			}else if(emailInput.equalsIgnoreCase("")) {
				throw new MyException(2);
			}
			
		}catch(MyException ex) {
			
			System.out.println(ex.getMessage());
			
		}

	}

}
