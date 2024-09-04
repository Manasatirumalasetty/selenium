package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	@Test
	public void test()
	{
		String s1="hI'";
		String s2="hi";
		
		Assert.assertEquals(s1,s2);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
