package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Features_Count_Repeat {

	public static void main(String[] args) {

		/*
		 * sum 1 to 100 Imperative
		 */
		int sum = 0;
		for (int i = 0; i <= 100; i++)
			sum = sum + i;
		System.out.println("sum is " + sum);

		
		/*
		 * sum 1 to 100 Declarative
		 */
		int sum1 = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.println("sum1 is " + sum1);
		
		
		
		/******************************************************************************/
		
		/*
		 * skip repetitive number Imperative
		 * 
		 */
		
		List<Integer> repeatList=Arrays.asList(1,2,3,4,5,2,1,3,4,5);
		List<Integer>uniqueList=new ArrayList();
		for(int myInt:repeatList)
		{
			if(!uniqueList.contains(myInt))
				uniqueList.add(myInt);
		}
		System.out.println(uniqueList);
		
		/*
		 * skip repetitive number Declarative
		 * 
		 */
		
		List<Integer>uniqueList1=new ArrayList();
		uniqueList1=repeatList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList1);
	}

}
