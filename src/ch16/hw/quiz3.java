package ch16.hw;

public class quiz3 {

	public static void main(String[] args) {

	    System.out.println("===== implements Interface =====");
	    Biz b = new Biz();
	    IDrink beer = new Beer();
	    IDrink water = new Water();

	    b.biz(beer);
	    b.biz(water);

	    System.out.println("\n===== Anonymous =====");
	    b.biz(()->{
	    	System.out.println("Beer를 마시다");
	    }
	    
	    );

	    b.biz(()->{
	    	System.out.println("water를 마시다");
	    }
	    
	    );

	    System.out.println("\n===== Lambda =====");
	    b.biz(  ()->System.out.println("맥주를 마시다")        );
	    b.biz(      ()->System.out.println("맥주를 마시다")          );
	    b.biz(      ()->System.out.println("맥주를 마시다")          );
	    b.biz(        ()->System.out.println("맥주를 마시다")        );
	}

}
class Biz {

    public void biz(IDrink drink) {
        drink.drink();
    }
    public void work(ISayable sayable) {
        sayable.sayHello();
    }

}
