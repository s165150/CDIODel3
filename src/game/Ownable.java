package game;

public abstract class Ownable extends Field{
	
	protected int price;
	protected Player owner;
	
	abstract int getRent();
	
}
