package ch12.sec11;

public class GetClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		
		Class cla;
		
		{
			cla = null;
		}
		
		try {
			cla = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(cla.getName());
	}

}
