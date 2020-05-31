package auto1;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = RandomNumber();
		
		System.out.println(i);
		
		System.out.println("test"+i);
		
		System.out.println("tester"+i+"@gmail.com\"");

	}

	public static int RandomNumber() {

		Random rand = new Random();

		int rand_int = rand.nextInt(10000);

		return rand_int;
	}

}
