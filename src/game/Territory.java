package game;

public class Territory extends Ownable {
	private String fieldDescription;
	private String fieldPicture;
	private String fieldTitle;
	private int rent;

	public void landOnField(Player player) {
		
		
	}
	
	Territory(String title, String description,String picture, int price)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldPicture = picture;
		rent = price;
	}

	public String getFieldDescription() {
		return fieldDescription;
		
	}

	public String getFieldPicture() {
		return fieldPicture;
		
	}

	public int getRent(int number) {
		return rent;
		
		
	}

	public String getFieldTitle() {
		return fieldTitle;
	}

}
