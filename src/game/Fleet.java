package game;

public class Fleet extends Ownable{
	
	private int RENT_1 = 500;
	private int RENT_2 = 1000;
	private int RENT_3 = 2000;
	private int RENT_4 = 4000;
	private int ownedFleets = 0;
	
	/**
	 * If the fleet is owned, subtract the rent, corresponding to the number of fleets owned by the owner, from the player, 
	 * and adds the same amount to the owner.
	 */
	public void landOnField(Player player) 
	{
		if(owner != null)
		{
			player.getAccount().addBalance(-getRent(fleetsOwned(owner)));
			owner.getAccount().addBalance(getRent(fleetsOwned(owner)));
		}
	}

	/**
	 * @param player The player 
	 * @return
	 */
	public int fleetsOwned(Player player)
	{
		
	}
	
	/**
	 * 
	 * @param owned An integer value representing the number of fleets owned from 1-4
	 * @return
	 */
	public int getRent(int owned) 
	{
		int rent = 0;
		
		if(owned <0)
			System.out.println("ERROR! It is not possible to have less than 0 fleets, check source code!");
		
		switch(owned)
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
		if(owned >4)
			System.out.println("ERROR! It is not possible to have more than 4 fleets, check source code!");
		
		return rent;
		

	}

}
