package java8;

import java.util.Comparator;

public class ComparatorLambdaExample {
	public static void main(String[] args) {

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		System.out.println("result of comparator is " + comp.compare(3, 2));

		/******************************************************************************/

		Comparator<Integer> compLambda = (Integer a, Integer b) -> {
			return a.compareTo(b);

		};

		Comparator<Integer> compLambda2 = (a, b) -> {
			return a.compareTo(b);

		};
		System.out.println("result of lambda comparator 1 is " + compLambda.compare(3, 2));

		System.out.println("result of lambda comparator 2 is " + compLambda2.compare(3, 2));
	}
}
