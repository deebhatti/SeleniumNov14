package inheritance;

public class IT extends Management {

	

	int annualBonus = 10000;
	
	@Override
	public void month() {
		System.out.println("It is November");
	}

	public static void main(String[] args) {

		IT Ram = new IT();
		System.out.println("Total annual compensation of Ram = $ " + (Ram.annualSalary + Ram.annualBonus));
		
		Ram.month();
	}

}
