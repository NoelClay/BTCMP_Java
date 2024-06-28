package ch06.sec07.exam04;

public class Car {
	String company = "현대차";
	String model = "아반떼";
	String color = "화이트";
	int maxSpeed = 180;
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the maxSpeed
	 */
	public int getmaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setmaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public Car(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}
	public Car(String company) {
		super();
		this.company = company;
	}
	public Car() {
	}
	
}
