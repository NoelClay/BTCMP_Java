package ch14.sec03;

public class YieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread tA = new Thread() {
			public boolean work = true;
			public void run() {
				while(true) {
					if(work) {
						System.out.println(getName()+ "작업처리");
					}
					else {
						Thread.yield();
					}
				}
			}
		};
		tA.setName("AA");
		
		Thread tB = new Thread() {
			public boolean work = true;
			public void run() {
				while(true) {
					if(work) {
						System.out.println(getName()+ "작업처리");
					}
					else {
						Thread.yield();
					}
				}
			}
		};
		tB.setName("BB");
		
		tA.start();
		tB.start();
		
//		try {
//			
//		}catch{
//			
//		}
//		tA.wo
	}

}
