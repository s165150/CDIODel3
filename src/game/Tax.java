package game;

public class Tax implements Field {
	
	private String fieldDescription;
	private String fieldPicture;
	private String fieldTitle;
	private int taxAmount;
	private int taxRate = -1;

	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	Tax(String title, String description,String picture, int price)
	{
		fieldTitle = title;
		fieldDescription = description;
		fieldPicture = picture;
	}


	public String getFieldDescription() {
		return fieldDescription;
	}

	public String getFieldPicture() {
		return fieldPicture;
	}
	
	public String getFieldTitle() {
		return fieldTitle;
	}
}
