package game;

public abstract class Ownable implements Field{
	
		//Attributes
		protected int price;
		public int owner;
	
		//Methods		
		abstract int getRent();
	
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
}
