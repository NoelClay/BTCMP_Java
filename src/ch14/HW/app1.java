package ch14.HW;

public class app1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("========main() : Start============");
		
		Task t = new Task();
		t.biz();
		
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        
        System.out.println("\n========normal : End============");
        
        System.out.println("\n=정통파: 런을 구현하는 러너블 자식 객체 구현후에 쓰레드 생성자에 투입=");
		
        Thread th1 = new Thread(new MyRunnable());
        th1.start();
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        
        
        System.out.println("\n========정통파 : End============");
        
        
        System.out.println("\n=정통파2: 런을 구현하는 쓰레드 자식 객체 구현후에 쓰레드 생성자호출=");
		
        MyThread th0 = new MyThread();
        th0.start();
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        
        
        System.out.println("\n========정통파2 : End============");
        
        
        
        System.out.println("\n=러너블 익명객체 투입: 런을 구현하는 러너블 자식 익명 객체쓰레드 생성자에 투입=");
		
        Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
		        for (int i = 0; i < 3000; i++) {
		            System.out.print("-");
		        }

			}
        	
        });
        th2.start();
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        
        
        System.out.println("\n========러너블 익명 인터페이스 객체 투입 : End============");
        
        System.out.println("\n=자기 자신 자식 익명 객체의 run 함수 오버라이딩====");
		
        Thread th3 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
		        for (int i = 0; i < 3000; i++) {
		            System.out.print("-");
		        }

			}
        	
        };
        th3.start();
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        
        
        System.out.println("\n========자기 자신 자식 익명 객체의 run 함수 오버라이딩 : End============");
	
        
        System.out.println("\n====인터페이스를 Thread 생성자 매개변수로 전달하는데 이걸 람다식으로====");
		
        Thread th4 = new Thread(()-> {
	        for (int i = 0; i < 3000; i++) {
	            System.out.print("-");
	        }
        });
        th4.start();
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        
        
        System.out.println("\n========람다식 매개변수  : End============");
	}

}
