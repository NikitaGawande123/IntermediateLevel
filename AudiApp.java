package PracticeUdemyDefaultValues;

public class AudiApp extends Audi {  
	
	public static void main(String[] args) {
        Audi car = new Audi();
        car.getDetails();
        String modelName = "Dodge Challenger";
        System.out.println(modelName);
    }

}
