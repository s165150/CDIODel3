package game;

import java.awt.Color;

public class Tax implements Field {
	
	private String fieldTitle, fieldDescription, fieldSubText, fieldPicture;
	private Color bgColor;
	private int taxAmount;
	private int taxRate = -1;
	/**
	 * Construcs a field of the Tax type.
	 * When a player lands on a tax field, they must pay a fixed taxAmount to the bank, OR choose to pay 10% of their assets to the bank.
	 * @param title The title of the field
	 * @param description The description shown in the field center
	 * @param subText The text shown in the buttom of the field (Tax amount recommended)
	 * @param picture The background picture
	 * @param color The background color of the field, is only shown if no/transparent picture is chosen
	 * @param amount The fixed tax amount to be payed
	 */
	Tax(String title, String description, String subText, String picture, Color color, int amount)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldSubText = subText;
		fieldPicture = picture;
		bgColor = color;
		taxAmount = amount;
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
		public void setTaxAmount(int amount)
		{
			taxAmount = amount;
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
		int getTaxAmount()
		{
			return taxAmount;
		}
		
	@Override
	public void landOnField(Player player) 
	{
			
	}

}
