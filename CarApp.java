package CarChallengerrr;

public class CarApp {
	
	public static void main(String[] args) {
		CarChallenger carChallenger = new CarChallenger();
		carChallenger.startTheEngine();
		carChallenger.getDiscr();
		
		
		System.out.println("-----------------------------------");
		CarChallenger newChallenger = new CarChallenger();
		newChallenger.getDiscr();
		newChallenger.startTheEngine();
		
	}

}
