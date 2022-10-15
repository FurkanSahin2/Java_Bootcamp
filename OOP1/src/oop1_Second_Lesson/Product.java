package oop1_Second_Lesson;

public class Product {

	private String name;
	private double unitPrime; // Birim Fiyatı
	private double discount; // İndirim Oranı
	private String imageUrl;
	private int unitInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrime() {
		return unitPrime;
	}

	public void setUnitPrime(double unitPrime) {
		this.unitPrime = unitPrime;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

}
