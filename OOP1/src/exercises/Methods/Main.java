package exercises.Methods;

public class Main {

	public static void main(String[] args) {

		// Metot oluşturma 

		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
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
			System.out.println("Aranan sayı: " + aranacakSayi + " mevcuttur");
		} else {
			System.out.println("Aranan sayı: " + aranacakSayi + " mevcut değildir");
		}

	}

	public void mesajVer(String mesaj) {

		System.out.println(mesaj);
	}

}
