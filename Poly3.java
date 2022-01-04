package PracticeUdemyPolymorphism;


	
	public class Poly3 extends Poly1 implements ElectricMode {


	    public Poly3(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
	                           int price, int mileage, boolean isDamaged){
	        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
	    }

	    @Override
	    public void startTheEngine() {
	        System.out.println("A Dodge Challenger engine is started.");
	    }

	    @Override
	    public void startTheElectricEngine() {
	        System.out.println("Dodge Challenger starts its electric engine.");
	    }
	}


