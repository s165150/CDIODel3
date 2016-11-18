package game;

import java.awt.Color;

public class Territory extends Ownable {
	
	/**
	 * Contructs a field of the Territory type. If owned by a player all other players must pay a fixed rent to land on the field.
	 * @param title The title of the field
	 * @param description The description shown in the field center
	 * @param subText The text shown in the buttom of the field (Price recommended)
	 * @param picture The background picture
	 * @param color The background color of the field, is only shown if no/transparent picture is chosen
	 * @param playerNumber The number (integer) of the player who owns the field
	 * @param cost The buy price of the field
	 * @param payamount The price of landing on the field if owned
	 */
	Territory(String title, String description, String subText, String picture, Color color, int playerNumber,
			int cost,int rent) 
	{
		super(title, description, subText, picture, color, playerNumber, cost);
		this.rent=rent;
	}
	
	//Attributes
	private int rent;
	
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
		int getRent() 
		{
			return rent;
		}
		@Override
		public void landOnField(GameBoard game) 
		{
			if(owner != 0 && != player.getPlayerNumber())
			{
				player.getAccount().addBalance(-rent);
				owner.getAccount().addBalance(rent);
			}
			else if (owner == 0 ∣∣ != player.getPlayerNumber())
			{
				if(få svar == true)
				{
					player.getAccount().addBalance(-price);
					this.owner = player.getPlayerNumber();
				}
				
		}
	
}
