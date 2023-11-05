import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class SampleBOTest {

	@Test
	@SuppressWarnings("deprecation")
	void CreateNewTest() {
		SampleBO testobj = SampleBO.createNewBO ("Mike", "23");
		assertEquals (testobj.getAName(), "Mike");
		assertNotNull (testobj);
		assertThat (testobj, instanceOf (SampleBO.class));
		//fail("Not yet implemented");
	}

}
