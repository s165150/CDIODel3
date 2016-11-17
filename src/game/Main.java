package game;

public class Main {

	public static void main(String[] args) {
		
		GameBoard game = new GameBoard();
		game.gameBoard();
		
		System.out.println(((Ownable)game.boardFields.get(1)).getPrice());
		
		//Game gameplay = new Game();
		
		/**
		 * Starts the game
		 */
		//gameplay.play();

	}

}
