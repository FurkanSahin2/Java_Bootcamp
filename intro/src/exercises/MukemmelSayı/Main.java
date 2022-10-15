package exercises.MukemmelSayı;

public class Main {

	public static void main(String[] args) {
		// Soru: Bir sayının 'mükemmel' olup olmadığını bulan programı yazın.

		// Mükemmel sayı, kendisi hariç pozitif tam bölenlerinin toplamı kendisine
		// eşit olan sayıdır. Örneğin: 6 --> 1, 2, 3' e bölünür ve bu sayıların toplamı:
		// 6'dır.

		int number = 6;
		int total = 0;

		if (number < 0) {
			System.out.println("Geçersiz sayı girilmiştir.");
			return;
		}

		if (number < 6) {
			System.out.println(number + " mükemmel bir sayı değildir.");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println(number + " mükemmel bir sayıdır.");
		} else {
			System.out.println(number + " mükemmel bir sayı değildir.");
		}
		return;

	}
}
