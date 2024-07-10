package ch13.sec02.exam01;

public class GExample {

	public static <T> Box1<T> boxing(T t){
		Box1<T> box = new Box1<T>();
		box.set(t);
		return box;
	}
	
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		System.out.println(t1.getClass().getSimpleName() + t2.getClass().getSimpleName());
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product<Car, String> p1 = new Product<>();
		p1.setKind(new Car());
		p1.setModel("자동차");
		
		System.out.println(p1.getKind().getClass().getSimpleName() + p1.getModel());
		
		Product<TV, String> p2 = new Product<>();
		p2.setKind(new TV());
		p2.setModel("티브이");
		
		System.out.println(p2.getKind().getClass().getSimpleName() + p2.getModel());
		
		HomeAgency ha = new HomeAgency();
		TV t = ha.rent();
		
		CarAgency ca = new CarAgency();
		Car c = ca.rent();
		
		System.out.println(compare(100, 100.0));
		
		//Applicant는 제네릭 클래스 따라서 생성 방법은
		//new Applicant<치환타입>();
		Course.registerCouse3(new Applicant<Person>(new Person()));
		Course.registerCouse3(new Applicant<Worker>(new Worker()));
		//Course.registerCouse2(new Applicant<Student>(new Student()));
		//Course.registerCouse2(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCouse2(new Applicant<MiddelStudent>(new MiddelStudent()));
	}

}
