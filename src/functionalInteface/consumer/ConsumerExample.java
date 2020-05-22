package functionalInteface.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static List<ConsumerExampleEntity> studentList = ConsumerExampleDB.getStudentDatta();
	static Consumer<ConsumerExampleEntity> cEntity2 = student -> System.out.print(student.getName());
	static Consumer<ConsumerExampleEntity> cEntity3 = student -> System.out.print(student.getHobby() + "  ");

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("sudarshan java 8");

		consumerFunctionalIntefaceFullObject();
		consumerFunctionalIntefaceWithNameAndHobby();
		consumerFunctionalIntefaceWithFiltering();
	}

	public static void consumerFunctionalIntefaceFullObject() {
		System.out.println(":consumerFunctionalIntefacePrintName:");
		Consumer<ConsumerExampleEntity> cEntity = student -> System.out.println(student);
		studentList.forEach(cEntity);
	}

	// Consumer chaninig
	public static void consumerFunctionalIntefaceWithNameAndHobby() {
		System.out.println(":consumerFunctionalIntefaceWithNameAndHobby:");
		studentList.forEach(cEntity2.andThen(cEntity3)); // consumer chainnig
	}

	// Consumer Filtering
	public static void consumerFunctionalIntefaceWithFiltering() {
		System.out.println();
		System.out.println(":consumerFunctionalIntefaceWithFiltering:");

		studentList.forEach(student -> {
			if (student.getGpa() > 4 && student.getGrade() > 2) {
				cEntity2.andThen(cEntity3).accept(student);
				cEntity2.andThen(cEntity3).andThen(cEntity2).accept(student);
			}
		});
	}
}
