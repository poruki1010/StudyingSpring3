package sample.di.business.domain;

public class Product {

	//フィールド
	private String name;
	private int price;

	//コンストラクタ（実質setter)
	public Product(String name ,int price) {
		this.name = name;
		this.price = price;
	}
	//getter
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
		
	}
	
}
