package ch13.hw.generic;

public class Bag<T extends Product> {

    public Bag(T data) {

		this.data = data;
	}

	private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printInfo() {
        //System.out.println("data=" + data);
    	data.printInfo();
    }
    

}
