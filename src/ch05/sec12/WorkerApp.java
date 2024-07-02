package ch05.sec12;

public class WorkerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker w1 = new Worker("Rose", 3, Job.PROGRAMER);
		w1.printInfo();
		
		Worker w2 = new Worker("james", 10, Job.WEB_DESIGNER);
		w2.printInfo();
		
		Worker w3 = new Worker("paige", 15, Job.UI_DESIGNER);
		w3.printInfo();
	}

}
