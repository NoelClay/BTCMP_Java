package ch06.Homework;

public class MobilePhone {
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public String getIsUsePen() {
		if(isUsePen)
			return "지원";
		else
			return "미지원";
	}
	public void setUsePen(boolean isUsePen) {
		this.isUsePen = isUsePen;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	String companyName;
	String productName;
	String osName;
	String colorName;
	boolean isUsePen;
	int memory;
	int storage;
	int battery;
	
	void PrintInfo() {
		System.out.printf("회사: %s\n", getCompanyName());
		System.out.printf("제품: %s\n", getProductName());
		System.out.printf("운영체제: %s\n", getOsName());
		System.out.printf("컬러: %s\n", getColorName());
		System.out.printf("펜: %s\n", getIsUsePen());
		System.out.printf("메모리: %d(GB)\n", getMemory());
		System.out.printf("스토리지: %d(GB)\n", getStorage());
		System.out.printf("배터리: %d(mAh)\n", getBattery());
	}
}
