package ch11.sec06;

public class Account {
	private long balance;
	public Account() {
		
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws InsufficientException {
		System.out.println(money + " 출금을 시도합니다");
		if(balance < money) {
			throw new InsufficientException("잔고부족: "+ (money-balance)+" 모자람");
		}
		balance -= money;
		System.out.println(balance + " 남았습니다.");
		
	}
}
