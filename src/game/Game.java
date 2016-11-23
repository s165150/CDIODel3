package game;

public class Game {
	
	GameBoard game = new GameBoard();
	MUI mui = new MUI();
	Shaker shaker = new Shaker();
	int numOfPlayers;
	int i = 0;
	int winner;
	Rule rule;

	
	public void startGame()
	{
	mui.createBoard(game);
	game.createPlayerList(numOfPlayers = mui.getUserInt("Please enter the number of players"));
	winner = numOfPlayers;
	playLoop();
	}
	
	private void playerTurn(int playersTurn)
	{
		if (game.playerList.get(playersTurn).getAccount().getBalance() > 0)
		{
		mui.get1Button("Press to roll the dice " + game.playerList.get(playersTurn).getPlayerName(), "SHAKE");
		shaker.setShake();
		game.playerList.get(playersTurn).setPosition(shaker.getShake());
		mui.playTurn(game, playersTurn, shaker);
		game.boardFields.get(game.playerList.get(playersTurn).getPosition()).landOnField(game, game.playerList.get(playersTurn).getPosition(), playersTurn, mui, shaker);
		mui.setBalance(game, playersTurn);		
		if (game.playerList.get(playersTurn).getAccount().getBalance() < 1)
			{
				for(Field item : game.boardFields)
				{
					if((item instanceof Ownable) && (((Ownable)item).getOwner() == game.playerList.get(playersTurn).getPlayerNumber()))
					{
					((Ownable)item).setOwner(10);
					mui.removeOwner(game.playerList.get(playersTurn).getPosition());
					}

				}
			
				winner = winner -1;
			
			}
		
		}
		if(winner == 1)
		{
			mui.displayMidDescription(game.playerList.get(playersTurn).getPlayerName() + "WON THE GAME!!!");
			mui.get1Button("Press to end the game", "end game");
			System.exit(1);
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