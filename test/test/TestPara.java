package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import triangle.Triangle;

@RunWith(Parameterized.class)
public class TestPara {
	private int a,b,c;
	private String expected;
	private Triangle t = null;
	public TestPara(int a, int b, int c, String expected) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		t = new Triangle();
	}
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
				{1,1,1,"equilLateral"},
				{1,2,2,"isSosceles"},
				{2,3,4,"scalene"},
				{3,8,1,"notTriangle"},
				{3,3,3,"equilLateral"},
				{0,3,2,"notTriangle"}
		});
	}
	
	@Test
	public void testTriangle(){
		assertEquals(this.expected,t.judgeTriangle(a, b, c));
	}
}
