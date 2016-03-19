package test;

import static org.junit.Assert.*;

import org.junit.Test;

import triangle.Triangle;

public class TestCase {
	Triangle t;
	@Test 
	public void test(){
		t = new Triangle(1,1,1);
		assertEquals("equilLateral",t.judgeTriangle(1, 1, 1));
		t = new Triangle(1,2,2);
		assertEquals("isSosceles",t.judgeTriangle(1, 2, 2));
	}
}
