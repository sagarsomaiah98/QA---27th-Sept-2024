import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionEx {
	
	@Test
	public void assertEx() {
		
		String name="Sahil";
		//assertEquals(name, "Som");
		int a=20;
		assertEquals(20, 21,"values do not match when compared");
		
	}

}
