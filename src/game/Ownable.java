package game;

public abstract class Ownable implements Field{
	
	private int price;
	private Player owner;
	
	public abstract int getRent(int number);
	
	
}
