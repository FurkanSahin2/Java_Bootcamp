package exercises.Methods2;

public class Main {

	public static void main(String[] args) { // args --> arguments = parametreler

		// Not: Void, değer döndermeden yapılacak fonksiyonel işlemlerin
		// gerçekleştirilmesi için kullanılır.
		// Diğer tarafa sonucu göndermez sonuc ya o class içerisinde kalır ya da ekrana
		// yazdırılabilir.

		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(mesaj);
		System.out.println(yeniMesaj);

		System.out.println("");

		String Mesaj2 = sehirVer();
		System.out.println(Mesaj2);

		System.out.println("");

		int sayi = topla(6, 7);
		System.out.println(sayi);

		System.out.println("");
		
		int sayi2 = topla2(3,4,7,9,7,2);
		System.out.println(sayi2);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {

		System.out.println("Silindi");
	}

	public static void guncelle() {

		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {

		return "Ankara";
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam+=sayi; // == toplam = toplam + sayi
		}
		return toplam;
	}

}
