package ProjectM.src;

public class PMMovement {
	
	
	public int move(int space, int roll) {
		
		int moveTo = space + roll;
		
		int finalMoveTo = 0;
		
		if (moveTo >= 40) {
			
			finalMoveTo = moveTo - 40;
			
		}
		else {
			
			finalMoveTo = moveTo;
		}
		
		
	
		return finalMoveTo;
	}

}
