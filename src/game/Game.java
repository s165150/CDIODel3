package game;

import java.util.Collections;

public class Game {
	
	GameBoard game = new GameBoard();
	MUI mui = new MUI();
	Shaker shaker = new Shaker();
	int numOfPlayers;
	int i = 0;
	
	public void startGame()
	{
	mui.createBoard(game);
	game.createPlayerList(numOfPlayers = mui.getUserInt("Please enter the number of players"));
	playLoop();
	}
	
	private void playerTurn(int playersTurn)
	{
		System.out.println(playersTurn);
		if (game.playerList.get(playersTurn).getAccount().getBalance() > 0)
		{
		mui.get1Button("Press to roll the dice Player " + playersTurn, "SHAKE");
		shaker.setShake();
		game.playerList.get(playersTurn).setPosition(shaker.getShake());
		mui.playTurn(game, playersTurn, shaker);
		game.boardFields.get(game.playerList.get(playersTurn).getPosition()).landOnField(game, game.playerList.get(playersTurn).getPosition(), playersTurn);
		mui.setBalance(game, playersTurn);
		if(((Territory)game.boardFields.get(playersTurn)).getOwner() != 10)
		mui.setBalance(game, ((Territory)game.boardFields.get(playersTurn)).getOwner());
		if (game.playerList.get(playersTurn).getAccount().getBalance() < 1)
		{
			game.playerList.get(playersTurn).setPlayerNumber(10);
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