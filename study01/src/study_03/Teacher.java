package study_03;

public class Teacher {
	
	private static Teacher t  = new Teacher();
	
	private Teacher() {
		
	}
	
	public static Teacher getTeacher() {
		return t;
	}
	
}
