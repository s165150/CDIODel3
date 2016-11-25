package game;
/**
 * @Author Aleksander.
 * This class creates  the interface Field, which has the responsibility of creating
 * abstract methods to be implemented in the childclasses.
 */
import java.awt.Color;

public interface Field {
	/**
	 * Creates the method landOnField wich will later be passed down to all the classes that implements this interface
	 * @param game Instance of game.
	 * @param b Instance of the boardvalue as integer
	 * @param p Instance of the currentPlayer as integer
	 * @param mui instance of MUI
	 * @param shake instance of Shake
	 */
	abstract void landOnField(GameBoard game, int b, int p, MUI mui, Shaker shake);
	
		/**
		 * Sets the field title
		 * @param text
		 */
		void setFieldTitle(String text);
		/**
		 * Sets the field subtext
		 * @param text
		 */
		void setFieldSubText(String text);
		/**
		 * Sets the field description
		 * @param text
		 */
		void setFieldDescription(String text);
		/**
		 * Sets the field picture
		 * @param text
		 */
		void setFieldPicture(String text);
		/**
		 * Sets the field background color
		 * @param text
		 */
		void setBgColor(Color color);
		
		/**
		 * gets the field title
		 * @return
		 */
		String getFieldTitle();
		/**
		 * gets the field subtext
		 * @return
		 */
		String getFieldSubText();
		/**
		 * gets the field description
		 * @return
		 */
		String getFieldDescription();
		/**
		 * gets the field picture
		 * @return
		 */
		String getFieldPicture();
		/**
		 * gets the field background color
		 * @return
		 */
		Color  getBgColor();



}
