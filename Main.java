package inheritancehomework;

public class Main {

	public static void main(String[] args) {
		
		Instructor egitmen = new Instructor();
        egitmen.setId(1);
        egitmen.setFirstName("engin demiroğ");
        egitmen.setEmail("engin.demirog@gmail.com");
        egitmen.setInstructorNubmer("12345");

        Student ogrenci = new Student();
        ogrenci.setId(2);
        ogrenci.setFirstName("erto");
        ogrenci.setEmail("erto@gmail.com");
        ogrenci.setLastName("yanar");

        User[] users = {egitmen, ogrenci};

        UserManager userManager = new UserManager();

        userManager.addMultiple(users);

        userManager.login(egitmen);

        userManager.login(ogrenci);

        userManager.changePassword(ogrenci,"123456");

        Course course = new Course();
        course.setId(1);
        course.setName("Java & React");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(egitmen,course);

        StudentManager studentManager = new StudentManager();
        studentManager.enroll(ogrenci,course);

        userManager.comment(egitmen,course,"ödev yapıldı");

        userManager.comment(ogrenci,course, "teşekkür");

        userManager.logout(egitmen);
        userManager.logout(ogrenci);

	}

}
