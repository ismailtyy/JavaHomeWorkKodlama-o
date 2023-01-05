
public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " +"İsimli Eğitmen Sisteme Eklendi." );
	}
	
	public void lessonsGivenByTheInstructor(Instructor ınstructor ) {
		System.out.println("Eğitmenin Verdiği Dersler : C#+Angular,Java+React,JavaScript");
	}
}
