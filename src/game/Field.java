package game;

import java.awt.Color;

public interface Field {
	/**
	 * Yessir, det her er så vores interface, det er lavet så vi (hvis vi ønsker senere hen) har nemmere ved at huske hvad der skal i de forskellige typer af fields.
	 * @param player
	 */
	//Methods
	abstract void landOnField(Player player);
	
		//Set methods
		void setFieldTitle(String text);
		void setFieldSubText(String text);
		void setFieldDescription(String text);
		void setFieldPicture(String text);
		void setBgColor(Color color);
		
		//Get methods
		String getFieldTitle();
		String getFieldSubText();
		String getFieldDescription();
		String getFieldPicture();
		Color  getBgColor();

}
