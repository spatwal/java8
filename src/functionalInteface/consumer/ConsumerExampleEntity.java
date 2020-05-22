package functionalInteface.consumer;

import java.util.List;

public class ConsumerExampleEntity {

	private String name;
	private int grade;
	private double gpa;
	private List<String> hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public ConsumerExampleEntity(String name, int grade, double gpa, List<String> hobby) {
		super();
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "ConsumerExampleEntity [name=" + name + ", grade=" + grade + ", gpa=" + gpa + ", hobby=" + hobby + "]";
	}

}
