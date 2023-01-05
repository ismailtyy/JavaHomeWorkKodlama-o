
public class Instructor extends User {
	private String lessonsGivenByTheInstructor;
	private Student students;

	public Instructor() {

	}

	public Instructor(String lessonsGivenByTheInstructor, Student students) {
		super();
		this.lessonsGivenByTheInstructor = lessonsGivenByTheInstructor;
		this.students = students;
	}

	public String getLessonsGivenByTheInstructor() {
		return lessonsGivenByTheInstructor;
	}

	public void setLessonsGivenByTheInstructor(String lessonsGivenByTheInstructor) {
		this.lessonsGivenByTheInstructor = lessonsGivenByTheInstructor;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

}
