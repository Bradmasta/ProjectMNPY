package ProjectM.src;
public class PMGameData {
	
	
	private static int curPlayer = 1;
	
	private static int[] curPlayPos = {-1, 0, 0, 0, 0};
	
	private static int [] spaceOwned = {-1, 0, -1, 0, -1, -1, 0, -1, 0, 0, -1, 0,
			0, 0, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0,
			0, 0, -1, 0, 0, -1, 0, -1, -1, 0, -1, 0};
	
	private static int [] playersBank = {-1, 1500, 1500, 1500, 1500};
	
	private static int actions = -1;
	
	private static int doubles = 0;
	
	private static int [] colorSet = {0, 0, 0, 0, 0, 0, 0, 0};
	
	public void SetPlayer(int curPlayer) {
		
		PMGameData.curPlayer = curPlayer;
		
	}
	
	public int GetPlayer(){
		
		return curPlayer;
		
	}
	
	public void SetPlayerPos(int curPlayer, int space) {
		
		 PMGameData.curPlayPos[curPlayer] = space;
		 
	}
	public int GetPlayerPos() {
		
		return curPlayPos[curPlayer];
		
	}
	public void SetSpaceOwned(int curSpace, int player) {
		
		 PMGameData.spaceOwned[curSpace] = player;
		 
	}
	
	public int GetSpaceOwned() {
		
		return spaceOwned[curPlayPos[curPlayer]];
		
	}
	
	public void SetPlayerBank(int curPlayer, int bankAmt) {
		
		PMGameData.playersBank[curPlayer] = bankAmt;
		
	}
	
	public int GetPlayersBank() {
		
		return playersBank[curPlayer];
		
	}
	
	public void SetActions(int actions) {
		
		PMGameData.actions = actions;
		
	}
	
	public int GetActions() {
		
		return actions;
		
	}
	
	public void SetDoubles(int doubles) {
		
		PMGameData.doubles = doubles;
		
	}
	
	public int GetDoubles() {
		
		return doubles;
		
	}
	
public void SetColorSet(int colorSetObtained) {
		
		PMGameData.colorSet[colorSetObtained] = curPlayer;
		
	}
	
	public int GetColorSet(int spaceOwned){
		
		int colorSetObtained = 0;
		
		switch(spaceOwned) {
		
		case 2:
			
		case 4:
			
		case 6:
			
		case 8:
			
		case 9:
			
		case 11:
			
		case 13:
			
		case 14:
			
		case 16:
			
		case 18:
			
		case 19:
			
		case 21:
			
		case 23:
			
		case 24:
			
		case 26:
			
		case 28:
			
		case 29:
			
		case 31:
			
		case 32:
			
		case 34:
			
		case 37:
			
		case 39: 	
			
			
		default:
		System.out.println("You Shouldn't See This!");
		}
		
		
		
		
		
		return colorSet[colorSetObtained];
		
	}


/*------------------------------STATIC VALUES BELOW THIS LINE --------------------------------------*/
	
	public String[] SpaceName() {
		String spaceName[] = {"Go", "Meditterranean Avenue", "Community Chest", "Baltic Avenue", "Income Tax",
				"Reading Railroad", "Oriental Avenue", "Chance", "Vermont Avenue", "Connecticut Avenue", "Jail", 
				"St. Charles Place", "Electic Company", "States Avenue", "Virginia Avenue", "Pennsylvania RailRoad",
				"St. James Place", "Community Chest", "Tennessee Avenue", "New York Avenue", "Free Parking", "Kentucky Avenue",
				"Chance", "Indiana Avenue", "Illinois Avenue", "B & O Railroad", "Atlantic Avenue", "Ventnor Avenue",
				"Water Works", "Marvin Gardens", "Go To Jail", "Pacific Avenue", "North Carolina Avenue", "Community Chest",
				"Pennsylvania Avenue", "Short Line", "Chance", "Park Place", "Luxury Tax", "Boardwalk"};
		return spaceName;
			
		}
	public int[] SpaceValue() {
		
		int SpaceVal[] = {-1, 60, -1, 60, -1, -1, 100, -1, 100, 120, -1, 140, 150, 140, 
				160, -1, 180, -1, 180, 200, -1, 220, -1, 220, 240,-1, 260, 260, 150, 280,
				-1, 300, 300, -1, 320, -1, -1, 350, -1, 400};
		return SpaceVal;
	}
	public int[][] nonPropSpaces() {
		

		
		int[][] possNPS = {{0}, {-1}, {2}, {-1}, {4}, {5}, {-1}, {7}, {-1}, {-1}, {10},
				 {-1}, {-1}, {-1}, {-1}, {15}, {-1}, {17}, {-1}, {-1}, {20}, {-1}, {22}, 
				 {-1}, {-1}, {25}, {-1}, {-1}, {-1}, {-1}, {30}, {-1}, {-1}, {33}, {-1}, {35}, {36}, {-1}, {38}, {-1},};
		
		return possNPS;
	}

/*-------------------------------------DYNAMIC BUT NOT NECESSARY TO REFERENCE CONSTANTLY-------------------*/
public int latestRoll() {
	
	int latRoll = 0;
	
	return latRoll;
}
	
}
