package ch13.sec02.exam01;

public class Course {

	//모든 사람이 가능할려면
	public static void registerCouse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +"코스 등록");
	}
	
	//학생만 가능할려면
	public static void registerCouse2(Applicant<?extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +"코스 등록");
	}
	
	//학생 제외하고 가능할려면
	public static void registerCouse3(Applicant<?super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +"코스 등록");
	}
}
