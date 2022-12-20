import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		

		System.out.println(" 1. Toplama");
		System.out.println(" 2. Çıkarma");
		System.out.println(" 3. Çarpma");
		System.out.println(" 4. Bölme");
		System.out.println();
		System.out.print("İşlem türünü seçiniz: ");
		int islem = scanner.nextInt();
		System.out.println();
		
		System.out.print("1. Sayi: ");
		int sayi1 = scanner.nextInt();

		System.out.print("2. Sayi: ");
		int sayi2 = scanner.nextInt();
		
		
		
		
		if (islem == 1){
			System.out.println("Toplama Sonucu: " + (sayi1 + sayi2));
			
		} else if (islem == 2) {
		 System.out.println("Çıkarma Sonucu: " + (sayi1 - sayi2));	
		} else if (islem == 3) {
			 System.out.println("Çarpma Sonucu: " + (sayi1 * sayi2));	
		} else if (islem == 4) {
			 System.out.println("Bölme Sonucu: " + ((float)sayi1 / sayi2)); }
		else
		{
			System.out.println("Geçersiz bir değer girdiniz");
		}
	}
}
