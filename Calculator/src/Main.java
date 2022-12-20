import java.util.Scanner;

public class Main {
	public static int sayi1 = 0;
	public static int sayi2 = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		menuGoster();

		int islem = scanner.nextInt();

		if (islem == 1) {
			sayilar();
			toplama();
		} else if (islem == 2) {
			sayilar();
			cıkarma();
		} else if (islem == 3) {
			sayilar();
			carpma();
		} else if (islem == 4) {
			sayilar();
			bolme();
		} else
			System.out.println("Geçersiz bir değer girildi");

	}

	public static void sayilar() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Sayı: ");
		sayi1 = scanner.nextInt();
		System.out.println("2. Sayi: ");
		sayi2 = scanner.nextInt();
	}

	public static void menuGoster() {
		System.out.println(" 1: + => Toplama");
		System.out.println(" 2: - => Çıkarma");
		System.out.println(" 3: * => Çarpma");
		System.out.println(" 4: / => Bölme");
		System.out.println();
		System.out.println("Bir işlem seçiniz: ");
	}

	public static void toplama() {
		System.out.println("Toplama Sonucu: " + (sayi1 + sayi2));
	}

	public static void cıkarma() {
		System.out.println("Çıkarma Sonucu: " + (sayi1 - sayi2));
	}

	public static void carpma() {
		System.out.println("Çarpma Sonucu: " + (sayi1 * sayi2));
	}

	public static void bolme() {
		System.out.println("Bölme Sonucu: " + (sayi1 / sayi2));
	}

}