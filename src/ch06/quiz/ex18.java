package ch06.quiz;

public class ex18 {

}

class ShopService{
	
	static ShopService instance;
	
	public static ShopService getInstance() {
		return instance;
	}
	
	private ShopService() {
		instance = new ShopService();
	}
}

class Account{
	int balance;
	static final int MIN_BALANCE = 0; 
	static final int MAX_BALANCE = 1000000; 

	int getBalance() {
		return balance;
	}

//	void setBalance(int balance) {
//		if(balance ==)
//		this.balance = balance;
//	}
	
}
