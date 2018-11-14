package polymorphism;

public class MiddleVariant extends Features implements ExtraTax {

	@Override
	public void powerWindows() {
		System.out.println("Power Windows are present");

	}

	@Override
	public void sunroof() {
		System.out.println("Sunroof not present");

	}

	@Override
	public void extraRegistrationFees() {
		System.out.println("Extra Registration Fees = $2200");

	}
	
	//Features mv = new MiddleVariant();     ExtraTax mvcu = new MiddleVariant();
	
	//Car BMW = new Car();

}
