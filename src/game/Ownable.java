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
	
		//Methods		
		abstract int getRent();
	
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
			//Set methods
			void setprice(int amount)
			{
				this.price = amount;
			}
		
			void setOwner(int value)
			{
				owner = value;
			}
		
			//Get methods
			int getPrice()
			{
				return price;
			}
			
			int getOwner()
			{
				return owner;
			}
			void purchasePropperty(boolean purchaseLot, GameBoard game, int playersTurn)
			{
				if (purchaseLot){
					setOwner(game.playerList.get(playersTurn).getPlayerNumber());
					game.playerList.get(playersTurn).getAccount().addBalance(-this.price);
				}
				
			}
}

