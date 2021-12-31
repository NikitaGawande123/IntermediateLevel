package Carrs;

public class CarApp11 {
	
	

	    public static void main(String[] args) {
	        Car33 redDodgeChallenger = new Car33("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
	        redDodgeChallenger.getDescription();
	        redDodgeChallenger.startTheEngine();

	        System.out.println("----------------------------------------------");
	        ToyotaSuper blackToyotaSupra = new ToyotaSuper("black", (byte)1, (short)225, (short)717, (short)3500, 40000, 15000, false);
	        blackToyotaSupra.getDescription();
	        blackToyotaSupra.startTheEngine();
	    }

	}


