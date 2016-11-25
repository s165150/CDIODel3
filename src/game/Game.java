package game;
/**
 * @Author Aleksander & Emil.
 * This class holds the responsibility to control the game flow,
 * and control the other classes
 */
import java.io.IOException;

public class Game {
	
	private GameBoard game = new GameBoard();
	private MUI mui = new MUI();
	private Shaker shaker = new Shaker();
	private int numOfPlayers;
	private int i = 0;
	private int index = 0;
	private Rule rule = new Rule();
	private Text file = new Text("GameText.txt");
	private String[] textList = null;
	
	
	public void createPlayers()
	{
		while(numOfPlayers < 2 || numOfPlayers > 6)
		{
			numOfPlayers = mui.getUserInt(textList[0]);
		}
		game.createPlayerList(numOfPlayers, mui);
	}
	public void startGame()
	{
		
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	game.createGameBoard();
	mui.createBoard(this.game);
	createPlayers();
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
					mui.displayMidDescription(textList[3] + player.getPlayerName() + textList[4]);
					mui.get1Button(textList[5], textList[6]);
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