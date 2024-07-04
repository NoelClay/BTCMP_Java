package ch08.HW.SmartPhone;

public interface SmartDisplay {

	default void flex(){
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		};
	default void roll(){
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		};
}
