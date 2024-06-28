package ch05.homework;

public class CardRankApp {
	public static void main(String[] args) {
		String[] CardRanks;
		
		CardRanks = new String[] {"1","2","3","4","5", "6","7","8","9","10","J", "Q", "k"};
		
		for (int i =0; i<CardRanks.length; i++) {
			System.out.println("CardRanks["+i+"] "+CardRanks[i]);
		}
	}
	
}
