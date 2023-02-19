package exercises.ArkadasSayilar;

public class Main {

	public static void main(String[] args) {

		// Arkadaş sayıları hesaplayın.

		// Arkadaş Sayı:Kendileri hariç pozitif tam bölenlerinin toplamı birbirine
		// eşit olan sayılardır. Örneğin; Bilinen en küçük arkadaş sayı: 220-284
		// Yani, 220'nin kendisi hariç tam bölenlerinin toplamı 284'e eşitken;
		// 284'ün kendisi hariç tam bölenlerinin toplamı 220'ye eşittir.

		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}

		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		} else {
			System.out.println("Bu iki sayı arkadaş değildir.");

		}

	}

}
