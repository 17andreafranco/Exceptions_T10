package activity4;

public class Calculator {

	private Integer a;
	private Integer b;

	public Calculator() {

	}

	public Calculator(Integer a, Integer b) {
		this.a = a;
		this.b = b;

	}

	public float getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void sum() {
		try {
			float result = a + b;
			System.out.println(a + " + " + b + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

	public void subtract() {
		try {
			float result = a - b;
			System.out.println(a + " - " + b + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

	public void multiply() {
		try {
			float result = a * b;
			System.out.println(a + " * " + b + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

	public void divide() {
		try {
			float result = a / b;
			System.out.println(a + " / " + b + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

	public void power() {
		
		try {
			double result = Math.pow(a,b);
			System.out.println(a + " ^ " + b + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		

	}

	public void squereRoot() {

		try {
			double result = Math.sqrt(a);
			if (Double.isInfinite(result) || Double.isNaN(result)) {	        
				throw new ArithmeticException("Illegal double value: " + result);

			}else {
				System.out.println(a + " ^ " + b + " = " + result);
			}
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

	public void cubeRoot() {
		try {
			double result = Math.cbrt(a);
			System.out.println("cbrt(" + a + ") " + "= " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}

}
