package game;

import java.awt.Color;

public class LaborCamp extends Ownable {
	
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
	
		//Set methods
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
		
			//Get methods
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
			
	@Override
	public void landOnField(GameBoard game, int b, int p, MUI mui) 
		{
//		boolean labourOwned;
//				if(((Ownable)game.boardFields.get(b)).getOwner() != 0 && ((Ownable)game.boardFields.get(b)).getOwner() != game.playerList.get(p).getPlayerNumber())
//				{
//					labourOwned = true;
//				}
//				else if(((Ownable)game.boardFields.get(b)).getOwner() == 0)
//				{
//					labourOwned = false;
//				}
				
		}



}
