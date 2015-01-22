public class Mot {

	String mot;

	public Mot(String mot) {
		this.mot = mot;
	}

	String getComplementary() {
		String complementary = "";
		for (int i = 0; i < mot.length(); i++)
			switch (mot.charAt(i)) {
			case 'A':
				complementary += "T";
				break;
			case 'T':
				complementary += "A";
				break;
			case 'G':
				complementary += "C";
				break;
			case 'C':
				complementary += "G";
				break;

			}
		return complementary;
	}

	String getReverse() {
		String reverse = "";

		for (int i = mot.length(); i >= 0; i--)
			reverse += mot.charAt(i);

		return reverse;
	}

	String getReverseComplementary() {
		return new Mot(getReverse()).getComplementary();
	}

	int getSize() {
		return mot.length();
	}
}
