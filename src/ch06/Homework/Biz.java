package ch06.Homework;

public class Biz {

	int age;
	int height;
	int month;
	
	public void setAge(int i) {
		// TODO Auto-generated method stub
		if(i<=0) age=0;
		else age = i;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public void setHeight(int i) {
		// TODO Auto-generated method stub
		if(i<=0) height =0;
		else height = i;
	}

	public void setMonth(int i) {
		// TODO Auto-generated method stub
		if(i<=0 || i>12) month = 1;
		else month = i;
	}

	public int getMonth() {
		// TODO Auto-generated method stub
		return month;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

}
