package game;

import java.awt.Color;

public class Tax implements Field {
	
	private String fieldTitle, fieldDescription, fieldSubText, fieldPicture;
	private Color bgColor;
	private int taxAmount;
	private double taxRate;
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
	Tax(String title, String description, String subText, String picture, Color color, int amount,double rate)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldSubText = subText;
		fieldPicture = picture;
		bgColor = color;
		taxAmount = amount;
		taxRate = rate;
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
		public void setTaxRate(int rate)
		{
			taxRate = rate;
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
		double getTaxRate()
		{
			return taxRate;
		}
		
	@Override
	public void landOnField(Player player) 
	{
		boolean taxChoice = false;
			if(taxRate == 0)
			{
				taxChoice = false;
				player.getAccount().addBalance(-taxAmount);
			}
			else if (taxRate != 0)
			{
				taxChoice = true;
			}
	}

	public void landOnField(Player player, boolean choice)
	{
		if(choice == true)
		{
			player.getAccount().addBalance(-taxAmount);
		}
		else if (choice == false)
		{
			player.getAccount().setBalance((int)(player.getAccount().getBalance()*(100-taxRate)));
		}
	}

}
