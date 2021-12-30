package IntermediatClassesAndPackage;

public class BasketballApp {

	public static void main(String[] args) {
	
		BaeketballPlayer kobe = new BaeketballPlayer("kobe", "kb", 78, "nick", 867.9, 9.8, 34);
		BaeketballPlayer jorden = new BaeketballPlayer("jorden", "jd", 56, "nick", 180.8, 4.5, 789);
		
		
		BaeketballPlayer[] basketballPlayers = new BaeketballPlayer[2];
		basketballPlayers[0] = kobe;
		basketballPlayers[1] = jorden;
		
		for(BaeketballPlayer basketballPlayer : basketballPlayers) {
			basketballPlayer.freeThrow();
		}

	}

}
