package game;
/**
 * @author Emil  
 * This class holds the responsibility to call the methods from the GUI.
 */
import desktop_resources.GUI;
import java.awt.Color;
import desktop_codebehind.Car;
import desktop_fields.Shipping;
import desktop_fields.Field;
import desktop_fields.Start;

public class MUI {
	
	public Color getColor(int c)
	{
		Color color = null;
		switch(c){
		case 0 : color = Color.RED;
		break;
		case 1 : color = Color.BLUE;
		break;
		case 2 : color = Color.YELLOW;
		break;
		case 3 : color = Color.PINK;
		break;
		case 4 : color = Color.ORANGE;
		break;
		case 5 : color = Color.MAGENTA;
		}
		return color;
	}
	/**
	 * Creates the GUI with a set of Fields
	 * @param game The GameBoard Instance holding the array of fields
	 */
	public void createBoard(GameBoard game)
	{
	Field[] fields = new Field[22];
	fields[0] = new Start.Builder().
			setTitle("Start").
			setDescription("").
			setBgColor(Color.RED).
			setSubText(null).
			build();
	
	for(int i = 2 ; i < game.getBoardFieldsArray().size(); i++)
	{
	fields[i-1] = new Shipping.Builder().
			setTitle(game.getBoardFieldsArray().get(i).getFieldTitle()).
			setSubText(game.getBoardFieldsArray().get(i).getFieldSubText()).
			setDescription(game.getBoardFieldsArray().get(i).getFieldDescription()).
			setBgColor(game.getBoardFieldsArray().get(i).getBgColor()).
			setPicture(game.getBoardFieldsArray().get(i).getFieldPicture()).
			setRent(getRent(game,i)).
			build();
	}
	GUI.create(fields);
	}
	
	/**
	 * Perfoms the actions of a turn in the GUI, by moving the car and showing the dice value rolled
	 * @param game
	 * @param v
	 * @param shaker
	 */
	public void playTurn(GameBoard game, int v, Shaker shaker)
	{
		removeCar(game, v);
		setCar(game, v);
		setDice(shaker);
	}
	/**
	 * Displays a message to the user and awaits a response
	 * @param msg The message shown to the user
	 * @return A string from the user
	 */
	public String getUserString(String msg)
	{
		return GUI.getUserString(msg);
	}
	
	/**
	 * If a fields is Ownable, gets the rent to be printed on the GUI field
	 * @param game
	 * @param c
	 * @return
	 */
	public String getRent(GameBoard game, int c)
	{
		String rent = "";
		if(game.getBoardFieldsArray().get(c) instanceof Ownable == true)
		{
			rent = "Rent: " + Integer.toString(((Ownable)game.getBoardFieldsArray().get(c)).getRent());
		}
		return rent;
	}
	/**
	 * Displays a message to the user and awaits a response
	 * @param msg The message shown to the user
	 * @return An integer from the user
	 */
	public int getUserInt(String msg)
	{
		return GUI.getUserInteger(msg);
	}
	/**
	 * Adds a player to the board
	 * @param color The color of the players car
	 */
	public void addPlayer(GameBoard game, int v,int c)
	{
		Car car = new Car.Builder().secondaryColor(getColor(c)).build();
		GUI.addPlayer(game.playerList.get(v).getPlayerName(), game.playerList.get(v).getAccount().getBalance(),car);
	}
	
	/**
	 * Shows the Balance of a player on the board
	 */
	public void setBalance(GameBoard game, int v)
	{
		GUI.setBalance(game.playerList.get(v).getPlayerName(), game.playerList.get(v).getAccount().getBalance());
	}
	
	/**
	 * Shows to dice with given integer values at a random position on the board
	 */
	public void setDice(Shaker shaker)
	{
		GUI.setDice(shaker.getDie1().getRoll(), shaker.getDie2().getRoll());
	}
	
	/**
	 * Sets a car on a given field position (-1) on the board
	 */
	public void setCar(GameBoard game, int v)
	{
		GUI.setCar(game.playerList.get(v).getPosition(), game.playerList.get(v).getPlayerName());
	}
	
	/**
	 * sets the car on the start field again.
	 */
	public void setCarOnStart(GameBoard game, int v)
	{
		GUI.setCar(1, game.playerList.get(v).getPlayerName());
	}
	/**
	 * Removes a car on a given field position (-1) on the board
	 */
	public void removeCar(GameBoard game, int v)
	{
		GUI.removeAllCars(game.playerList.get(v).getPlayerName());
	}
	
	/**
	 * Shows a description of the actions performed on a turn in the middle of the board
	 */
	public void displayMidDescription(String text)
	{
		GUI.displayChanceCard(text);
	}
	/**
	 * Creates a button with a given message.
	 * @param msg The general message
	 * @param button The message on the button
	 */
	public void get1Button(String msg,String button)
	{
		GUI.getUserButtonPressed(msg, button);
	}
	
	/**
	 * Creates 2 buttons, the left button returns a true boolean, and the right button returns a false boolean
	 * @param msg The general messsage
	 * @param truebutton The message on the true button
	 * @param falsebutton The message on the false button
	 */
	public boolean get2Buttons(String msg, String truebutton, String falsebutton)
	{
		return GUI.getUserLeftButtonPressed(msg, truebutton, falsebutton);
	}

	/**
	 * A set method for updating the owners of fields in the GUI. 
	 * @param board
	 * @param player
	 */
	public void setOwner(int pos, String player)
	{
	GUI.setOwner(pos, player);
	}
	
	public void removeOwner(int pos)
	{
		GUI.removeOwner(pos);
	}
	
}