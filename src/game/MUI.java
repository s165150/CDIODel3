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

//	private Color Water = new Color(139, 183, 240);
	
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
	 * Adds a player to the board
	 * @param color The color of the players car
	 */
	void addPlayer(Player player,Color color)
	{
		Car car = new Car.Builder().secondaryColor(color).build();
		GUI.addPlayer(player.getPlayerName(), player.getAccount().getBalance(),car);
	}
	
	/**
	 * Shows the Balance of a player on the board
	 */
	public void setBalance(Player player)
	{
		GUI.setBalance(player.getPlayerName(), player.getAccount().getBalance());
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
	void setCar(Player player,Shaker shaker)
	{
		GUI.setCar(shaker.getShake()+1, player.getPlayerName());
	}
	
	/**
	 * 
	 * sets the car on the start field again.
	 */
	public void setCarOnStart(Player player)
	{
		GUI.setCar(1, player.getPlayerName());
	}
	/**
	 * Removes a car on a given field position (-1) on the board
	 */
	private void removeCar(Player player,Shaker shaker)
	{
		GUI.removeAllCars(player.getPlayerName());
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