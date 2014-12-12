import org.junit.Assert;
import org.junit.Test;


public class SampleAddTest {

	private SampleAdd sampleClass;

	@Test
	public void testAdd() {
		sampleClass = new SampleAdd();
		Assert.assertEquals(5, sampleClass.add(3, 2));
	}

}
