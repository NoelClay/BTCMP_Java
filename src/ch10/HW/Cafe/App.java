package ch10.HW.Cafe;

import cafe.ade.*;
import cafe.coffee.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LemonAde la = new LemonAde();
		la.printInfo();
		
		OrangeAde OrangeAde = new OrangeAde();
		OrangeAde.printInfo();
		
		Americano Americano = new Americano();
		Americano.printInfo();
		
		CafeLatte CafeLatte = new CafeLatte();
		CafeLatte.printInfo();
		
	}

}
