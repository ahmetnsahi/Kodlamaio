
public class Student extends User{
	
	private String course;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String password, String userType, String course) {
		super(id, firstName,lastName, password, userType);
		this.course = course;
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}