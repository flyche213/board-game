package boardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class boardgame {

	public static void main(String[] args) {
		
		Board myBoard = new Board();

		
//		Player[][] allPlayers = {
//				new Player(myBoard.cells[0][1],"P"),
//				new Player(myBoard.cells[10][10],"P2")
//		};
//				
//	Player p = null;
		
		
//		Player2 player2 = new Player2(myBoard.cells[10][10],"P2");
//		player2.location.land(player, myBoard);
		
		Player player = new Player(myBoard.cells[0][0],"P");
		player.location.land(player, myBoard);
		
		Player player2 = new Player(myBoard.cells[9][9],"P2");
		player2.location.land(player2, myBoard);
		
		
//		stackoverflow
//		//while(!gameEnded)
//		{
//		    if(counter%2 = 0)
//		    {
//		        playerTurn();
//		        computerTurn();
//		    }
//		    if(counter%2 = 1)
//		    {            
//		        computerTurn();
//		        playerTurn();
//		    }
//		    couter++;
//		}

		int counter = 0;
		while (true){
			
			if(counter % 2 == 0){
				System.out.println("left: "+player.location.left());
				System.out.println("right: "+player.location.right());
				System.out.println("down: "+player.location.down());
				System.out.println("up: "+player.location.up());
				
				
				// out putting position of possible moves
				ArrayList<Square> possibleMoves = new ArrayList<Square>();
				if (player.location.right() != null)
					possibleMoves.add(player.location.right());
				if (player.location.left() != null)
					possibleMoves.add(player.location.left());
				for (Square s : possibleMoves)
					System.out.println("PossibleMoves: "+s+" ["+s.X+", "+s.Y+"]");
				
				myBoard.drawBoard();
				System.out.println();
			
				// Static void game(scanner input)
				Scanner scanner = new Scanner(System.in);
		        System.out.println("Type a move player 1 (right, left, up, down)");
		        String answer = scanner.nextLine();
		        
		        if(answer.equals("right")){
		        	// Moving player to the right
		    		player.location.Vacant();
		    		player.location = player.location.right();
		    		player.location.land(player, myBoard);
		    		
		    		myBoard.drawBoard();
		    		System.out.println();
		        }
		        else if(answer.equals("left")){
		        	// Moving player to the left
		    		player.location.Vacant();
		    		player.location = player.location.left();
		    		player.location.land(player, myBoard);
		    		
		    		myBoard.drawBoard();
		    		System.out.println();
		        }
		    		else if(answer.equals("down")){
		    			// Moving player to the down
		        		player.location.Vacant();
		        		player.location = player.location.down();
		        		player.location.land(player, myBoard);
		        		
		        		myBoard.drawBoard();
		        		System.out.println();
		    		}
		    		
		    		else if(answer.equals("up")){
		    			// Moving player to the up
		        		player.location.Vacant();
		        		player.location = player.location.up();
		        		player.location.land(player, myBoard);
		        		
		        		myBoard.drawBoard();
		        		System.out.println();
		    		}
		        break;
		}
		}
		while (true){
		 if(counter % 2 == 1)
		 {
			System.out.println("left: "+player2.location.left());
			System.out.println("right: "+player2.location.right());
			System.out.println("down: "+player2.location.down());
			System.out.println("up: "+player2.location.up());
			
			
			// out putting position of possible moves
			ArrayList<Square> possibleMoves = new ArrayList<Square>();
			if (player2.location.right() != null)
				possibleMoves.add(player2.location.right());
			if (player2.location.left() != null)
				possibleMoves.add(player2.location.left());
			for (Square s : possibleMoves)
				System.out.println("PossibleMoves: "+s+" ["+s.X+", "+s.Y+"]");
			
			myBoard.drawBoard();
			System.out.println();
		
			// Static void game(scanner input)
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Type a move player 2 (right, left, up, down)");
	        String answer = scanner.nextLine();
	        
	        if(answer.equals("right")){
	        	// Moving player to the right
	    		player2.location.Vacant();
	    		player2.location = player2.location.right();
	    		player2.location.land(player2, myBoard);
	    		
	    		myBoard.drawBoard();
	    		System.out.println();
	        }
	        else if(answer.equals("left")){
	        	// Moving player to the left
	    		player2.location.Vacant();
	    		player2.location = player2.location.left();
	    		player2.location.land(player2, myBoard);
	    		
	    		myBoard.drawBoard();
	    		System.out.println();
	        }
	    		else if(answer.equals("down")){
	    			// Moving player to the down
	        		player2.location.Vacant();
	        		player2.location = player2.location.down();
	        		player2.location.land(player2, myBoard);
	        		
	        		myBoard.drawBoard();
	        		System.out.println();
	    		}
	    		
	    		else if(answer.equals("up")){
	    			// Moving player to the up
	        		player2.location.Vacant();
	        		player2.location = player2.location.up();
	        		player2.location.land(player2, myBoard);
	        		
	        		myBoard.drawBoard();
	        		System.out.println();
	    		}
			}
			counter++;
        }
	}
		
	//if square 	
		
		// Moving player to the right
		//player.location.Vacant();
		//player.location = player.location.right();
		//player.location.land(player, myBoard);
		
		//myBoard.drawBoard();
		//System.out.println();
	
		//for (int i=0;i<10;i++)
		//{
			//player.location.Vacant();
			//player.location = myBoard.cells[(int)(Math.random()*10)][(int)(Math.random()*10)];
			//player.location.land(player, myBoard);
			
			//myBoard.drawBoard();
			//System.out.println();
		//}
		
		
		//players[0] = new Player(Board.getStart(),"*");
		//players[1] = new PlayerAdvanced(Board.getStart(), "@");
	
	
	}



