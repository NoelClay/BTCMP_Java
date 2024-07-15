package ch14.HW.AtmApp;
public class BankAccount {

	private String accountNo; // 계좌번호
	private int balance; // 잔액

	public BankAccount(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public synchronized void withDraw(String threadName, int cnt, int money) {

		System.out.println(accountNo + " | " + threadName + " | " + cnt + " | 시작 | 요청=" + money + " | 잔액=" + balance);

		if (balance >= money) {

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			balance = balance - money;
			System.out.println(
					accountNo + " | " + threadName + " | " + cnt + " | 종료 | 출금=" + money + " | 잔액=" + balance);
		} else {
			System.out.println(accountNo + " | " + threadName + " | " + cnt + " | 종료 | 요청=" + money + " | 잔액="
					+ balance + " | 출금불가(잔액부족)");
		}

	}
}
