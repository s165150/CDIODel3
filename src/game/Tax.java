package game;

import java.awt.Color;

public class Tax implements Field {
	
	private String fieldTitle, fieldDescription, fieldSubText, fieldPicture;
	private Color bgColor;
	private int taxAmount;
	private int taxRate = -1;

	Tax(String title, String description, String subText, String picture, Color color)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldSubText = subText;
		fieldPicture = picture;
		bgColor = color;
	}
	
	@Override
	public void setFieldTitle(String text) {
		fieldTitle = text;
		
	}

	@Override
	public void setFieldSubText(String text) {
		fieldSubText = text;
		
	}

	@Override
	public void setFieldDescription(String text) {
		fieldDescription = text;
		
	}

	@Override
	public void setFieldPicture(String text) {
		fieldPicture = text;
		
	}

	@Override
	public void setBgColor(Color color) {
		bgColor = color;
		
	}

	@Override
	public String getFieldTitle() {
		
		return fieldTitle;
	}

	@Override
	public String getFieldSubText() {
		// TODO Auto-generated method stub
		return fieldSubText;
	}

	@Override
	public String getFieldDescription() {
		// TODO Auto-generated method stub
		return fieldDescription;
	}

	@Override
	public String getFieldPicture() {
		// TODO Auto-generated method stub
		return fieldPicture;
	}

	@Override
	public Color getBgColor() {
		// TODO Auto-generated method stub
		return bgColor;
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	public void setTaxAmount(int amount)
	{
		taxAmount = amount;
	}

}
