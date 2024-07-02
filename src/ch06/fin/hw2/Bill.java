package ch06.fin.hw2;


public class Bill {

	Menu[] order;
	
	Menu[] getOrder() {
		return order;
	}

	void setOrder(Menu[] order) {
		this.order = order;
	}

	public Bill(Menu[] order) {
		// TODO Auto-generated constructor stub
		setOrder(order);
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("====[영수증]====");
		System.out.println("====주문시간====");
		System.out.println(DateUtil.getLocalDateTimeDash());
		
		System.out.println();
		System.out.println("====주문상세===");
		for(Menu m : this.order) {
			m.printInfo();
		}
		
		System.out.println();
		System.out.println("====주문금액합계===");
		System.out.println(MakeSum()+"(원)");
		
	}
	String MakeSum() {
		int sum =0;
		for( Menu m : order) {
			sum += m.getPrice();
		}
		return DecimalUtil.decimalComma(sum);
	}

}
