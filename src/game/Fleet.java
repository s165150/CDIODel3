package game;

public class Fleet extends Ownable{
	
	private int RENT_1 = 500;
	private int RENT_2 = 1000;
	private int RENT_3 = 2000;
	private int RENT_4 = 4000;
	private int ownedFleets = 0;
	
	public void landOnField(Player player) 
	{
		
	}

	public int fleetsOwned(Player player)
	{
		switch(player.getFleets)
			{
			case 1: return ownedFleets = 1;
			case 2: return ownedFleets = 2;
			case 3: return ownedFleets = 3;
			case 4: return ownedFleets = 4;	
			}
	}
	public int getRent() 
	{
		int rent = 0;
		switch(ownedFleets)
			{
			case 1: rent = RENT_1;
			break;
			case 2: rent = RENT_2;
			break;
			case 3: rent = RENT_3;
			break;
			case 4: rent = RENT_4;
			break;
			}
		return rent;

	}

}
