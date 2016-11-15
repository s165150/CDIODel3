package game;

import java.awt.Color;

public abstract class Field {
	
	//Attributes
	protected String fieldTitle = null;
	protected String fieldSubText = null;
	protected String fieldDescription = null;
	protected String fieldPicture = null;
	protected Color  fieldBgColor = null;
	
	//Methods
	abstract void landOnField(Player player);
	
		//Set methods
		void setFieldTitle(String text)
		{
			fieldTitle = text;
		}
		void setFieldSubText(String text)
		{
			fieldSubText = text;
		}
		void setFieldDescription(String text)
		{
			fieldDescription = text;
		}
		void setFieldPicture(String text)
		{
			fieldPicture = text;
		}
		void setBgColor(Color color)
		{
			fieldBgColor = color;
		}
		
		//Get methods
		String getFieldTitle()
		{
			return fieldTitle;
		}
		String getFieldSubText()
		{
			return fieldSubText;
		}
		String getFieldDescription()
		{
			return fieldDescription;
		}
		String getFieldPicture()
		{
			return fieldPicture;
		}
		Color  getBgColor()
		{
			return fieldBgColor;
		}

}
