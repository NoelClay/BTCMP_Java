package ch16.hw;

public class Quiz5 {

	public static void main(String[] args) {

	    System.out.println("===== Anonymous =====");
	    ISayable sayable0 = new ISayable() {
	        @Override
	        public void sayHello() {
	            System.out.println("Hello");
	        }
	    };
	    sayable0.sayHello();

	    System.out.println("\n===== Lambda =====");
	    System.out.println("----- Type 1 -----");
	    // Anonymous -> Lambda
	    ISayable sayable1 = () -> System.out.println("Welcome");

	    sayable1.sayHello();

	    System.out.println("\n----- Type 2 -----");
	    // Lambda : French 사용
	    ISayable sayable2 = () -> French.greeting();

	    sayable2.sayHello();

	    System.out.println("\n----- Type 3 -----");
	    // Method Reference : French 사용
	    ISayable sayable3 = French :: greeting;
	    
	    sayable3.sayHello();
	}


}
