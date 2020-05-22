package functionalInteface.biConsumer;

import java.util.List;
import java.util.function.BiConsumer;

import functionalInteface.consumer.ConsumerExampleDB;
import functionalInteface.consumer.ConsumerExampleEntity;

public class BiConsumerExample {

	public static void nameAndActivity() {
		System.out.println("nameAndActivity() \n");
		List<ConsumerExampleEntity> studentList = ConsumerExampleDB.getStudentDatta();
		BiConsumer<String, List<String>> biInfo = (name, activities) -> {
			System.out.println(name + " " + activities);
		};
		studentList.forEach(s -> biInfo.accept(s.getName(), s.getHobby()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> bi = (a, b) -> System.out.println(a + " " + b);
		bi.accept("sudarshan", "patwal");

		BiConsumer<Integer, Integer> biMultiply = (a, b) -> {
			System.out.println("Multiplication is " + a * b);
		};

		BiConsumer<Integer, Integer> biDivide = (a, b) -> {
			System.out.println("Multiplication is " + (a / b));
		};

		biMultiply.andThen(biDivide).accept(100, 20);

		nameAndActivity();
	}

}
