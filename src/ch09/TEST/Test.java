package ch09.TEST;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Outer o = new Outer();
		//Outer.Inner i = new Outer.Inner(); 이너는 static 영역에 없기에 바로 호출이 불가해.
		//Outer.Inner i = o.new Inner(); 인스턴스 클래스라면 이렇게 하는게 맞고
		
		//Outer.Inner i = new Outer.Inner(); //스태틱 이너 클래스라면 정적영역에 올라가 있기에 이런식으로 생성자 호출이 가능함.
		
		//Outer.Inner i = o.new Inner();
		
		//Inner.print(); 스태틱 이너 클래스라서 정적영역에 올라가 있고, 함수도 스태틱이라면 이렇게 가능
		
		//i.print(); //객체가 생성되었다면 이건 일반적인 접근
		
		Outer.Inner.print();
		
		
	}

}
