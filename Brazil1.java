package PracticeUdemyStaticKey;

public class Brazil1 {

	public static void main(String[] args) {
		 System.out.println("Number of countries: " + Country1.getNumberOfCountries());
	        Country1 brazil = new Country1("Brazil", 210000000, "Brasilia");
	        brazil.getDetails();
	        Country1 germany = new Country1("Germany", 83000000, "Berlin");
	        germany.getDetails();
	        Country1 japan = new Country1("Japan", 12500000, "Tokyo");
	        japan.getDetails();
	        System.out.println("Number of countries: " + Country1.getNumberOfCountries());
	}

}
