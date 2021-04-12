package ait.hdip.agileTesting2exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StudentGradeTest {

	StudentGrade studentGrade;
	
	@BeforeEach
	void setUp() throws Exception {
		studentGrade = new StudentGrade();
	}

	
	@ParameterizedTest(name="mark{0} should have a grade of {1}")
	@CsvSource({"86,A","85,A","84,B","71,B","70,B","69,C","56,C","55,C","54,D",
				"41,D","40,D","39,E","26,E","25,E","24,F"})
	void testStudentGrade(int mark, char grade) {
		
		assertEquals(grade, studentGrade.defineGrade(mark));
		
	}

}
