package test;

import main.PowerOfThorEp1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerOfThorEp1Test {


	private PowerOfThorEp1 powerOfThor;

	@Before
	public void init(){
		powerOfThor = new PowerOfThorEp1();
	}

	@Test
	public void mustGoToTheSouth(){
		String moveTo = powerOfThor.gotoTheLight(31, 4, 31, 17);
		Assert.assertEquals("S", moveTo);
	}

	@Test
	public void mustGoToTheNorth(){
		String moveTo = powerOfThor.gotoTheLight(31, 18, 31, 4);
		Assert.assertEquals("N", moveTo);
	}

	@Test
	public void mustGoToTheEast(){
		String moveTo = powerOfThor.gotoTheLight(30, 0, 0, 0);
		Assert.assertEquals("E", moveTo);
	}

	@Test
	public void mustGoToTheWeast(){
		String moveTo = powerOfThor.gotoTheLight(-23, 0, 0, 0);
		Assert.assertEquals("W", moveTo);
	}

	@Test
	public void mustGoToTheNorthEast(){
		String moveTo = powerOfThor.gotoTheLight(12, 15, 0, 0);
		Assert.assertEquals("NE", moveTo);
	}

	@Test
	public void mustGoToTheSouthWest(){
		String moveTo = powerOfThor.gotoTheLight(-12, -15, 0, 0);
		Assert.assertEquals("SW", moveTo);
	}

	@Test
	public void mustGoToTheSouthEast(){
		String moveTo = powerOfThor.gotoTheLight(12, -15, 0, 0);
		Assert.assertEquals("SE", moveTo);
	}

	@Test
	public void mustGoToTheNorthWest(){
		String moveTo = powerOfThor.gotoTheLight(-12, 15, 0, 0);
		Assert.assertEquals("NW", moveTo);
	}
}
