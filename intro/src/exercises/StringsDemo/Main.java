package exercises.StringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

//		System.out.println(); // Toplam karakter sayısını bulmak için:
//		System.out.println("Toplam karakter sayısı:" + mesaj.length());
//
//		System.out.println(); // İçerisinden bir karakteri yazdırmak için:
//		System.out.println("5. Karakter: " + mesaj.charAt(4));
//
//		System.out.println(); // Metinleri birleştirmek için:
//		System.out.println(mesaj.concat(" Yaşasın!"));
//		System.out.println(mesaj); // Yukarıdaki ifade ile aslında yeni bir string oluşturduk. +
//		System.out.println(); // = Tekrar kullanımlar için onu bir değişkene atamamız gerekmektedir.
//		System.out.println(mesaj = mesaj.concat(" Yaşasın!"));
//
//		String mesaj2 = "Bugün hava çok güzel.";
//		System.out.println(); // Hangi harf ile başladığını doğru yazarsak "true"; yanlış yazarsak "false" +
//								// = sonucunu döndürür.
//		System.out.println(mesaj2.startsWith("B"));
//
//		System.out.println(); // Hangi harf ile bittiğini doğru yazarsak "true"; yanlış yazarsak "false" +
//								// = sonucunu döndürür.
//		System.out.println(mesaj2.endsWith("."));
//
//		System.out.println(); // İstenilen karakterleri çağırmak için:
//		char[] karakterler = new char[10];
//		mesaj2.getChars(0, 10, karakterler, 0);
//		System.out.println(karakterler);
//
//		System.out.println(); // Aranan karakterin/metinin yazının içerisinde -indeksi ve aramayı baştan +
//								// = yaparak- kaçıncı eleman olduğunu bulmak için:
//		System.out.println(mesaj2.indexOf('ü'));
//		System.out.println(mesaj2.indexOf("ço"));
//
//		System.out.println(); // Aranan karakterin/metinin yazının içerisinde -indeksi baştan, aramayı sondan +
//								// = yaparak- kaçıncı eleman olduğunu bulmak için:
//		System.out.println(mesaj2.lastIndexOf('ü'));
//		System.out.println();
//		System.out.println("----------");
//		System.out.println(); // İstenilen bir karakteri yeni bir karakter ile değiştirmek için:
//		
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj);

		System.out.println(); // Yukarıdaki ifade ile aslında yeni bir string oluşturduk. +
		System.out.println("----------"); // // = Tekrar kullanımlar için onu bir değişkene atamamız gerekmektedir.
		System.out.println();

		String yenimesaj = mesaj.replace(' ', '-');
		System.out.println(yenimesaj);

		System.out.println();
		System.out.println(mesaj.substring(9)); // Bu ifade, belirtilen indeksten itibaren metni yazmaya/kesmeye yarar.
		System.out.println();
		System.out.println(mesaj.substring(2, 5)); // Bu ifade ise belirtilen indekslerin arasını kesmeye yarar.
		System.out.println(); // Split metodu, uygulandığı string'i parçalara böler ve bu parçaları bir diziye(array) atar.
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}	
		System.out.println(); // Aşağıdaki ifade, metindeki tüm karakterleri küçük karaktere çevirir.
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(); // Aşağıdaki ifade, etindeki tüm karakterleri büyük karaktere çevirir.
		
		System.out.println(mesaj.toUpperCase());
		System.out.println(); // Aşağıdaki ifade, metnin başında ve sonundaki boşlukları siler.
		
		String mesaj2 = "    Bugün hava çok güzel.    "; // Metnin başından ve sonundan 4 boşluk bırakılmıştır.
		System.out.println(mesaj2);
		System.out.println();
		System.out.println(mesaj2.trim());
	
	
	
	
	
	
	
	
	
	}

}
