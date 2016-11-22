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
		public void landOnField(GameBoard game, int boardValue, int playersTurn, MUI mui) 
		{
			if(((Territory)game.boardFields.get(boardValue)).getOwner() != 10 && ((Territory)game.boardFields.get(boardValue)).getOwner() != game.playerList.get(playersTurn).getPlayerNumber())
			{
				if(game.playerList.get(((Territory)game.boardFields.get(boardValue)).getOwner()).getAccount().getBalance() < 1)
				{
					boolean buyPropperty = mui.get2Buttons("Do you want to buy this lot?", "yes", "no");
					if (buyPropperty){
						this.setOwner(game.playerList.get(playersTurn).getPlayerNumber());
						game.playerList.get(playersTurn).getAccount().addBalance(-this.price);
					}
				}
				else
				game.playerList.get(playersTurn).getAccount().addBalance(-((Territory)game.boardFields.get(boardValue)).getRent());
				game.playerList.get(getOwner()).getAccount().addBalance(((Territory)game.boardFields.get(boardValue)).getRent());
			
			}
			if (((Territory)game.boardFields.get(boardValue)).getOwner() == 10)
			{
				boolean buyPropperty = mui.get2Buttons("Do you want to buy this lot?", "yes", "no");
				if (buyPropperty){
					this.setOwner(game.playerList.get(playersTurn).getPlayerNumber());
					game.playerList.get(playersTurn).getAccount().addBalance(-this.price);
				}
			}
				
		}
	
}
