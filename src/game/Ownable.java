package game;

public abstract class Ownable extends Field{
	
	protected int price;
	protected Player owner;
	
	//Methods
	abstract int getRent();
	
		//Set methods
		void setOwner(Player player)
		{
			this.owner = player;
		}
		void setprice(int amount)
		{
			this.price = amount;
		}
	
		//Get methods
		Player getOwner()
		{
			return this.owner;
		}
		int getPrice()
		{
			return this.price;
		}
}
