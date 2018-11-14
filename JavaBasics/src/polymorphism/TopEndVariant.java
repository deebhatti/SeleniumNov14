package polymorphism;

public class TopEndVariant extends Features implements ExtraTax {

	@Override
	public void powerWindows() {
		System.out.println("Power Windows are present");
		
	}

	@Override
	public void sunroof() {
		System.out.println("Sunroof is present");
		
	}

	@Override
	public void extraRegistrationFees() {
		System.out.println("Extra Registration Fees = $2500");
		
	}

}
