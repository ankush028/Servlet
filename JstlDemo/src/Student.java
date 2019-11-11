
public class Student {
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	@Override
	
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
}
