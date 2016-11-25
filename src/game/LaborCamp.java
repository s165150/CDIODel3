package game;
/**
 * @Author Aleksander. 
 * This class holds the responsibility of the LaborCamp.
 */
import java.awt.Color;
import java.io.IOException;

public class LaborCamp extends Ownable {
	
	private Text file = new Text("LabourText.txt");
	private String[] textList = null;
	/**
	 * Contructs a field of the LabourCamp type.
	 * If owned by a player all other players must pay a amount calculated by rolling the dice and multiplying the roll with the baseRent
	 * and then multiplying by the number of owned LabourCamps by the owner.
	 * @param title The title of the field
	 * @param description The description shown in the field center
	 * @param subText The text shown in the buttom of the field (Price recommended)
	 * @param picture The background picture
	 * @param color The background color of the field, is only shown if no/transparent picture is chosen
	 * @param player Number The number (integer) of the player who owns the field
	 * @param cost The buy price of the field
	 * @param payamount The price of landing on the field if owned
	 */
	LaborCamp(String title, String description, String subText, String picture, Color color, int playerNumber,
			int cost,int rent) 
	{
		super(title, description, subText, picture, color, playerNumber, cost);
		baseRent = rent;
	}
	private int baseRent;
	

		@Override
		public void setFieldTitle(String text) 
		{
			fieldTitle = text;
		}			
		@Override
		public void setFieldSubText(String text) 
		{
			fieldSubText = text;
		}
		@Override
		public void setFieldDescription(String text) 
		{
			fieldDescription = text;
		}
		@Override
		public void setFieldPicture(String text) 
		{
			fieldPicture = text;
		}
		@Override
		public void setBgColor(Color color) 
		{
			bgColor = color;
		}
		
		@Override
		public String getFieldTitle() 
		{
			return fieldTitle;
		}
		@Override
		public String getFieldSubText() 
		{
			return fieldSubText;
		}
		@Override
		public String getFieldDescription() 
		{
			return fieldDescription;
		}
		@Override
		public String getFieldPicture() 
		{
			return fieldPicture;
		}
		@Override
		public Color getBgColor() 
		{
			return bgColor;
		}
		@Override
		public int getRent() 
		{
			return baseRent;
		}
	/**
	 * This instance of landOnField, works by first, checking if the Field we are currently on, is owned by anyone.
	 * If it isnt, then it starts the buyPropperty method.
	 * If it is, it checks, if the owner is not the player currently taking their turn.
	 * If that check comes back true, it start with:
	 * Having the player roll the dies.
	 * Afterwards it checks how many LaborCamp fields the owner of this field owns.
	 * After those checks, it initiates the payRent method, with the value from the shake, owned LaborCamps and the rent of the field.
	 */
	@Override
	public void landOnField(GameBoard game, int boardValue, int playersTurn, MUI mui, Shaker shaker) 
		{
		try {
			textList = file.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(((LaborCamp)game.boardFields.get(boardValue)).getOwner() == owned)
			{
			buyProperty(game, mui, playersTurn, boardValue);		
			}
		else if(((LaborCamp)game.boardFields.get(boardValue)).getOwner() != game.playerList.get(playersTurn).getPlayerNumber())
			{
			mui.get1Button(textList[0] + game.playerList.get(playersTurn).getPlayerName(), textList[1]);
			shaker.setShake();
			mui.setDice(shaker);
			int ownedLaborCamps = 0;
			for(Field item : game.boardFields)
			{
				if((item instanceof LaborCamp) && (((Ownable)item).getOwner() == game.playerList.get(((Ownable)game.boardFields.get(boardValue)).getOwner()).getPlayerNumber()))
				{
				ownedLaborCamps++;
				}
			}
			payRent((((LaborCamp)game.boardFields.get(boardValue)).getRent()*shaker.getShake()*ownedLaborCamps), game, playersTurn);
			receiveRent(((LaborCamp)game.boardFields.get(boardValue)).getRent(), game);
			}
				
		}



}
