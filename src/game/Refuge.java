package game;

import java.awt.Color;

public class Refuge implements Field{
	
	private String fieldTitle, fieldDescription, fieldSubText, fieldPicture;
	private Color bgColor;
	private int bonus;
	
	/**
	 * Constructs a field of the Refuge type.
	 * When a player lands on a Refuge field, a fixed bonus is payed out to the player.
	 * @param title The title of the field
	 * @param description The description shown in the field center
	 * @param subText The text shown in the buttom of the field (bonus recommended)
	 * @param picture The background picture
	 * @param color The background color of the field, is only shown if no/transparent picture is chosen
	 * @param amount The fixed bonus to be earned
	 */
	Refuge(String title, String description, String subText, String picture, Color color,int amount)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldSubText = subText;
		fieldPicture = picture;
		bgColor = color;
		bonus = amount;
	}
		//Set methods
		@Override
		public void setFieldTitle(String text) 
		{
			fieldTitle = text;
		}	@Override
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
		public void setBonus(int amount)
		{
			bonus = amount;
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
		public int getBonus()
		{
			return bonus;
		}

	@Override
	public void landOnField(GameBoard game, int b, int p) 
	{
		game.playerList.get(p).getAccount().addBalance(bonus);
	}

}
