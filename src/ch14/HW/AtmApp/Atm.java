package ch14.HW.AtmApp;
public class Atm extends Thread {

	private BankAccount bankAccount;
	private String atmName;
	private int cnt; // 접근 횟수

	public Atm(BankAccount bankAccount, String atmName) {
		this.bankAccount = bankAccount;
		this.atmName = atmName;
	}

	public  void run() {

		while (bankAccount.getBalance() > 0) {
			// money : 100, 200, 300, 400
			int money = (int) (Math.random() * 4 + 1) * 100;
			cnt = cnt + 1;
			bankAccount.withDraw(atmName, cnt, money); // 인출
		}

	}

}
