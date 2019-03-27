package ProjectM.src;
import java.util.Random;

public class PMRandom {
	
	
	
	
public void NewRoll() {
	
	
	
	PMMovement moveTo = new PMMovement();
	PMBoard game = new PMBoard();
	PMGameData data = new PMGameData();
	Random r = new Random();
	
	
	
	System.out.println("Current Player: " + data.GetPlayer());
	
	int curSpace = data.GetPlayerPos();
	
	int firstDieRoll = r.nextInt(6) + 1;

	int secondDieRoll = r.nextInt(6) + 1;
	int finalRoll = firstDieRoll + secondDieRoll;
	
	
	
	System.out.println("Current Space Before: " + curSpace);
	System.out.println("Latest Roll : " + finalRoll);
	
	if ((firstDieRoll == secondDieRoll) && (data.GetDoubles() == 0)) {
		
		data.SetDoubles(1);

		
		data.SetActions(0);
	
		data.SetPlayerPos(data.GetPlayer(), moveTo.move(curSpace,finalRoll));
	
		
		game.TheGame();
	}
	else if ((firstDieRoll == secondDieRoll) && (data.GetDoubles() == 1)) {
		

		data.SetDoubles(2);

		
		data.SetActions(0);
	
		data.SetPlayerPos(data.GetPlayer(), moveTo.move(curSpace,finalRoll));
		game.TheGame();
	}
	
	else {

	data.SetActions(0);
	data.SetPlayerPos(data.GetPlayer(), moveTo.move(curSpace,finalRoll));

    game.TheGame();
	}
	}

}
