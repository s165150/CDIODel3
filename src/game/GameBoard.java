package game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class GameBoard {
	

	
//	Territory te1 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te2 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te3 = new Territory("Tribe Encampment", "This is a Tribe Encasdfsdfdsfdsmpment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te4 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te5 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te6 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te7 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te8 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te9 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te10 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Territory te11 = new Territory("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Refuge re12 = new Refuge("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null);
//	Refuge re13 = new Refuge("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null);
//	LaborCamp lc14 = new LaborCamp("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	LaborCamp lc15 = new LaborCamp("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Tax tx16 = new Tax("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null);
//	Tax tx17 = new Tax("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null);
//	Fleet fl18 = new Fleet("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Fleet fl19 = new Fleet("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Fleet fl20 = new Fleet("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
//	Fleet fl21 = new Fleet("Tribe Encampment", "This is a Tribe Encampment", "This is the subtext", "This is the path to the picture", null, 1);
	
	
	ArrayList<Field> boardFields = new ArrayList<Field>();
	public void gameBoard()
	{
		boardFields.add(new Territory("Tribe Encampment", "Description", "Subtext", "picturepath", Color.GREEN, 100));
		boardFields.add(new Territory("Crater", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("Mojntain", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("Cold Desert", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("Black Cave", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("The Warewall", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("Mountain Village", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("South Citadel", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("Palace Gates", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("Tower", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Territory("Castle", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Refuge("Walled City", "Description", "Subtext", "picturepath", Color.GREEN, 5000));
		boardFields.add(new Refuge("Monestary", "Description", "Subtext", "picturepath", Color.GREEN, 500));
		boardFields.add(new LaborCamp("Auschwitz", "Description", "Subtext", "picturepath", Color.GREEN, 0 , 0));
		boardFields.add(new LaborCamp("Dachau", "Description", "Subtext", "picturepath", Color.GREEN, 0 , 0));
		boardFields.add(new Tax("Goldmine", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Tax("Caravan", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Fleet("Second Sail", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Fleet("Sea Grover", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Fleet("The Buccaneers", "Description", "Subtext", "picturepath", Color.GREEN, 0));
		boardFields.add(new Fleet("Privateer Armada", "Description", "Subtext", "picturepath", Color.GREEN, 0));
	}
	
	
//	
//			new Territory("Tribe Encampment", "1000", "Description", "URL", 1000,null, 100),
//			new Territory("Crater", "1500", "Description", "URL", 1500, null, 300),
//			new Territory("Mountain", "2000", "Description", "URL", 2000, null , 500),
//			new Territory("Cold Desert", "3000", "Description", "URL", 3000, null , 700),
//			new Territory("Black Cave", "4000", "Description", "URL", 4000, null , 1000),
//			new Territory("The Warewall", "4300", "Description", "URL", 4300, null , 1300),
//			new Territory("Mountain Village", "4750", "Description", "URL", 4750, null , 1600),
//			new Territory("South Citadel", "5000", "Description", "URL", 5000, null , 2000),
//			new Territory("Palace Gates", "5500", "Description", "URL", 5500, null , 2600),
//			new Territory("Tower", "6000", "Description", "URL", 6000, null , 3200),
//			new Territory("Castle", "8000", "Description", "URL", 8000, null , 4000),
//			new Refuge("Walled City", "5000", "Description", "URL", 5000),
//			new Refuge("Monestary", "500", "Description", "URL", 500),
//			new LaborCamp("Lc1", "Sub", "Description", "URL", 1000, null , 100),
//			new LaborCamp("Lc2", "Sub", "Description", "URL", 1000, null , 100),
//			new Tax("Tx1", "Sub", "Description", "URL", 0),
//			new Tax("Tx2", "Sub", "Description", "URL", 0),
//			new Fleet("Fl1", "Sub", "Description", "URL", 0, null ),
//			new Fleet("Fl2", "Sub", "Description", "URL", 0, null ),
//			new Fleet("Fl3", "Sub", "Description", "URL", 0, null ),
//			new Fleet("Fl4", "Sub", "Description", "URL", 0, null )
//	
	}
	
	
	


	


