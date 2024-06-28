package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String job = "프로그래머";
		
		String str = "나는 \"자바\"를 배웁니다.";
		String str2 = "번호\t이름\t직업 ";
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(str);
		System.out.println(str2);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다\n");
		
		String str3 = """
				{
					"id":"winter",
					"name":"눈송이"
				}
				""";
		System.out.print(str3);
	}

}
