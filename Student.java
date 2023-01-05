
public class Student extends User {

	private String registeredCourses;
	private Instructor ınstructor;

	public Student() {

	}

	public Student(String registeredCourses, Instructor instructor) {
		super();
		this.registeredCourses = registeredCourses;
		ınstructor = instructor;
	}

	public String getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

	public Instructor getInstructor() {
		return ınstructor;
	}

	public void setInstructor(Instructor instructor) {
		ınstructor = instructor;
	}
}
