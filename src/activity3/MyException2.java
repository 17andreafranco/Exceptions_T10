package activity3;

public class MyException2 extends Exception {


	private static final long serialVersionUID = 1L;
	
	private int code;

	public MyException2(int code) {
		super();
		this.code = code;
	}

	public MyException2() {
		super();
	}

	@Override

	public String getMessage() {

		String mensaje = "";

		switch (this.code) {

		case 1:
			mensaje = "Exceprion 1: Odd";
			break;

		case 2:
			mensaje = "Exceprion 2: Even";
			break;

		}

		return mensaje;

	}

}
