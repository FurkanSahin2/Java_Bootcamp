package exercises.Classes;

public class Main {

	public static void main(String[] args) {
		
		// class = reference type
		
		CustomerManager customerManager = new CustomerManager(); // artık heapte onu tutan bir referans numarası bulunmamaktadır.
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Uptade();
		
		// int, String ... = value type
		
		int sayi1 = 5;
		int sayi2 = 10;
		sayi2 = sayi1;
		sayi1 = 15;
		System.out.println(sayi2); // cevap: 5 
		
		// array = reference type
		
		int[] sayilar1 = {1, 2, 3}; // or: int [] sayilar = new int[] {1, 2, 3};
		int[] sayilar2 = {4, 5, 6}; // artık heapte onu tutan bir referans numarası bulunmamaktadır.
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]); // cevap: 10
		
		
		
		
		
		
	}

}
