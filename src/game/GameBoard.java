package game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class GameBoard {
	
	ArrayList<Field> boardFields = new ArrayList<Field>();
	public void createGameBoard()
	{
		boardFields.add(new Territory("Tribe Encampment", "Description", "1000", "picturepath", Color.GREEN, 0, 1000, 100));
		boardFields.add(new Territory("Crater", "Description", "1500", "picturepath", Color.GREEN, 0, 1500, 300));
		boardFields.add(new Territory("Mojntain", "Description", "2000", "picturepath", Color.GREEN, 0, 2000, 500));
		boardFields.add(new Territory("Cold Desert", "Description", "3000", "picturepath", Color.GREEN, 0, 3000, 700));
		boardFields.add(new Territory("Black Cave", "Description", "4000", "picturepath", Color.GREEN, 0, 4000, 1000));
		boardFields.add(new Territory("The Warewall", "Description", "4300", "picturepath", Color.GREEN, 0, 4300, 1300));
		boardFields.add(new Territory("Mountain Village", "Description", "4700", "picturepath", Color.GREEN, 0, 4700, 1600));
		boardFields.add(new Territory("South Citadel", "Description", "5000", "picturepath", Color.GREEN, 0, 5000, 2000));
		boardFields.add(new Territory("Palace Gates", "Description", "5500", "picturepath", Color.GREEN, 0, 5500, 2600));
		boardFields.add(new Territory("Tower", "Description", "6000", "picturepath", Color.GREEN, 0, 6000, 3200));
		boardFields.add(new Territory("Castle", "Description", "8000", "picturepath", Color.GREEN, 0, 8000, 4000));
		boardFields.add(new Refuge("Walled City", "Description", "5000", "picturepath", Color.GREEN, 5000));
		boardFields.add(new Refuge("Monestary", "Description", "500", "picturepath", Color.GREEN, 500));
		boardFields.add(new LaborCamp("Hut In The Mountain", "Description", "2500", "picturepath", Color.GREEN, 0 , 2500, 100));
		boardFields.add(new LaborCamp("Dachau", "Description", "2500", "picturepath", Color.GREEN, 0 , 2500, 100));
		boardFields.add(new Tax("Goldmine", "Description", "2000", "picturepath", Color.GREEN, 2000));
		boardFields.add(new Tax("Caravan", "Description", "4000 or 10%", "picturepath", Color.GREEN, 4000));
		boardFields.add(new Fleet("Second Sail", "Description", "4000", "picturepath", Color.GREEN, 0, 4000));
		boardFields.add(new Fleet("Sea Grover", "Description", "4000", "picturepath", Color.GREEN, 0, 4000));
		boardFields.add(new Fleet("The Buccaneers", "Description", "4000", "picturepath", Color.GREEN, 0, 4000));
		boardFields.add(new Fleet("Privateer Armada", "Description", "4000", "picturepath", Color.GREEN, 0, 4000));
	}
}