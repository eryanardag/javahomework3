package inheritancehomework;

public class Student extends User {
	
	String courseName;
	String studentNumber;
	
	 public Student() {
	    }

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	 
}
