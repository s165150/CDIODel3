package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	Scanner input = new Scanner(System.in);
	String name1, name2, name3, name4, name5, name6;
	Player player1, player2, player3, player4, player5, player6;
	int numOfPlayers;

	
	public void createPlayers()
	{
		System.out.print("How many players are in this game?");
		numOfPlayers = input.nextInt();
		input.nextLine();
		if (numOfPlayers < 2 || numOfPlayers > 6)
		{
			throw new IllegalArgumentException();
		}
	if (numOfPlayers < 7)
	{
		Player player1 = new Player(name1, 1);
		System.out.println("Enter player1's name");
		name1 = input.nextLine();
		Player player2 = new Player(name2, 2);
		System.out.println("Enter player2's name");
		name2 = input.nextLine();
		if (numOfPlayers > 2 && numOfPlayers < 7)
		{
			new Player(name3, 7);
			System.out.println("Enter player3's name");
			name3 = input.nextLine();
			if (numOfPlayers > 3 && numOfPlayers < 7)
			{
				new Player(name4, 4);
				System.out.println("Enter player4's name");
				name4 = input.nextLine();
				if (numOfPlayers > 4 && numOfPlayers < 7)
				{
					new Player(name5, 5);
					System.out.println("Enter player5's name");
					name5 = input.nextLine();
					if (numOfPlayers > 5 && numOfPlayers < 7)
					{
						new Player(name6, 6);
						System.out.println("Enter player6's name");
						name6 = input.nextLine();
					}
				}
			}
		}
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(player4);
		System.out.println(player5);
		System.out.println(player6);
	}
	}

	
//	private Text text = new Text();
//	private Player player1 = new Player("Sir Huckleberry");
//	private Player player2 = new Player("Bob");
//	private Shaker shaker = new Shaker();
//	private int count = 1;
//	private Rule rules = new Rule();
//	private MUI mui = new MUI();
//	
//	/**
//	 * @param play Initiates the board and starts the method playLoop, thereby starting the game
//	 */
//	void play()
//	{
//		mui.createBoard(text);
//		mui.addPlayer(player1);
//		mui.addPlayer(player2);
//		mui.setCar(player1, shaker);
//		mui.setCar(player2, shaker);
//		mui.displayMidDescription(text.getStartDescription());
//		mui.button(text.getWelcome(), text.getStartGame());
//		playLoop();
//	}
//
//	/**
//	 * @param playerTurn perform a single turn by rolling the dice, setting the balance and returning all relevant info in correspondence to the current player
//	 * @param player the current player performing a turn
//	 */
//	private void playerTurn(Player player)
//	{
//		mui.initialTurn(player, shaker, text);
//		shaker.setShake();
//		player.getAccount().setBalance(text.getFieldValue(shaker.getShake()));
//		mui.mainTurn(player, shaker, text);
//	}
//	
//	/**
//	 * @param playLoop The Game instance itself. Takes alternating turns for the two players as long a no player fulfills the winning condition
//	 */
//	private void playLoop()
//	{
//		while(count < 4)
//		{
//			while(count == 1)
//			{
//			playerTurn(player1);
//			count++;
//			if(rules.ruleWolf(shaker) == true)
//				{count = 1;}
//			endGame(player1);
//			}
//			while(count == 2)
//			{
//			playerTurn(player2);
//			count--;
//			if(rules.ruleWolf(shaker) == true)
//				{count = 2;}
//			endGame(player2);
//			}
//		}
//	}
//	
//	/**
//	 * @param endGame if the winning condition is fulfilled in the playLoop method, this method is called, printing an endDescription and termination the game.
//	 * @param player the player object
//	 */
//	private void endGame(Player player)
//	{
//		if(rules.winner(player) == true)
//			{
//			mui.displayMidDescription(text.getEndDescription());
//			System.exit(0);
//			}
//	}
}