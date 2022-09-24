package Lec_24;

public class Student {
	private String Name = "PAPPU"; // data parsing!!
	private int Age = 2;

	public Student(String Name, int Age) {
		// TODO Auto-generated constructor stub
		this.Name = Name;
		this.Age = Age;
	}

	public Student() {

	}

	public Student(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public void setName(String nn) {

	}

	public void setAge(int ag)  {
		if (ag <= 0) {
//			throw new Exception("nahi bhai esse nahi!"); // checked
			throw new RuntimeException("nahi bhai esse nahi!!");// unchecked!!
		}
		Age = ag;
	}
}
