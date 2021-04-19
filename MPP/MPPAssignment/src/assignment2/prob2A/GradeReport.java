package assignment2.prob2A;

public class GradeReport {
	private Student st;
	
	GradeReport(Student astudent){
		this.st=astudent;
	}
	
	public String getStudent() {
		return st.getName();
	}
	
	public String toString() {
		return "GradeReport";
	}

}
