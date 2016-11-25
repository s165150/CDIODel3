package game;
/**
 * @author Aleksander.
 * Edited by Emil in CDIO3
 * This class holds the responsibility to manage the rules of the game.
 */
public class Rule {
	private boolean win;
	
	/**
	 * Rule used for determining the winner
	 * @param player
	 */
	public boolean winner(GameBoard game, int numOfPlayers, MUI mui)
		{

		int winner = numOfPlayers;
		for(Player player : game.playerList)
		{
			if(player.getAccount().getBalance() == 0)
				winner = winner -1;
		}
		if(winner == 1)
		{
			win = true;
		}
		else win = false;
		
		return win;	
		}
}