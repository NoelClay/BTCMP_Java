package ch13.sec02.exam01;

public class Box1<T> {

	public T content;
	
	public boolean compare(Box1<T> other) {
		return content.equals(other.content);
	}
	
	public T get() {
		return content;
	}
	public void set(T t) {
		content = t;
	}
}
