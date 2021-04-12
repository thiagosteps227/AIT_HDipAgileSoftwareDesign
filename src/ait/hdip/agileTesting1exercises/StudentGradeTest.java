package ait.hdip.agileTesting1exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentGradeTest {

	@Test
	void testGradeA() {
		StudentGrade studentGrade = new StudentGrade();
		
		assertEquals(studentGrade.getGrade(90),'A');
	}
	
	@Test
	void testGradeB() {
		StudentGrade studentGrade = new StudentGrade();
		char grade = studentGrade.getGrade(75);
		assertEquals('B',grade);
	}
	
	@Test
	void testGradeC() {
		StudentGrade studentGrade = new StudentGrade();
		char grade = studentGrade.getGrade(56);
		assertEquals('C',grade);
	}
	@Test
	void testGradeD() {
		StudentGrade studentGrade = new StudentGrade();
		char grade = studentGrade.getGrade(41);
		assertEquals('D',grade);
	}
	
	@Test
	void testGradeE() {
		StudentGrade studentGrade = new StudentGrade();
		char grade = studentGrade.getGrade(30);
		assertEquals('E',grade);
	}
	@Test
	void testGradeF() {
		StudentGrade studentGrade = new StudentGrade();
		char grade = studentGrade.getGrade(15);
		assertEquals('F',grade);
	}

}
