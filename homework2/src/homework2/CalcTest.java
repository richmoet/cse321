package homework2;

	import org.junit.Test;
	import static org.junit.Assert.assertEquals;

	public class CalcTest
	{
	   @Test public void testAdd()
	   {
	      // Calc().add() returns long, so must cast 5 to a long.
	      assertEquals ((long) 5, new Calc().add(2, 3));
	   }
	}

