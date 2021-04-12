package ait.hdip.agileTesting1exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomTest {
	Room room;
	
	@BeforeEach 
	public void setUp() {
		room = new Room(12,12);
	}
	
	@Test
	public void testRoomContructor() {
		
		assertEquals(12, room.getLength());
		assertEquals(12, room.getWidth());
	}
	
	@Test
	public void testSettingNewRoom() {
		room.setWidth(13.0);
		room.setLength(13.0);
		
		assertEquals(13, room.getLength());
		assertEquals(13, room.getWidth());
	}
	
	@Test
	public void testCalculateArea() {
				
		assertEquals(144, room.calculateArea());
		
	}
	
	@Test
	public void testCalculatePerimeter() {
				
		assertEquals(48, room.calculatePerimeter());
		
	}
	
	

}
