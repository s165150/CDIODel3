package game;

import java.io.IOException;

/**
 * @author Aleksander.
 * edited by Emil
 * This class holds the responsibility to manage the rules of the game.
 */
public class Rule {
	Text file = new Text("RuleText.txt");
	String[] textList = null;
	boolean win;
	
	/**
	 * Rule used for determining the winner
	 * @param player
	 */
	public boolean winner(GameBoard game, int numOfPlayers, MUI mui)
		{
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
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