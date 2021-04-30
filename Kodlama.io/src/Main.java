public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ahmet");
		student.setLastName("Şahin");
		student.setPassWord("585658");
		student.setUserType("Öğrenci");
		student.setCourse("Java & React");
		
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setPassWord("5678");
		instructor.setUserType("Eğitmen");
		instructor.setDescription("Adam kral");
		
		
		UserManager userManager = new UserManager();
		userManager.remove(student);
		userManager.addComment(student);
		userManager.removeComment(student);
		userManager.upload(student);
		
		System.out.println("\n ---------------------- \n");
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.join(student);
		studentManager.addComment(student);
		studentManager.removeComment(student);
		studentManager.upload(student);
		studentManager.leave(student);
		studentManager.next(student);
		studentManager.previous(student);
		studentManager.remove(student);
		
		System.out.println("\n !!!!!!!!!!!!!!!!!!!!!!!!!! \n");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.remove(instructor);
		instructorManager.addComment(instructor);
		instructorManager.removeComment(instructor);
		instructorManager.addLesson(instructor);
		instructorManager.removeLesson(instructor);
		instructorManager.updateLesson(instructor);
		instructorManager.addHomeWork(instructor);
		instructorManager.removeHomeWork(instructor);
		instructorManager.updateHomeWork(instructor);
		

	}
}