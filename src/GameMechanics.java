package ProjectM.src;
import javax.swing.*;
public class GameMechanics {
	
	
	PMBoard game = new PMBoard();
	PMGameData data = new PMGameData();

	public void BuyProperty() {
		
		
		int bank = data.GetPlayersBank();
		
		int player = data.GetPlayer();
		
		int action = data.GetActions();
		
		int curPlayPos = data.GetPlayerPos();
		
		
		
		int spaceVal = data.SpaceValue()[curPlayPos];
		
		String spaceName = data.SpaceName()[curPlayPos];
		
		
		
		
		data.SetPlayerBank(data.GetPlayer(), (bank - spaceVal));
			
	
		JOptionPane.showMessageDialog(null, "Player " + player + " bought " + spaceName + " for $" + spaceVal);
		
	
		
		
		
		data.SetActions(1);
		System.out.println("Current Action Now: " + action);
		game.TheGame();
	}
	
	public void PayRent() {
		
		
	}
	
	
	public void Trade() {
		
		
	}
	
	public void Mortgage() {
		
		
	}
	
	public void ChanceCard() {
		
		
	}
	
	public void CommunityChest() {
		
		
	}
	
	public void GoToJail() {
		
		
	}
	
	public void GetOutOfJail() {
		
		
	}
	
	public void VisitJail() {
		
		
	}
	
	public void BuyHouse() {
		
		
	}
	
	public void SellHouse() {
		
		
	}
	public void EndTurn() {
		
		int curPlayer = data.GetPlayer();
		
		
		int curSpace = data.GetPlayerPos();

		System.out.println("Current Stats Before Turn Ends: ");
		System.out.println("Player: " + data.GetPlayer());
		System.out.println("Current Space of Player: " + data.GetPlayerPos());
		System.out.println("Current Player Bank: " + data.GetPlayersBank());
		
		if (curSpace == 0) {
			
			System.out.println("Good :)");
			System.exit(0);
		}
		
		else {
		
		
		if (curPlayer < 4) {
			
			data.SetActions(-1);
			
			data.SetDoubles(0);
		
			data.SetPlayer(curPlayer + 1);

			game.TheGame();
			
		}
		else {
			data.SetActions(-1);
			
			data.SetDoubles(0);
		
			data.SetPlayer(1);
			
			
			

			game.TheGame();
		}
		}
		
		
	}
}
