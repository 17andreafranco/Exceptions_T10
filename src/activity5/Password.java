package activity5;

import java.security.SecureRandom;

public class Password {

	private int length = 8;
	private String password = "";

	public Password() {

	}

	public Password(int length) {
		this.length = length;
		randomPassword();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPassword() {
		return password;
	}

	/* Genera una contraseña aleatoria */

	public void randomPassword() {

		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < this.length; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		this.password = sb.toString();

	}

	/*
	 * Compruba si la contraseña es fuerte o no, devuelve true si es fuerte y false
	 * se no lo es
	 */

	public boolean isStrong() {

		int contUpCase = 0;
		int contLowerCase = 0;

		for (int i = 0; i < this.password.length(); i++) {

			char caracter = this.password.charAt(i);
			if (Character.isUpperCase(caracter)) {
				contUpCase++;
			} else if (Character.isLowerCase(caracter)) {
				contLowerCase++;
			}
		}

		if (contUpCase >= 2 && contLowerCase >= 1 && this.password.matches(".*[0-9].*")) {
			return true;
		}

		return false;
	}

}
