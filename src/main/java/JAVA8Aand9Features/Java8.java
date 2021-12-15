package JAVA8Aand9Features;

public interface Java8 {

	private void hello() {
		System.out.println("Hello");
	}

	static private void hello2() {
		System.out.println("Hello2");
	}

	public static void greetings() {
		System.out.println("Welcome to india");
	}

	public static void main(String[] args) {

		greetings();
		//hello();
		hello2();

	}

}
