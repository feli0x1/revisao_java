package entities;

public class Room {
	private String studentsName;
	private String studentsEmail;
	
	public Room(String studentsName, String studentsEmail) {
		this.studentsName = studentsName;
		this.studentsEmail = studentsEmail;
	}

	public String getStudentsName() {
		return studentsName;
	}

	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}

	public String getStudentsEmail() {
		return studentsEmail;
	}

	public void setStudentsEmail(String studentsEmail) {
		this.studentsEmail = studentsEmail;
	}
	
	public String toString() {
		return String.format("%s, %s", getStudentsName(), getStudentsEmail());
	}
}
