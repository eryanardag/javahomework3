package inheritancehomework;

public class Instructor extends User{
	
	String certificate;
	String instructorNubmer;
	
	public Instructor() {
    }

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getInstructorNubmer() {
		return instructorNubmer;
	}

	public void setInstructorNubmer(String instructorNubmer) {
		this.instructorNubmer = instructorNubmer;
	}

}
