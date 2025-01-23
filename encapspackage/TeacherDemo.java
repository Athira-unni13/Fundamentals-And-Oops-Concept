package encapspackage;

class Teacher{
	private int empId;
	private String empName;
	
	public Teacher(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}

public class TeacherDemo {

	public static void main(String[] args) {

	}

}
