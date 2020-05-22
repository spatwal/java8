package functionalInteface.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerExampleDB {

	public static List<ConsumerExampleEntity> getStudentDatta() {
		List<ConsumerExampleEntity> studentList;

		ConsumerExampleEntity c1 = new ConsumerExampleEntity("Sudarshan", 1, 3.6, Arrays.asList("cricket", "football"));
		ConsumerExampleEntity c2 = new ConsumerExampleEntity("Prakhar", 1, 2.6, Arrays.asList("baseball", "football"));
		ConsumerExampleEntity c3 = new ConsumerExampleEntity("Vipul", 2, 4.1, Arrays.asList("biking", "swimming"));
		ConsumerExampleEntity c4 = new ConsumerExampleEntity("Nishant", 2, 2.9, Arrays.asList("sleeping", "football"));
		ConsumerExampleEntity c5 = new ConsumerExampleEntity("Suyash", 3, 4.6, Arrays.asList("runing", "reading"));
		studentList = Arrays.asList(c1, c2, c3, c4, c5);
		return studentList;
	}

}
