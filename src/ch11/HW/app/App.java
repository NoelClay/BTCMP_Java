package ch11.HW.app;

public class App {
    static boolean printFalse() {
        System.out.println("===== End =====");
        return false;
    }

    public static void main(String args[]) {

        // ==================================================
        // # 문제 발생
        // 배열의 크기는 2개인데, 인덱스 2번 공간에 접근하려고 함
        // ==================================================
        System.out.println("===== START =====");

        String[] stringArray = { "A", "B" };
        
        //HashMap<String, char> hmap = 

        int index = 0;
        int max = 3;
        while (index < max ? true : printFalse()) {
        	try {
                System.out.print("index[" + index + "] ");
                System.out.println(stringArray[index]);// java.lang.ArrayIndexOutOfBoundsException
                index++;
        	}catch(Exception e) {
                System.out.println(e);
                e.printStackTrace();
                index++;
        	}finally{
                System.out.println("===== Next =====");
        	}
        	
        }
    }

}