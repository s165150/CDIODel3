package game;

import java.util.Scanner;
import game.MUI;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GameBoard game = new GameBoard();
		MUI mui = new MUI();
		//game.createGameBoard();
		mui.createBoard(game);
		//game.createPlayerList(input);
		mui.getUserString("Message");
		//System.out.println(game.playerList.get(0).getPlayerNumber() + game.playerList.get(0).getPlayerName());
		
		
//		System.out.println(game.playerList.get(0).getPlayerName());
//		System.out.println(game.playerList.get(1).getPlayerName());
//		System.out.println(game.playerList.get(2).getPlayerName());
//		System.out.println(game.playerList.get(3).getPlayerName());
//		System.out.println(game.playerList.get(4).getPlayerName());
//		System.out.println(game.playerList.get(5).getPlayerName());
//		game.gameBoard();
//		
//		System.out.println(((Ownable)game.boardFields.get(1)).getPrice());
		
		//Game gameplay = new Game();
		
		/**
		 * Starts the game
		 */
		//gameplay.play();

		
		
	}

}
