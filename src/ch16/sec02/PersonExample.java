package ch16.sec02;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person p2 = new Person();
		 
		 p2.actionC((x,y)->Computer.staticMethod(x, y));
		 
		 p2.actionC((x,y)->{
			 return Computer.staticMethod(x, y);
		 });
		 
		 p2.actionC(Computer::staticMethod);
		 
		 Computer c = new Computer();
		 
		 p2.actionC((x, y)-> c.instanceMethod(x, y));
		 
		 p2.actionC(c::instanceMethod);
		 
		 Member m1 = p2.getMember1(Member :: new);
		 System.out.println(m1);
		 
		 Member m2 = p2.getMember2(Member :: new);
		 System.out.println(m2);
		 
	}
}
