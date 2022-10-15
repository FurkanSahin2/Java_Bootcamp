package exercises.ReCapDemo1;

public class Main {

	public static void main(String[] args) {
	int sayi1, sayi2, sayi3, enBuyuk;
	sayi1 = 43;
	sayi2 = 25;
	sayi3 = 5;
	enBuyuk= sayi1;
	 
	if (enBuyuk < sayi2) {
		enBuyuk = sayi2;	
	} 
	
	if (enBuyuk < sayi3) {
		enBuyuk = sayi3;
	}
		
	
	System.out.println("En Büyük: " + enBuyuk);
	}

}
