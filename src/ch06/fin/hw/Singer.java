package ch06.fin.hw;

public class Singer {
	String name;
	char sex;
	String birthDate;
	String company;
	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	void setSex(char sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthDate
	 */
	String getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the company
	 */
	String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	void setCompany(String company) {
		this.company = company;
	}
	Singer(String name, char sex, String birthDate, String company) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.company = company;
	}
	void printInfo() {
		System.out.printf(" 이름: %s | ", getName());
		System.out.printf(" 성별: %c | ", getSex());
		System.out.printf(" 생년월일: %s | ", getBirthDate());
		System.out.printf(" 소속사: %s |", getCompany());
		System.out.println();
	}
	
	
}
