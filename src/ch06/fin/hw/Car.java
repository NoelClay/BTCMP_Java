package ch06.fin.hw;

public class Car {

	String model;
	String color;
	String type;
	Company company;
	
	
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	Company getCompany() {
		return company;
	}
	void setCompany(Company company) {
		this.company = company;
	}
	
	
	Car(String model, String color, String type, Company company) {
		this.model = model;
		this.color = color;
		this.type = type;
		this.company = company;
	}
	void printInfo() {
		System.out.printf("모델: %s\n", getModel());
		System.out.printf("색상: %s\n", getColor());
		System.out.printf("타입: %s\n", getType());

		System.out.println("-----------");
		company.printInfo();
	}
}
