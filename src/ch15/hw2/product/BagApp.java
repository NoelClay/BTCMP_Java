package ch15.hw2.product;


public class BagApp{
	public static void main(String[] args) {
//#제네릭

		Shirts s = new Shirts("루즈핏 반팔 티셔츠", 30000, "L", "070-0123-5678");

		Bag<Shirts>bs = new Bag<>(s);

		bs.printInfo();

		Umbrella u = new Umbrella("3단 자동우산", 18000, 105, "010-1111-2222 반품배송료 5,000(원)"); Bag<Umbrella> bu= new Bag<>(u);

		bu.printInfo();

		FrozenFruit ff = new FrozenFruit("냉동 칠레산 블루베리 1kg", 11900); Bag<FrozenFruit> bff = new Bag<FrozenFruit>(ff);

		bff.printInfo();

		DriedFruit df = new DriedFruit("유기농 건 살구250g", 9300); Bag<DriedFruit> bdf = new Bag<DriedFruit>(df); bdf.printInfo();
// # Error
// Bag<String> string = Bag<String>("Hello"); // Error // Bag<Integer> integer = Bag<Integer>(10); // Error

	}
}