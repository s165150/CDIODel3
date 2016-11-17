package game;

import java.awt.Color;

public class LaborCamp extends Ownable {
	
	private String fieldTitle, fieldDescription, fieldSubText, fieldPicture;
	private Color bgColor;
	int owner;
	private int baseRent;

	LaborCamp(String title, String description, String subText, String picture, Color color, int playerNumber,int rent)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldSubText = subText;
		fieldPicture = picture;
		bgColor = color;
		owner = playerNumber;
		baseRent = rent;
	}
	
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

	public void setBaseRent(int rent)
	{
		baseRent = rent;
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
	int getRent() 
	{
		return baseRent;
	}

	@Override
	public void landOnField(Player player) 
	{
		
	}




}