class Board
{
	public static final int GAMELENGTH = 100;
	static Square[][] cells = new Square[10][10];
	public Board()
	{
		//constructing the board
		int numbering = 0;
		for (int row=0;row<cells.length;row++)
		{
			for (int col=0;col<cells[row].length;col++)
				{
				//creating squares
				cells[row][col] = new Square(row, col, ".");
				
			}
			
		}	
	//Empties and Squares******************************************************************	
		cells[2][2] = new Square(2,2,"2");
		cells[7][7] = new Square(7,7,"2");
		cells[0][3] = new Empty(0,3,"X");
		cells[1][1] = new Empty(1,1,"X");
		cells[8][8] = new Empty(8,8,"X");
		cells[9][6] = new Empty(9,6,"X");
		cells[7][6] = new Empty(7,6,"X");
		cells[7][5] = new Empty(7,5,"X");
		cells[7][4] = new Empty(7,4,"X");
		cells[8][4] = new Empty(8,4,"X");
		cells[9][2] = new Empty(9,2,"X");
		cells[8][2] = new Empty(8,2,"X");
		cells[7][2] = new Empty(7,2,"X");
		cells[5][2] = new Empty(5,2,"X");
		cells[4][2] = new Empty(4,2,"X");
		cells[3][2] = new Empty(3,2,"X");
		cells[4][6] = new Empty(4,6,"X");
		cells[5][3] = new Empty(5,3,"X");
		cells[2][3] = new Empty(2,3,"X");
		cells[2][4] = new Empty(2,4,"X");
		cells[2][5] = new Empty(2,5,"X");
		cells[0][7] = new Empty(0,7,"X");
		cells[1][7] = new Empty(1,7,"X");
		cells[2][7] = new Empty(2,7,"X");
		cells[4][7] = new Empty(4,7,"X");
		cells[5][7] = new Empty(5,7,"X");
		cells[6][7] = new Empty(6,7,"X");
		cells[5][4] = new Square(5,4,"*");
		cells[4][4] = new Square(4,4,"*");
		cells[5][5] = new Square(5,4,"*");
		cells[4][5] = new Square(5,4,"*");
		
		// online java tutorial************************************
		// int [][] myboard = new int [10] [10];
		//for (int[] row : myboard){
			//Arrays.fill (row, '*');
		}
		//************************************************************
	
	
	

	
	public void drawBoard()
	{
		for (int row=0;row<cells.length;row++)
		{
			for (int col=0;col<cells[row].length;col++)
			{
				String output = cells[row][col]+"   "; 
				System.out.print(output.substring(0, 3) );
			}
			System.out.println();
		}
	}


	public void movePlayer(Player p, int i) {
		
		
		// TODO Auto-generated method stub
		
	}
	
}

class Player 
{
	
	public String name;
	public int wins=0;
	public int returns = 0;
	public int skips = 0;
	public int distanceTraveled = 0;
	Square location;
	
	public Player(Square start, String name)
	{
		location=start;
		this.name = name;
	}
	public int makeMove(Board b)
	{
		int move = (int)(Math.random()*6)+1;
		distanceTraveled += move;
		return move;
	}
	public String draw()
	{
		return name; //my player draw only draws the player name
	}
}


class PlayerAdvanced extends Player
{
	public PlayerAdvanced(Square start, String name)
	{
		super(start,name);
	}
	public int makeMove(Board b)
	{
		int move = (int)(Math.random()*6)+1;
				
		
		distanceTraveled += move;
		return move;
	}
}



class Empty extends Square
{
	public Empty(int i, int z, String symbol)
	{
		super(i,z,"X");
	}
}
class Square
{
	public String move;
	public int X;
	public int Y;
	Player currentPlayer; //the player that occupies this square
	String Symbol;
	public Square(int i, int z, String symbol)
	{
		X=z;
		Y=i;
		Symbol = symbol;
		
	}
	
	public Square right(){
		
		if (X+1 < Board.cells[Y].length)
		{
			if (Board.cells[Y][X+1] instanceof Empty)
				return null;
			return Board.cells[Y][X+1];
		}
		return null;
	}
	
	public Square left(){
		
		if (X-1 >= 0)
		{
			if (Board.cells[Y][X-1] instanceof Empty)
				return null;
			return Board.cells[Y][X-1];
		}
		return null;
	}
	
	public Square up(){
		
		if (Y-1 >= 0)
		{
			if (Board.cells[Y-1][X] instanceof Empty)
				return null;
			return Board.cells[Y-1][X];
		}
		return null;
	}
	
	public Square down()
	{		
		if (Y+1 < Board.cells[Y].length)
		{
			if (Board.cells[Y+1][X] instanceof Empty)
				return null;
			return Board.cells[Y+1][X];
		}
		return null;
	}
	
	
	
	public void land(Player p, Board b)
	{
		//normal square does nothing
		currentPlayer = p;		
	}
	
	public boolean isOccupied()
	{
		return currentPlayer != null;
	}
	public void Vacant()
	{
		currentPlayer = null; //clear out the player
	}
	public String toString()
	{
		return  isOccupied() ? currentPlayer.draw() : Symbol; //if the return square is occupied draw the player that is in the square
	}
}
class Return extends Square
{
	public Return(int i, int z)
	{
		super(i, z, "R");
	}
	public void land(Player p,Board b)
	{
		super.land(p, b);
		//roll a die and move back that many spaces (notice the negative)
		int i = -(int)(Math.random()*6)+1;
		//do not move player to a negative place on the board
		b.movePlayer(p, i);
		p.returns++;
	}

	public String draw()
	{
		return "R";
	}
}
