package game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GameBoard {

	Scanner input = new Scanner(System.in);
	
	ArrayList<Field> boardFields = new ArrayList<Field>();
	public void createGameBoard()
	{
		boardFields.add(new Territory("Tribe Encampment", "A vild and primitive place", "1000", "picturepath", Color.GREEN, 0, 1000, 100));
		boardFields.add(new Territory("Crater", "Is there even a bottom?", "1500", "picturepath", Color.GREEN, 0, 1500, 300));
		boardFields.add(new Territory("Mountain", "Taller than the eye can see!", "2000", "picturepath", Color.GREEN, 0, 2000, 500));
		boardFields.add(new Territory("Cold Desert", "A vast and endless desert of ice", "3000", "picturepath", Color.GREEN, 0, 3000, 700));
		boardFields.add(new Territory("Black Cave", "I wonder what awaits everyone who dare enter", "4000", "picturepath", Color.GREEN, 0, 4000, 1000));
		boardFields.add(new Territory("The Warewall", "A wall of warewolfs... I think.", "4300", "picturepath", Color.GREEN, 0, 4300, 1300));
		boardFields.add(new Territory("Mountain Village", "A small settlement in the mountainous region", "4700", "picturepath", Color.GREEN, 0, 4700, 1600));
		boardFields.add(new Territory("South Citadel", "A vast fort ment to protect the Capitol", "5000", "picturepath", Color.GREEN, 0, 5000, 2000));
		boardFields.add(new Territory("Palace gates", "All those who wish to enter the Capt", "5500", "picturepath", Color.GREEN, 0, 5500, 2600));
		boardFields.add(new Territory("Tower", "One of the major defences of the Castle", "6000", "picturepath", Color.GREEN, 0, 6000, 3200));
		boardFields.add(new Territory("Castle", "The kings castle, the largest building in the Capitol!", "8000", "picturepath", Color.GREEN, 0, 8000, 4000));
		boardFields.add(new Refuge("Walled City", "A refuge for everyone trapped in the wasteland", "5000", "picturepath", Color.GREEN, 5000));
		boardFields.add(new Refuge("Monestary", "An offer of peace for everyone in a wild reality", "500", "picturepath", Color.GREEN, 500));
		boardFields.add(new LaborCamp("Hut In The Mountain", "A settlement of savages", "2500", "picturepath", Color.GREEN, 0 , 2500, 100));
		boardFields.add(new LaborCamp("The Pit", "A vast slavecamp", "2500", "picturepath", Color.GREEN, 0 , 2500, 100));
		boardFields.add(new Tax("Goldmine", "The main source of income for the kingdom", "2000", "picturepath", Color.GREEN, 2000,0));
		boardFields.add(new Tax("Caravan", "A passing by traders caravan, suppling goods to the whole kingdom", "4000 or 10%", "picturepath", Color.GREEN, 4000,0.10));
		boardFields.add(new Fleet("Second Sail", "A major corvette, ment for escorting tradeships", "4000", "picturepath", Color.GREEN, 0, 4000));
		boardFields.add(new Fleet("Sea Grover", "A large trading ship!", "4000", "picturepath", Color.GREEN, 0, 4000));
		boardFields.add(new Fleet("The Buccaneers", "A fleet of small raiding ships", "4000", "picturepath", Color.GREEN, 0, 4000));
		boardFields.add(new Fleet("Privateer Armada", "A fleet of warships, ment for procection of the realm.", "4000", "picturepath", Color.GREEN, 0, 4000));
	}

	ArrayList<Player> playerList = new ArrayList<Player>();
	int numOfPlayers;
	public void createPlayerList(Scanner input)
	{
	System.out.print("How many players are in this game?");
	numOfPlayers = input.nextInt();
	input.nextLine();
	if (numOfPlayers < 2 || numOfPlayers > 6)
	{
		throw new IllegalArgumentException();
	}


	for(int i = 0; i < numOfPlayers; i++)
	{
	    System.out.print("What is Player " + (i + 1) + " name?");
	    String name = input.nextLine();
	    Player plr = new Player(name, i+1, 0);
	    playerList.add(plr);
	}
	}
}