package exercises.ClassesWithAttributes;

public class Product {
	
	// attribute | field 	 

	// Not-1: default: Herhangi bir erişim belirtecinin kullanılmadığı durumda Java otomatik olarak yine sarmalama işlemini gerçekleştirir. 
	// Bu durumda bulunduğu sınıf ve paket üzerinden metot ve değişkenlere erişim sağlanabilir.
	
	// Not-2: Bir sınıfa ait metot veya değişken private olarak tanımlandığında sadece kendi sınıfının üyeleri (sadece tanımlandığı bloğun içerisinden) tarafından erişilebilir olmaktadır.
	// Dışarıdan erişim hiçbir şekilde mümkün değildir. 
	
	private int id; // aslında burada ilk başta tanımlanan özelliklerin tamamının başında "public" vardır. Fakat erişim belirtecini direkt yazarak değiştirebiliriz.
	private String _name;
	private String description; // açıklama
	private double price;
	private int stockAmount; // Stok miktarı
	private String kod;
	
	// getter 	
	public int getId() {
		return id;
	}
	
	// setter	
	public void setId(int id) {
		this.id = id; // this.id = Bu class'ın (Product) id'si demektir. Aynı zamanda bu şekilde yazımın alternatifi --> "id = id;"
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name; // Alternatif yazımı kullanırken olası karışıklığı önlemek için -doğru kullanım pratiği doğrultusunda- field isminin başına 'alt çizgi / _' yazarız.
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getKod() {
		return this._name.substring(0, 1) + id;
	}
	

}
