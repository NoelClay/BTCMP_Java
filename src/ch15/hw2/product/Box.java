package ch15.hw2.product;

public class Box<T extends Product> {

    public Box(T data) {

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
