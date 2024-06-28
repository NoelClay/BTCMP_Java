package ch06.Homework;

public class SunCream {

	String Company;

	public void setCompany(String string) {
		// TODO Auto-generated method stub
		Company = string;
	}
	String Name;
	public void setName(String string) {
		// TODO Auto-generated method stub
		Name = string;
	}
	boolean Stickiness;
	public void setStickiness(boolean b) {
		// TODO Auto-generated method stub
		Stickiness = b;
	}
	char SkinType;
	public void setSkinType(char c) {
		// TODO Auto-generated method stub
		SkinType = c;
	}
	int Capacity;
	public void setCapacity(int i) {
		// TODO Auto-generated method stub
		Capacity = i;
	}
	int Spf;
	public void setSpf(int i) {
		// TODO Auto-generated method stub
		Spf = i;
	}
	String Pa;
	public void setPa(String string) {
		// TODO Auto-generated method stub
		Pa = string;
	}

	public String getCompany() {
		return Company;
	}
	
	public String getName() {
		return Name;
	}

	public boolean isStickiness() {
		return Stickiness;
	}

	public char getSkinType() {
		return SkinType;
	}

	public int getCapacity() {
		return Capacity;
	}

	public int getSpf() {
		return Spf;
	}

	public String getPa() {
		return Pa;
	}
	public String DetermineType() {
		String result;
		switch(getSkinType()) {
		case 's'-> result = "민감성";
		case 'o'-> result = "지성";
		case 'n'-> result = "중성";
		case 'd'-> result = "건성";
		default -> result = "알수 없음" ;
		}
		return result;
	}
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.printf("회사: %s\n", getCompany());
		System.out.printf("제품: %s\n", getName());
		System.out.printf("%s\n", isStickiness()?"끈적임":"끈적임없음");
		System.out.printf("피부타입: %s\n", DetermineType());
		System.out.printf("용량: %d(ml)\n", getCapacity());
		System.out.printf("SPF: %d\n", getSpf());
		System.out.printf("PA: %s\n", getPa());
	}

}
