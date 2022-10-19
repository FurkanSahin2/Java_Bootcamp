package exercises.ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(1); 
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(15);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		// System.out.println(product.name);
		
		
	}

}
