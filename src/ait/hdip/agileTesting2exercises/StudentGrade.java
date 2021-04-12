package ait.hdip.agileTesting2exercises;

public class StudentGrade {
	
	public char defineGrade(int mark){
		char grade = ' ';
		if(mark >= 85) {
			grade = 'A';
		} else if (mark >= 70 && mark < 85) {
			grade = 'B';
		} else if (mark >= 55 && mark < 70) {
			grade = 'C';
		} else if (mark >= 40 && mark < 55) {
			grade = 'D';
		} else if (mark >= 25 && mark < 40) {
			grade = 'E';
		} else if (mark <= 25) {
			grade = 'F';
		}
		return grade;
	}

}
