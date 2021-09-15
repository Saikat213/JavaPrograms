package introPrograms;

public class SnakeLadder {

	private int snake(int playerPosition, int die)
	{
		System.out.println("Snake is encountered");
		if(playerPosition-die < 0) {
			return 0;
		}
		else {
			return playerPosition-die;
		}
	}
	
	private int ladder(int playerPosition, int die) 
	{
		System.out.println("Ladder encountered");
		if(playerPosition+die > 100) {
			System.out.println("Cannot increment position");
			return playerPosition;
		}
		else {
			return playerPosition+die;
		}
	}
	
	private void noPlay() {
		System.out.println("No play encountered\nPlayer remains at same position");
	}
	
	public static void main(String[] args) {
		
			int playerPosition=0, diceMin=1, diceMax=6, die, diceCounter=0, playChoice;
			
			SnakeLadder sl = new SnakeLadder();
			
			while(playerPosition!=100) 
			{	
				die=(int)(Math.random() * diceMax + diceMin);
				diceCounter++;
				playChoice=(int)(Math.random() * 3 + 1);
				switch(playChoice) {
				case 1: sl.noPlay();
				break;
			
				case 2: playerPosition=sl.ladder(playerPosition, die);
						System.out.println("Current position of player after ladder: "+playerPosition);
				break;
			
				case 3: playerPosition=sl.snake(playerPosition, die);
						System.out.println("Current position of player after snake: "+playerPosition);
				break;
				
				default: System.out.print("Invalid option");
				}
			}
			
			System.out.println("Dice rolled total "+diceCounter+" times to win");
	}

}
