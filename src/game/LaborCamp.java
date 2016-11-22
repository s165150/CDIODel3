package game;

import java.awt.Color;

public class LaborCamp extends Ownable {
	
	/**
	 * Contructs a field of the LabourCamp type.
	 * If owned by a player all other players must pay a amount calculated by rolling the dice and multiplying the roll with the baseRent
	 * and then multiplying by the number of owned LabourCamps by the owner.
	 * @param title The title of the field
	 * @param description The description shown in the field center
	 * @param subText The text shown in the buttom of the field (Price recommended)
	 * @param picture The background picture
	 * @param color The background color of the field, is only shown if no/transparent picture is chosen
	 * @param player Number The number (integer) of the player who owns the field
	 * @param cost The buy price of the field
	 * @param payamount The price of landing on the field if owned
	 */
	LaborCamp(String title, String description, String subText, String picture, Color color, int playerNumber,
			int cost,int rent) 
	{
		super(title, description, subText, picture, color, playerNumber, cost);
		baseRent = rent;
	}
	private int baseRent;
	

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
		public int getRent() 
		{
			return baseRent;
		}
			
	@Override
	public void landOnField(GameBoard game, int boardValue, int playersTurn, MUI mui, Shaker shaker) 
		{
		if(((LaborCamp)game.boardFields.get(boardValue)).getOwner() != 10 && ((LaborCamp)game.boardFields.get(boardValue)).getOwner() != game.playerList.get(playersTurn).getPlayerNumber())
		{
			if(game.playerList.get(((LaborCamp)game.boardFields.get(boardValue)).getOwner()).getAccount().getBalance() < 1)
			{
				boolean buyPropperty = mui.get2Buttons("Do you want to buy this lot?", "yes", "no");
				if (buyPropperty){
					this.setOwner(game.playerList.get(playersTurn).getPlayerNumber());
					game.playerList.get(playersTurn).getAccount().addBalance(-this.price);
				}
			}
			else
			{
			mui.get1Button("Press to roll the dice " + game.playerList.get(playersTurn).getPlayerName(), "SHAKE");
			shaker.setShake();
			game.playerList.get(playersTurn).getAccount().addBalance(-((LaborCamp)game.boardFields.get(boardValue)).getRent()*shaker.getShake());
			game.playerList.get(getOwner()).getAccount().addBalance(((LaborCamp)game.boardFields.get(boardValue)).getRent()*shaker.getShake());
			}
		}
		if (((LaborCamp)game.boardFields.get(boardValue)).getOwner() == 10)
		{
			boolean buyPropperty = mui.get2Buttons("Do you want to buy this lot?", "yes", "no");
			if (buyPropperty){
				this.setOwner(game.playerList.get(playersTurn).getPlayerNumber());
				game.playerList.get(playersTurn).getAccount().addBalance(-this.price);
			}
		}
				
		}



}
