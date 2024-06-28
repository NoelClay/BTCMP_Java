package ch06.Homework;

public class Movie {

	String title;
	String category;
	String director;
	int runningTime;
	
	void PrintInfo() {
		System.out.printf("제목: %s\n", getTitle());
		System.out.printf("카테고리: %s\n", getCategory());
		System.out.printf("감독: %s\n", getDirector());
		System.out.printf("상영시간: %d(분)\n", getRunningTime());
	}
	
	public Movie(String title, String category, String director, int runningTime) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
	}

	public Movie(String title, String category ) {
		this(title, category, " ", 192);
	}
	public Movie() {
		this(" ", " " , " ", 192);
	}

	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the runningTime
	 */
	public int getRunningTime() {
		return runningTime;
	}

	/**
	 * @param runningTime the runningTime to set
	 */
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

}
