package game;
/**
 * @author Jens & Morten C
 * Edited by Aleksander for CDIO3
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
	 * @param playerName Reserves space for the player's name.
	 * @param playerAccount creates the instance of an Account within the player object.
	 * @param playerNumber number to control ownership
	 * @param position players position on the board
	 * @param ownedFleets hov many fleets the player owns
	 */
	public Player (String name, int number, int value, int fleetsOwned)
	{
		playerName = name;
		playerAccount = new Account();
		playerNumber = number;
		position = value;
		ownedFleets = fleetsOwned;
	}

	/**
	 * Sets the player name
	 */
	public void setPlayerName(String name)
	{
		playerName = name;
	}
	
	/**
	 * Returns the player's name.
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
	
	/**
	 * Sets the player number
	 */
	public void setPlayerNumber(int value)
	{
		playerNumber = value;
	}
	
	/**
	 * Gets the player number
	 */
	public int getPlayerNumber()
	{
		return playerNumber;
	}
	
	/**
	 * Sets the players position
	 */
	public void setPosition(int v)
	{
		position = v + position;
		if (position > 22)
		{
			position = position - 22;
		}
	}
	
	/**
	 * Sets the player owned fleets
	 */
	public void setOwnedFleets(int fleetOwned)
	{
		ownedFleets = ownedFleets + fleetOwned;
	}
	
	/**
	 * Sets the players owned fleet
	 */
	public int getOwnedFleets()
	{
		return ownedFleets;
	}
	
	/**
	 * Gets the players owned fleet
	 */
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