package ch16.hw;

public class Quiz4 {

	public static void main(String[] args) {

	    System.out.println("===== Anonymous =====");
	    IAddable addable0 = new IAddable() {
	    	public int add(int i, int j) {
	    		int result = i+j;
	    		return result;
	    	}
	    };

	    int add0 = addable0.add(1, 2);
	    System.out.println("i+j=" + add0);

	    System.out.println("\n===== Lambda =====");

	    System.out.println("----- Type 1. -----");
	    // 리턴문만 존재할 경우, 중괄호 및 return 생략 O
	    IAddable addable1 = (x, y) ->  x+ y;

	    
	    
	    int add1 = addable1.add(1, 2);
	    System.out.println("i+j=" + add1);

	    System.out.println("\n----- Type 2. -----");
	    // Type 1과 동일. 중괄호 및 return 사용
	    IAddable addable2 = (x, y) -> {
	    	return x+y;
	    };
	    
	    int add2 = addable2.add(1, 2);
	    System.out.println("i+j=" + add2);

	    System.out.println("\n----- Type 3. -----");
	    // 실행문과 리턴문이 같이 존재할 경우, 중괄호 및 return 사용
	    IAddable addable3 = (x, y) -> {
	    	return x+y;
	    };
	    
	    
	    int add3 = addable3.add(1, 2);
	    System.out.println("i+j=" + add3);
	}


}
