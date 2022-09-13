package activity2;

public class MyException extends Exception {


	private static final long serialVersionUID = 1L;
	
	private int code;

	public MyException(int code) {
		super();
		this.code = code;
	}

	public MyException() {
		super();
	}

	@Override

	public String getMessage() {

		String mensaje = "";

		switch (this.code) {

		case 1:
			mensaje = "Exceprion 1: Email already exists";
			break;

		case 2:
			mensaje = "Exceprion 2: Empty field";
			break;

		}

		return mensaje;

	}

}
