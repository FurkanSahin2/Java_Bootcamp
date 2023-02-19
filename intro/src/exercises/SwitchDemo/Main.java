package exercises.SwitchDemo;

public class Main {

	public static void main(String[] args) {

		// grade: not
		char grade = 'A';

		// case: durum
		switch (grade) {

		case 'A': {

			System.out.println("Mükemmel: Geçtiniz");
			break;
		}
		//iki durumda da aynı çıktının alınması istendiğinde bu şekilde yazılır:
		case 'B':
		case 'C':
			System.out.println("İyi: Geçtiniz");
			break;

		case 'D':
			System.out.println("Fena değil: Geçtiniz");
			break;

		case 'F':
			System.out.println("Maalesef: Kaldınız");
			break;

		default:
			System.out.println("Geçersiz not girdiniz");

		}

	}

}
