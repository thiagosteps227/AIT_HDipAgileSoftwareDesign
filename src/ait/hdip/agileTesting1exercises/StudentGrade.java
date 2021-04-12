package ait.hdip.agileTesting1exercises;



public class StudentGrade {

	public char getGrade(int studentGrade) {
			char result = '0';			
			if (studentGrade >=85) {
				result = 'A';
			} else if (studentGrade >=70 && studentGrade < 85) {
				result = 'B';
			} else if (studentGrade >= 55 && studentGrade < 70) {
				result = 'C';
			} else if (studentGrade >=40 && studentGrade < 55) {
				result ='D';
			} else if (studentGrade >=25 && studentGrade < 40) {
				result = 'E';
			} else if (studentGrade < 25) {
				result = 'F';}
			return result;
	 }
 		
}
