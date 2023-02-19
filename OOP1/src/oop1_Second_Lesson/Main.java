package oop1_Second_Lesson;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrime(7500);
		product1.setDiscount(7);
		product1.setImageUrl("image1.jpg");
		product1.setUnitInStock(5);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrime(5000);
		product2.setDiscount(10);
		product2.setImageUrl("image2.jpg");
		product2.setUnitInStock(10);	

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrime(3500);
		product3.setDiscount(9);
		product3.setImageUrl("image3.jpg");
		product3.setUnitInStock(4);
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05322222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Furkan");
		individualCustomer.setLastName("Şahin");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05455555555");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = new Customer[] {individualCustomer, corporateCustomer};
	
		for (Customer customer : customers) {
			System.out.println(customer.getPhone());
		}

	}

}
