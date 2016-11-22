package game;
/**
 * @author Emil 
 * This class holds the responsibility to call the methods from the GUI.
 */
import desktop_resources.GUI;
import java.awt.Color;
import desktop_codebehind.Car;
import desktop_fields.Refuge;
import desktop_fields.Field;
import desktop_fields.Start;

public class MUI {
	
	/**
	 * @param createBoard Creates the GUI with a set
	 * @param text The Text class where the fieldArray is located
	 */
	public void createBoard(GameBoard game)
	{
		game.createGameBoard();
	Field[] fields = new Field[22];
	fields[0] = new Start.Builder().
			setTitle("Start").
			setDescription("").
			setBgColor(Color.RED).
			setSubText(null).
			build();
	
	for(int i = 2 ; i < game.boardFields.size(); i++)
	{
	fields[i-1] = new Refuge.Builder().
			setTitle(game.boardFields.get(i).getFieldTitle()).
			setSubText(game.boardFields.get(i).getFieldSubText()).
			setDescription(game.boardFields.get(i).getFieldDescription()).
			setBgColor(game.boardFields.get(i).getBgColor()).
			setPicture(game.boardFields.get(i).getFieldPicture()).
			build();
	}
	GUI.create(fields);
	}
	
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
	String getUserString(String msg)
	{
		return GUI.getUserString(msg);
	}
	
	/**
	 * Displays a message to the user and awaits a response
	 * @param msg The message shown to the user
	 * @return An integer from the user
	 */
	int getUserInt(String msg)
	{
		return GUI.getUserInteger(msg);
	}
	/**
	 * Adds a player to the board
	 * @param color The color of the players car
	 */
	void addPlayer(GameBoard game, int v)
	{
		Car car = new Car.Builder().build();
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
	void setCar(GameBoard game, int v)
	{
		GUI.setCar(game.playerList.get(v).getPosition(), game.playerList.get(v).getPlayerName());
	}
	
	/**
	 * 
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
	void displayMidDescription(String text)
	{
		GUI.displayChanceCard(text);
	}
	/**
	 * Creates a button with a given message.
	 * @param msg The general message
	 * @param button The message on the button
	 */
	void get1Button(String msg,String button)
	{
		GUI.getUserButtonPressed(msg, button);
	}
	
	/**
	 * Creates 2 buttons, the left button returns a true boolean, and the right button returns a false boolean
	 * @param msg The general messsage
	 * @param truebutton The message on the true button
	 * @param falsebutton The message on the false button
	 */
	boolean get2Buttons(String msg, String truebutton, String falsebutton)
	{
		return GUI.getUserLeftButtonPressed(msg, truebutton, falsebutton);
	}

}