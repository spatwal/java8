package java8;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		/* prior java 8 */

		Runnable run = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("I ran");
			}
		};

		new Thread(run).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("I ran in thread ");

			}
		}).start();

		/******************************************************************************/

		/*
		 * lambda syntax
		 */

		Runnable lambdaRunnable = () -> System.out.println("Hi labda");

		new Thread(lambdaRunnable).start();

		new Thread(() -> System.out.println("hey lambda")).start();
	}

}
