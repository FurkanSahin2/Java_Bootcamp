package exercises.SayiBulma;

public class Main {

	public static void main(String[] args) {

		// Aranan sayının önceden verilmiş olan sayı kümesinin içerisinde yer alıp
		// almadığını belirten program yazın!

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}

		}

		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

	}
}
