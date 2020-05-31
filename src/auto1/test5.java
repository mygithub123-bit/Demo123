package auto1;

public class test5 {
	
	public static void test (String gateway) {
		
		String payment;
		payment = gateway;
		
		switch(payment) {
		
		case "paypal":
			System.out.println("paypal done");
			break;
			
		case "dc":
			System.out.println("dc done");
			break;
			
		case "cc":
			System.out.println("cc done");
			break;
			
			default:
				System.out.println("no");
				break;
			
		}
	}

	
	public static void main (String... abc) {
		
		test("cc");
	}
}


