import org.junit.Assert;
import org.junit.Test;


public class SampleAddTest {

	private SampleAdd sample;
	
	@Test
	public void test() {
		sample = new SampleAdd();
		Assert.assertEquals(sample.add(5, 5), 10);
	}

}
