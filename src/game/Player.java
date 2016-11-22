package game;
/**
 * @author Jens & Morten C
 * Edited by Aleksander
 * Player class is created to keep track of the player's name, and to create an instance of the Account class.
 */
public class Player {

	private String playerName;
	private Account playerAccount;
	private int playerNumber;
	private int position;
	private int ownedFleets;
	
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param Account creates the instance of an Account within the player object.
	 */
	public Player (String name, int number, int value, int fleetsOwned)
	{
		playerName = name;
		playerAccount = new Account();
		playerNumber = number;
		position = value;
		ownedFleets = fleetsOwned;
	}

	
	public void setPlayerName(String name)
	{
		playerName = name;
	}
	/**
	 * Returns the player's name.
	 * @return
	 */
	public String getPlayerName()
	{
		return playerName;
	}
	
	/**
	 * Returns the instance of the Account type within the player object.
	 * @return myAcc
	 */
	public Account getAccount()
	{
		return playerAccount;
	}
	
	public void setPlayerNumber(int value)
	{
		playerNumber = value;
	}
	
	public int getPlayerNumber()
	{
		return playerNumber;
	}
	public void setPosition(int v)
	{
		position = v + position;
		if (position > 22)
		{
			position = position - 22;
		}
	}
	public void setOwnedFleets(int fleetOwned)
	{
		ownedFleets = ownedFleets = fleetOwned;
	}
	public int getOwnedFleets()
	{
		return ownedFleets;
	}
	public int getPosition()
	{
		return position;
	}
	/**
	 * Returns the name of the player
	 */
	public String toString()
	{
		return playerName;
	}
}