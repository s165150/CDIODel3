package game;
/**
 * @author Aleksander.
 * edited by Emil
 * This class holds the responsibility to manage the rules of the game.
 */
public class Rule {

	
	/**
	 * Rule used for determining the winner
	 * @param player
	 * @return
	 */
	boolean winner(int playersInGame)
		{

			if(playersInGame == 1)
			{
				return true;
			}
			return false;
		}
}