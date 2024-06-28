package ch06.sec07.exam04;

public class CarExam {

	static void ShowDetail(Car car) {
		
		System.out.printf("%s의 company: %s\n", car.getClass().getSimpleName(), car.getCompany());
		System.out.printf("%s의 모델명: %s\n", car.toString(), car.getModel());
		System.out.printf("%s의 색상: %s\n", car.getClass().getDeclaredFields(), car.getColor());
		System.out.printf("%s의 최대속력: %s\n", car.getClass().getName(), car.getmaxSpeed());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		ShowDetail(c1);

	}


}
