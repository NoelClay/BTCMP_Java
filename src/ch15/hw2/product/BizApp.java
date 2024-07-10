package ch15.hw2.product;


public class BizApp {

	public static <T extends Product> void something(T t) {
		t.printInfo();
	}
	
	public static void main(String[] args) {

		Shirts s = new Shirts("루즈핏 반팔 티셔츠", 30000, "L", "070-0123-5678");
		something(s);
		Biz.something(s);

		Umbrella u = new Umbrella("3단 자동우산", 18000, 105, "010-1111-2222 반품배송료 5,000(원)"); 
		Biz.something(u);
		something(u);

		// # Error
// Frozen Fruit ff = new Frozen Fruit("|| 1kg", 11900);
//
//
//

		//Biz.something (ff);// Error

		//Dried Fruit df = new Dried Fruit("250g, 9300); Biz.something(df);// Error

	}
}
