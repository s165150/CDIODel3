package game;

import java.io.IOException;

public class Game {
	
	GameBoard game = new GameBoard();
	MUI mui = new MUI();
	Shaker shaker = new Shaker();
	int numOfPlayers;
	int i = 0;
	int winner;
	int index = 0;
	Rule rule;

	
	
	public void startGame()
	{
		Text file = new Text("GameText.txt");
		String[] textList = null;
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	mui.createBoard(game);
	game.createPlayerList(numOfPlayers = mui.getUserInt("Please enter the number of players"));
	playLoop();
	}
	
	private void playerTurn(int playersTurn)
	{
		winner = numOfPlayers;
		if (game.playerList.get(playersTurn).getAccount().getBalance() > 0)
		{
		mui.get1Button("Press to roll the dice " + game.playerList.get(playersTurn).getPlayerName(), "SHAKE");
		shaker.setShake();
		game.playerList.get(playersTurn).setPosition(shaker.getShake());
		mui.playTurn(game, playersTurn, shaker);
		game.boardFields.get(game.playerList.get(playersTurn).getPosition()).landOnField(game, game.playerList.get(playersTurn).getPosition(), playersTurn, mui, shaker);
		for(Player list : game.playerList)
		{
			mui.setBalance(game, list.getPlayerNumber());	
		}
		
		if (game.playerList.get(playersTurn).getAccount().getBalance() < 1)
			{
			index = 0;
				for(Field item : game.boardFields)
				{
					if((item instanceof Ownable) && (((Ownable)item).getOwner() == game.playerList.get(playersTurn).getPlayerNumber()))
					{
					((Ownable)item).setOwner(10);
					mui.removeOwner(index);
					}
					index++;
				}
			}
		
		}
		
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
	
	private void playLoop()
	{
		while(i < 50)
		{
			playerTurn(i);
			i++;
			if(i == numOfPlayers)
			{
				i = 0;
			}
		}
	}

}