package game;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Game game = new Game();
		Text file = new Text("/GameText.txt");
		String[] textList = file.OpenFile();
		
		for(int i=0 ; i < textList.length ; i++)
		{
			System.out.println(textList);
		}
		//game.startGame();


		
		
	}

}
