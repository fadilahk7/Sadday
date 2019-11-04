//November 3rd 2019
//Fadilah Khan
//CheckerBoardAns 

import java.util.*;
public class CheckerBoardAns{
	public static void main (String [] args){
		int [] [] board = //field 
		{{2,0,2,0,2,0,2,0},
		{0,2,0,2,0,2,0,2},
		{2,0,2,0,2,0,2,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,1,0,1,0,1,0,1},
		{1,0,1,0,1,0,1,0},
		{0,1,0,1,0,1,0,1}};	
		CheckersBoard newgame = new CheckersBoard(board);
		System.out.print(newgame.move(7,7,1,1));
		System.out.print(newgame.count("BLACK"));
		}
	}
class CheckersBoard{
	private int [] [] board;
	public CheckersBoard (int [] [] board){
		this.board = board;
	}
	public static final int BLACK = 1;
	public static final int RED = 2;
	public static final int EMPTY = 0;
	public int move (int x1, int y1, int x2, int y2 ){
		int counter = 0;
		int mover = 1; //this will subtract the position or add it depending on if it's black or red hopefully
		
		if (board[x1][y1] == RED){
			if (board[x1+1][y1+1] == RED){
				System.out.println("Can't do that :(");
			}
			if (board[x1+1][y1+1] == BLACK ){
				System.out.println("Invalid move");
			}
			if (board [x1+1][y1+1] == EMPTY){
				mover +=1; 
				board [x1+1][y1+1] = RED;
				System.out.println(board[x1+1][y1+1]);
				System.out.println((x1+1)+ " , " +(y1+1));
			}
	     }
	     if (board[x1][y1] == BLACK){
	     	if (board[x1-1][y1-1] == BLACK ){
	     		System.out.println("Invalid move");
			}
			if (board[x1-1][y1-1] == RED ){
				System.out.println("Invalid move");
			}
		 	if (board[x1][y1] == EMPTY){ //prob fix this after
		 		if (board [x1+1][y1+1] == EMPTY){
					System.out.println((x1+1)+ " , " +(y1+1));
				}
			}
	     	if (board [x1-1][y1-1] == EMPTY){
	     		System.out.println("Yes " + (x1-mover)+  "," +(y1-mover) +" is empty");
	     		mover +=1;
	     		board[x1-1][y1-1] = BLACK;
	     		if (board[x1-mover][y1-mover] == EMPTY){
	     			System.out.println("Empty again! You can move here");
	     			board[x1-mover][y1-mover] = BLACK;
	     			System.out.println((x1-mover)+ "," +(y1-mover));
	     			mover +=1;
	     			System.out.println((x1-mover) + "," + (y1-mover));
	     		if (board[x1-mover][y1-mover] == EMPTY){
	     			System.out.println("Empty!");
	     			}
	     		if (board[x1-mover][y1-mover] == RED){
	     				System.out.println("You can't move here!");	
	     			}
	     		}
	   		}		
	 }
	return 5;
	}
	
	public int count(String colour){ //goes through the rows and columns of the board to find remaining pieces 
		int rowlength = board.length; //row and column length to loop through to find total pieces 
		int columnlength = board[0].length;
		int blackcount = 0;
		int redcount = 0;
	
		for (int i = 0; i < rowlength; i++){
			for (int j = 0; j <columnlength; j++){
				if (board[i][j] == RED){
					redcount +=1;
				}
				if (board[i][j] == BLACK){
					blackcount +=1;
				}
			}
		}
		return blackcount;
	}
//	public String [] [] display (){
		
//	}
}