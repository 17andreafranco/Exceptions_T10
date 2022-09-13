package activity3;

public class MainActivity3 {

	public static void main(String[] args) {

		try {
			
			System.out.println("Generated a random number");
			int num = (int) (Math.random() * 500 + 1);
			
			if ((num%2) != 0) {
				System.out.println("The rendom number generated is: "+ num);
				throw new MyException2(1);
			} else if ((num%2) == 0) {
				System.out.println("The rendom number generated is: "+ num);
				throw new MyException2(2);
			}

		} catch (MyException2 ex) {

			System.out.println(ex.getMessage());

		}

	}

}