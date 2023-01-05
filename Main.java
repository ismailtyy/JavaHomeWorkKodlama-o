
public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setLessonsGivenByTheInstructor("Verdiği kurslar : C#,Java,JavaScript,Python");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.lessonsGivenByTheInstructor(instructor1);
		
		
		Student student1 = new Student();
		student1.setFirstName("İsmail");
		student1.setLastName("Toy");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.registeredCourses(student1);
		
		
		
		

	}

}
