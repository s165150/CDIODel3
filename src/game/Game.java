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
	Rule rule = new Rule();
	Text file = new Text("GameText.txt");
	String[] textList = null;
	
	
	public void startGame()
	{
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	mui.createBoard(game);
	while(numOfPlayers < 2 || numOfPlayers > 6)
	{
		numOfPlayers = mui.getUserInt(textList[0]);
	}
	game.createPlayerList(numOfPlayers);
	playLoop();
	}
	
	private void playerTurn(int playersTurn)
	{
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		if(rule.winner(game, numOfPlayers, mui) == true)
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
		if (game.playerList.get(playersTurn).getAccount().getBalance() > 0)
		{
		mui.get1Button(textList[1] + game.playerList.get(playersTurn).getPlayerName(), textList[2]);
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