package exercises.SesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		// Soru: Bir sesli harfin kalın mı yoksa ince mi olduğunu belirten bir programı yazın.

		
		char harf = 'Ö';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'U':
			case 'O':	
			System.out.println(harf + " kalın sesli bir harftir.");
			break;
			
			// "default;" yazmamız ile altta yazılanlara ihtiyaç duymayız.
			case 'E':
			case 'İ':
			case 'Ü':
			case 'Ö':
			System.out.println(harf + " ince sesli bir harftir.");
		}
		
		
		
		
		
	
	}

}
