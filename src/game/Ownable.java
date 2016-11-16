package game;

public abstract class Ownable implements Field{
	
	protected int price;
	public int owner;
	
		//Methods
		abstract int getRent();
	
		//Set methods
		void setprice(int amount)
		{
			this.price = amount;
		}
	
		//Get methods

		int getPrice()
		{
			return this.price;
		}
		void setFieldOwner(int value)
		{
			owner = value;
		}
}
