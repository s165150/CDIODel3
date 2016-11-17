package game;

import java.awt.Color;

public class Refuge implements Field{
	
	private String fieldTitle, fieldDescription, fieldSubText, fieldPicture;
	private Color bgColor;
	private int bonus;
	
	Refuge(String title, String description, String subText, String picture, Color color,int bonus)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldSubText = subText;
		fieldPicture = picture;
		bgColor = color;
		this.bonus = bonus;
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
	public void landOnField(Player player) 
	{
		player.getAccount().addBalance(bonus);
	}
	

}
