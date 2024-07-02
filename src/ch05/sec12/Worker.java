package ch05.sec12;

public class Worker {
	String name;
	int career;
	Job jobName;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getCareer() {
		return career;
	}
	void setCareer(int career) {
		this.career = career;
	}
	Job getJobName() {
		return jobName;
	}
	void setJobName(Job jobName) {
		this.jobName = jobName;
	}
	String getKorJobName(Job jobName) {

		if(jobName == Job.PROGRAMER ) return "프로그래머";
		if(jobName == Job.WEB_DESIGNER ) return "웹 디자이너";
		if(jobName == Job.UI_DESIGNER ) return "UI 디자이너";
		else return "기타";
				
	}
	
	Worker(String name, int career, Job jobName) {
		super();
		this.name = name;
		this.career = career;
		this.jobName = jobName;
	}
	
	void printInfo() {
		System.out.printf("이름=%s | 커리어=%d(년) | 직업=%s\n",getName(), getCareer(), getKorJobName(this.jobName) );
	}

}
