package edu.lonestar.JeremyJohnson.cosc1337;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaRectangleAreaTest extends AreaRectangleJJ {

	@Test
	public void test() {
		Rectangle rect = new Rectangle(5.0, 10.0);
		assertEquals(50.0, rect.getArea(), .000001); 
	}

}
