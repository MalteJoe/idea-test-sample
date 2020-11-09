import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {
	@Test
	public void foo() {
		Clazz something = new Clazz();
		assertThat(something.methodExpectedToReturnTrue());
	}

	public class Clazz {
		public boolean methodExpectedToReturnTrue() {
			return true;
		}
	}
}
