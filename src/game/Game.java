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
	game.createPlayerList(numOfPlayers = mui.getUserInt(textList[0]));
	playLoop();
	}
	
	private void playerTurn(int playersTurn)
	{
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
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
		
		rule.winner(game, numOfPlayers, mui);
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