package ch16.sec01;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		p.actionW((x,y )->{
			System.out.println(x+"가");
			System.out.println(y+"일을 합니다.");
		});
		
		p.actionS((x)->{
			System.out.println(x);
		});
		
		p.actionW((x,y )->System.out.println(x+"가"+y+"하기 싫대요"));
		p.actionS(x -> System.out.println(x + "하지마세요"));
		
	}

}
