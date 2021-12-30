package IntermediatClassesAndPackage;

import java.util.Random;

public class BaeketballPlayer {
	
	String name;
	String nickname;
	int yearOfBorn;
	String team;
	
	double freeThrowPer;
	double pointsPerGame;
	int gamesPlayed;
	
	public BaeketballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPer, double pointsPerGame, int gamesPlayed) {
		this.name = name;
		this.nickname = nickname;
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.freeThrowPer = freeThrowPer;
		this.pointsPerGame = pointsPerGame;
		this.gamesPlayed = gamesPlayed;
		
	}
	
	public void freeThrow() {
		Random randomNumGen = new Random();
		if((randomNumGen.nextDouble() * 180) > freeThrowPer){
			System.out.println(name + "failed to score free throw");
			
		}
		
		else {
			System.out.println(name + "score free throw");
		}
		}
		
	}


