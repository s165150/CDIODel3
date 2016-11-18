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
	
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param Account creates the instance of an Account within the player object.
	 */
	public Player (String name, int number)
	{
		playerName = name;
		playerAccount = new Account();
		playerNumber = number;
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
	
	/**
	 * Returns the name of the player
	 */
	public String toString()
	{
		return playerName;
	}
}