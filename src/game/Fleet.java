package game;

import java.awt.Color;

public class Fleet extends Ownable{
	
	private int RENT_1 = 500;
	private int RENT_2 = 1000;
	private int RENT_3 = 2000;
	private int RENT_4 = 4000;
	private int ownedFleets = 0;
	private String fieldTitle, fieldDescription, fieldSubText, fieldPicture;
	private Color bgColor;
	
	/**
	 * Contructs a field of the Fleet type.
	 * If owned by a player all other players must pay a amount according to the number of Fleet fields owned by the owner.
	 * @param title The title of the field
	 * @param description The description shown in the field center
	 * @param subText The text shown in the buttom of the field (Price recommended)
	 * @param picture The background picture
	 * @param color The background color of the field, is only shown if no/transparent picture is chosen
	 * @param player Number The number (integer) of the player who owns the field
	 * @param cost The buy price of the field
	 */
	Fleet(String title, String description, String subText, String picture, Color color, int playerNumber,int cost)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldSubText = subText;
		fieldPicture = picture;
		bgColor = color;
		owner = playerNumber;
		price = cost;
	}
	
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
			int rent;
			switch(owned)
			{
			case 1: rent = RENT_1;
			break;
			case 2: rent = RENT_2;
			break;
			case 3: rent = RENT_3;
			break;
			case 4: rent = RENT_4;
			break;
			}
			return rent;
		}
		
	@Override
	public void landOnField(Player player) 
	{
			
	}
	
	
}
