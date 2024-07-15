package ch16.sec02;

public class Button {

	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener c;
	
	public void SetC(ClickListener clickListener) {
		c = clickListener;
	}
	public void Click() {
		c.onClick();
	}
}
