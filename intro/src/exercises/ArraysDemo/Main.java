package exercises.ArraysDemo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----Statik----");
		System.out.println();
		
		String ogrenci1 = "Furkan";
		String ogrenci2 = "Ali";
		String ogrenci3 = "Yusuf";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println();
		System.out.println("----Diziler----");
		System.out.println();
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Furkan";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Yusuf";
		ogrenciler[3] = "Ahmet";
		
		for (int i=0 ; i<ogrenciler.length ; i++ ) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println();
		System.out.println("----2.Yöntem----");
		System.out.println();
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}	
		
		
	}

}
