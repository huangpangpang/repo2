package sample1;

import org.junit.jupiter.api.Test;

public class SampleObjectTest {
	@Test
	public void testPring(){
		SampleObject so = new SampleObject();
		so.print("Hello World!");
	}
}
