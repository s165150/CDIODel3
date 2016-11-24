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
	 */
	public void winner(GameBoard game, int playersInGame, MUI mui)
		{
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
					mui.displayMidDescription("Congratulations! " + player.getPlayerName() + " has won the game!");
					mui.get1Button("Game Over!", "Close game");
					System.exit(0);
				}
			}
		}
		}

	
}