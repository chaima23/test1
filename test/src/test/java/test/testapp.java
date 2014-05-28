package test;


public class testapp {
	@org.junit.Test
	public void itShouldReturn1when2entred() {
		assertEquals(1, testapp.process(2));
	}
	
	
	@org.junit.Test
	public void itShouldReturn2when3entred() {
		assertEquals(2, testapp.process(3));
	}
	public static int process(int n) {
		if (n < 2) {
			return n;
		} else
			return process(n - 1) + process(n - 2);

	}
}
