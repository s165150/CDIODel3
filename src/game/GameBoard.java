package game;
/**
 * @Author Aleksander & Emil.
 * This class holds the responsibility of managing the GameBoard array and Playerlist array.
 */
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class GameBoard {

	private MUI mui = new MUI();
	public ArrayList<Field> boardFields = new ArrayList<Field>();
	private Text file = new Text("FieldInfo.txt");
	private String[] textList = null;
	public void createGameBoard()
	{
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		boardFields.add(new Territory(null, null, null, null, null, 10, numOfPlayers, numOfPlayers));
		boardFields.add(new Refuge(null, null, null, null, null, 0));
		boardFields.add(new Territory(textList[4], textList[27], "1000", "icons/Tribe_Encampment.png", Color.WHITE, 10, 1000, 100));
		boardFields.add(new Territory(textList[5], textList[28], "1500", "icons/Crater.png", Color.WHITE, 10, 1500, 300));
		boardFields.add(new Territory(textList[6], textList[29], "2000", "icons/Mountain.png", Color.WHITE, 10, 2000, 500));
		boardFields.add(new Territory(textList[7], textList[30], "3000", "icons/Cold_Desert.png", Color.WHITE, 10, 3000, 700));
		boardFields.add(new Territory(textList[8], textList[31], "4000", "icons/Black_Cave.png", Color.WHITE, 10, 4000, 1000));
		boardFields.add(new Territory(textList[9], textList[32], "4300", "icons/Warewall.png", Color.WHITE, 10, 4300, 1300));
		boardFields.add(new Territory(textList[10], textList[33], "4700", "icons/Mountain_Village.png", Color.WHITE, 10, 4700, 1600));
		boardFields.add(new Territory(textList[11], textList[34], "5000", "icons/South_Citadel.png", Color.WHITE, 10, 5000, 2000));
		boardFields.add(new Territory(textList[12], textList[35], "5500", "icons/Palace_Gates.png", Color.WHITE, 10, 5500, 2600));
		boardFields.add(new Territory(textList[13], textList[36], "6000", "icons/Tower.png", Color.WHITE, 10, 6000, 3200));
		boardFields.add(new Territory(textList[14], textList[37], "8000", "icons/Castle.png", Color.WHITE, 10, 8000, 4000));
		boardFields.add(new Refuge(textList[15], textList[38], "5000", "icons/Walled_City.png", Color.GREEN, 5000));
		boardFields.add(new Refuge(textList[16], textList[39], "500", "icons/Monastery.png", Color.GREEN, 500));
		boardFields.add(new LaborCamp(textList[17], textList[40], "2500", "icons/Huts_In_The_Mountain.png", Color.PINK, 10 , 2500, 100));
		boardFields.add(new LaborCamp(textList[18], textList[41], "2500", "icons/Pit.png", Color.PINK, 10, 2500, 100));
		boardFields.add(new Tax(textList[19], textList[42], "2000", "icons/Goldmine.png", Color.LIGHT_GRAY, 2000, 0));
		boardFields.add(new Tax(textList[20], textList[43], "4000 / 10%", "icons/Caravan.png", Color.LIGHT_GRAY, 4000, 0.10));
		boardFields.add(new Fleet(textList[21], textList[44], "4000", "icons/Second_Sail.png", Color.CYAN, 10, 4000));
		boardFields.add(new Fleet(textList[22], textList[45], "4000", "icons/Sea_Grover.png", Color.CYAN, 10, 4000));
		boardFields.add(new Fleet(textList[23], textList[46], "4000", "icons/The_Buccaneers.png", Color.CYAN, 10, 4000));
		boardFields.add(new Fleet(textList[24], textList[47], "4000", "icons/Privateer_Armada.png", Color.CYAN, 10, 4000));
	}
/**
 * Creates the arraylist of the players in the game.
 */
	ArrayList<Player> playerList = new ArrayList<Player>();

	int numOfPlayers;
	/**
	 * Creates the playerlist array, depending on the size of the players in the game.
	 * @param v User input used to define the number of players in the game.
	 */
	public void createPlayerList(int v)
	{
	numOfPlayers = v;
	//This code is to verify that there is only being created the amount of users they asked for
	//in this it also sets the players number and their position on the board, and how many fleets they own.
	for(int i = 0; i < numOfPlayers; i++)
	{
	    String name = mui.getUserString("Enter Player " + (i+1) + "s name");
	    Player plr = new Player(name, i, 1, 0);
	    playerList.add(plr);
	    mui.addPlayer(this, i,i);
	    mui.setCarOnStart(this, i);
	}
	}
	
	  public String toString(int v)
	    {
	        return "Title: " + boardFields.get(v).getFieldTitle() + ". Description: " + boardFields.get(v).getFieldDescription() + ". Price: " + boardFields.get(v).getFieldSubText();
	    }
	  public void toStringArray()
	  {
		  createGameBoard();
		  int boardPieces = boardFields.size();
		  for(int num = 2; num < boardPieces; num++)
		  {
			  System.out.println(toString(num));
		  }
	  }
}