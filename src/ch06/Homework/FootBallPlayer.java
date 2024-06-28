package ch06.Homework;

public class FootBallPlayer {
	String Name;
	String UniformNumber;
	String TeamName;
	int Speed;
	int Tech;
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the uniformNumber
	 */
	public String getUniformNumber() {
		return UniformNumber;
	}
	/**
	 * @param uniformNumber the uniformNumber to set
	 */
	public void setUniformNumber(String uniformNumber) {
		UniformNumber = uniformNumber;
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return TeamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return Speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		if(speed < 0) Speed = 0;
		else if(speed > 5) Speed =5;
		else Speed = speed;
	}
	/**
	 * @return the tech
	 */
	public int getTech() {
		return Tech;
	}
	/**
	 * @param tech the tech to set
	 */
	public void setTech(int tech) {
		if(tech < 0) Tech = 0;
		else if(tech > 5) Tech =5;
		else Tech = tech;
	}
	
	public void PrintInfo() {
		System.out.printf("%s\n", getName());
		System.out.printf("%s\n", getTeamName());
		System.out.printf("%s\n", getUniformNumber());
		System.out.printf("%s\n", getSpeed());
		System.out.printf("%s\n", getTech());
	}
	
	public FootBallPlayer(String name,  String teamName,String uniformNumber, int speed, int tech) {
		super();
		System.out.println("========생성자호출==========");
		setName(name);
		setUniformNumber(uniformNumber);
		setTeamName(teamName);
		setSpeed(speed);
		setTech(tech);
	}
	public FootBallPlayer(String name,  String teamName,String uniformNumber, int speed) {
		this(name, teamName, uniformNumber, speed, 0);
	}
	public FootBallPlayer(String name,  String teamName, String uniformNumber) {
		this(name, teamName, uniformNumber, 0, 0);
	}
	public FootBallPlayer(String name, String teamName) {
		this(name, teamName ,"아직 못구했음", 0, 0);
	}
	public FootBallPlayer(String name) {
		this(name, "아직 못받았음","아직 못구했음", 0, 0);
	}
	public FootBallPlayer() {
		this("이름도 모름", "아직 못받았음","아직 못구했음", 0, 0);
	}
}
