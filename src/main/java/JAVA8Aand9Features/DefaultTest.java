package JAVA8Aand9Features;

interface Atm {
	
	void cashwithdraw();
	void pinchange();
	void balenq();
	default void cashdeposit() {
		System.out.println("ATM default implementations");
	}

}

class RBI implements Atm{

	@Override
	public void cashwithdraw() {
		System.out.println("cashwithdraw");
		
	}

	@Override
	public void pinchange() {
		System.out.println("pinchange");
	}

	@Override
	public void balenq() {
		System.out.println("balenq");
		
	}
	
	public void cashdeposit() {
		System.out.println("ATM default method is overriding");
	}
	
}

class SBI implements Atm{

	@Override
	public void cashwithdraw() {
		System.out.println("cashwithdraw");
		
	}

	@Override
	public void pinchange() {
		System.out.println("pinchange");
	}

	@Override
	public void balenq() {
		System.out.println("balenq");
		
	}
	
	
}


 class ADB implements Atm{

	 @Override
		public void cashwithdraw() {
			System.out.println("cashwithdraw");
			
		}

		@Override
		public void pinchange() {
			System.out.println("pinchange");
		}

		@Override
		public void balenq() {
			System.out.println("balenq");
			
		}
		
	
}


public class DefaultTest{

	public static void main(String[] args) {
		
		RBI rbi=new RBI();
		rbi.balenq();
		rbi.cashdeposit();
		rbi.cashwithdraw();
		rbi.pinchange();
		
		
	}
	

}
