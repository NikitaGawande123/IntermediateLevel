package PracticeUdemyPolymorphism;


	
	public class Poly4 extends Poly1 {
	    public Poly4(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
	        super("Toyota Supra", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
	    }

	    @Override
	    public void startTheEngine() {
	        System.out.println("A Toyota Supra Engine is started.");
	    }
	}


