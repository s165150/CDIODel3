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
	
	/**
	 * Rule used for determining the winner
	 * @param player
	 */
	public void winner(GameBoard game, int playersInGame, MUI mui)
		{
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		int winner = playersInGame;
		for(Player player : game.playerList)
		{
			if(player.getAccount().getBalance() == 0)
				winner = winner -1;
		}

		if(winner == 1)
		{
			for(Player player : game.playerList)
			{
				if(player.getAccount().getBalance() != 0)
				{
					mui.displayMidDescription(textList[0] + player.getPlayerName() + textList[1]);
					mui.get1Button(textList[2], textList[3]);
					System.exit(0);
				}
			}
		}
		}

	
}