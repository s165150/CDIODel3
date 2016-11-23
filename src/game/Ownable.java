package game;

import java.awt.Color;

public abstract class Ownable implements Field{
	
		//Attributes
		protected String fieldTitle;
		protected String fieldDescription;
		protected String fieldSubText;
		protected String fieldPicture;
		protected Color bgColor;
		protected int price;
		public int owner;
	
		/**
		 * Creates a way to determine the rent of the propperty	
		 * @return
		 */
		abstract int getRent();
	
		/**
		 * Creates the constructor for the ownable classes to implement. 
		 * @param title The title of the field
		 * @param description The description shown in the field center
		 * @param subText The text shown in the buttom of the field (Price recommended)
		 * @param picture The background picture
		 * @param color The background color of the field, is only shown if no/transparent picture is chosen
	 	 * @param player Number The number (integer) of the player who owns the field
	 	 * @param cost The buy price of the fieldt
		 */
		Ownable(String title, String description, String subText, String picture, Color color, int playerNumber, int cost)
		{
			fieldTitle = title;
			fieldDescription = description;
			fieldSubText = subText;
			fieldPicture = picture;
			bgColor = color;
			owner = playerNumber;
			price = cost;
		}
			/**
			 * Sets the price for the field
			 * @param amount
			 */
			void setprice(int amount)
			{
				this.price = amount;
			}
			/**
			 * Sets the owner for the field
			 * @param amount
			 */
			void setOwner(int value)
			{
				owner = value;
			}
		
			/**
			 * Gets the price for the field
			 * @param amount
			 */
			int getPrice()
			{
				return price;
			}
			
			/**
			 * Gets the owner for the field
			 * @param amount
			 */
			int getOwner()
			{
				return owner;
			}
			
			void buyProperty(GameBoard game, MUI mui, int playersTurn, int boardValue)
			{
				boolean buyPropperty = mui.get2Buttons("Do you want to buy this lot?", "yes", "no");
				if (buyPropperty){
					this.setOwner(game.playerList.get(playersTurn).getPlayerNumber());
					game.playerList.get(playersTurn).getAccount().addBalance(-this.price);
					mui.setOwner(boardValue, game.playerList.get(playersTurn).getPlayerName());
				}
			}
			
			void payRent(int rent, GameBoard game, int playersTurn)
			{
				game.playerList.get(playersTurn).getAccount().addBalance(-rent);
				game.playerList.get(getOwner()).getAccount().addBalance(rent);	
			}
			
}

