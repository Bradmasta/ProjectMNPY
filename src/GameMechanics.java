package ProjectM.src;
import javax.swing.*;
public class GameMechanics {
	
	
	PMBoard game = new PMBoard();
	PMGameData data = new PMGameData();

	public void BuyProperty() {
		
		
		
		
		int player = data.GetPlayer();
		
		int bank = data.GetPlayersBank(player);
		
		int action = data.GetActions();
		
		int curPlayPos = data.GetPlayerPos();
			
		int spaceVal = data.SpaceValue()[curPlayPos];
		
		
		
		
		String spaceName = data.SpaceName()[curPlayPos];
		
		
			
		
		data.SetPlayerBank(data.GetPlayer(), (bank - spaceVal));
		
		data.SetSpaceOwned(curPlayPos, player);
		
		
			
	
		JOptionPane.showMessageDialog(null, "Player " + player + " bought " + spaceName + " for $" + spaceVal);
		
		ColorSetChecking();
		
		data.SetActions(1);
		System.out.println("Current Action Now: " + action);
		game.TheGame();
	}
	
	public void PayRent() {
		int curPlayer = data.GetPlayer();
		
		int spaceOwned = data.GetSpaceOwned();
		
		int curPlayPos = data.GetPlayerPos();
		
		int rentToPay = data.GetRentToPay();
		
		int bank = data.GetPlayersBank(curPlayer);
		
		int secondBank = data.GetPlayersBank(spaceOwned);
		
		String spaceName = data.SpaceName()[curPlayPos];
		if (curPlayer == spaceOwned) {
			System.out.println("You own this space :)");
			data.SetActions(1);
			game.TheGame();
			
		}
		
		else {
		if (bank - rentToPay >= 0) {
		
		
		JOptionPane.showMessageDialog(null, spaceName + " is owned by Player " + spaceOwned + ". Player " + curPlayer +
				" pays them " + rentToPay + " In rent.");
		
		data.SetPlayerBank(data.GetPlayer(), (bank - rentToPay));
		data.SetPlayerBank(spaceOwned, (secondBank + rentToPay));
		
		data.SetActions(1);
		System.out.println("Current Action Now: " + data.GetActions());
		game.TheGame();
		
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "You don't have enough!");
			System.exit(0);
		}
		
		
		}
		
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
	
	public void ColorSetChecking() {
		int player = data.GetPlayer();
		
		int curSpace = data.GetPlayerPos();
		
		int rentToPay = data.GetRentToPay();
		
		
		if (data.GetColorSet(1) == 0) {
			
			if (data.GetSpaceCheck(1) == player && data.GetSpaceCheck(3) == player) {
				
				
				data.SetColorSet(1);
				
				data.SetRentToPay(1, (rentToPay * 2));
				
				data.SetRentToPay(3, (rentToPay * 2));
				
				
				JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Brown Color Set! :D");
				
				
			}
			else if (data.GetColorSet(2) == 0) {
				if (data.GetSpaceCheck(6) == player && data.GetSpaceCheck(8) == player && data.GetSpaceCheck(9) == player) {
					
					
					data.SetColorSet(2);
					
					data.SetRentToPay(6, (rentToPay * 2));
					
					data.SetRentToPay(8, (rentToPay * 2));
					
					data.SetRentToPay(9, (rentToPay * 2));
					
					JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Light Blue Color Set! :D");
				}
				
			}
			else if (data.GetColorSet(3) == 0) {
				if (data.GetSpaceCheck(11) == player && data.GetSpaceCheck(13) == player && data.GetSpaceCheck(14) == player) {
					
					
					data.SetColorSet(3);
					
					data.SetRentToPay(11, (rentToPay * 2));
					
					data.SetRentToPay(13, (rentToPay * 2));
					
					data.SetRentToPay(14, (rentToPay * 2));
					
					JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Pink Color Set! :D");
					
				}
				
			}
			else if (data.GetColorSet(4) == 0) {
				if (data.GetSpaceCheck(16) == player && data.GetSpaceCheck(18) == player && data.GetSpaceCheck(19) == player) {
					
					
					data.SetColorSet(4);
					
					data.SetRentToPay(16, (rentToPay * 2));
					
					data.SetRentToPay(18, (rentToPay * 2));
					
					data.SetRentToPay(19, (rentToPay * 2));
					
					JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Orange Color Set! :D");
					
				}
				
			}
			else if (data.GetColorSet(5) == 0) {
				if (data.GetSpaceCheck(21) == player && data.GetSpaceCheck(23) == player && data.GetSpaceCheck(24) == player) {
					
					
					data.SetColorSet(5);
					
					data.SetRentToPay(21, (rentToPay * 2));
					
					data.SetRentToPay(23, (rentToPay * 2));
					
					data.SetRentToPay(24, (rentToPay * 2));
					
					
					JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Red Color Set! :D");
					
				}
				
			}
			else if (data.GetColorSet(6) == 0) {
				if (data.GetSpaceCheck(26) == player && data.GetSpaceCheck(27) == player && data.GetSpaceCheck(29) == player) {
					
					
					data.SetColorSet(6);
					
					data.SetRentToPay(26, (rentToPay * 2));
					
					data.SetRentToPay(27, (rentToPay * 2));
					
					data.SetRentToPay(29, (rentToPay * 2));
					
					JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Yellow Color Set! :D");
					
				}
				
			}
			else if (data.GetColorSet(7) == 0) {
				if (data.GetSpaceCheck(31) == player && data.GetSpaceCheck(32) == player && data.GetSpaceCheck(34) == player) {
					
					
					data.SetColorSet(7);
					
					data.SetRentToPay(31, (rentToPay * 2));
					
					data.SetRentToPay(32, (rentToPay * 2));
					
					data.SetRentToPay(34, (rentToPay * 2));
					
					
					JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Green Color Set! :D");
					
				}
				
			}
			else if (data.GetColorSet(8) == 0) {
				if (data.GetSpaceCheck(37) == player && data.GetSpaceCheck(39) == player) {
					
					
					data.SetColorSet(8);
					
					data.SetRentToPay(37, (rentToPay * 2));
					
					data.SetRentToPay(39, (rentToPay * 2));
					
					
					JOptionPane.showMessageDialog(null, "Player " + player + "Owns The Dark Blue Color Set! :D");
					
				}
				
			}
			
			}
		
	}
	public void EndTurn() {
		
		int curPlayer = data.GetPlayer();
		
		


		//System.out.println("Current Stats Before Turn Ends: ");
		//System.out.println("Player: " + data.GetPlayer());
		//System.out.println("Current Space of Player: " + data.GetPlayerPos());
		//System.out.println("Current Player Bank: " + data.GetPlayersBank());
		  
		  System.out.println("Player 1 bank :" + data.GetPlayersBank(1));
		  System.out.println("Player 2 bank :" + data.GetPlayersBank(2));
		  System.out.println("Player 3 bank :" + data.GetPlayersBank(3));
		  System.out.println("Player 4 bank :" + data.GetPlayersBank(4));
		
		
		
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
