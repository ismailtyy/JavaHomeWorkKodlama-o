
public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " İsimli Öğrenci Sisteme Eklendi.");	

	}
	public void registeredCourses(Student student ) {
		System.out.println("Kayıt olduğu kurslar : C#,Java");
		
	}

}
