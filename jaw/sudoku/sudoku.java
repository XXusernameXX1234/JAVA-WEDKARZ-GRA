import java.util.*;
public class sudoku{
	public static void main(String[] args){
		int x;
		int y;
		int cyfra;
		Scanner skan = new Scanner(System.in);
		
		int[][] board = {
		  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
		  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
		  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
		  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
		  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
		  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
		  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
		  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
		  { 0, 9, 0, 0, 0, 0, 4, 0, 0 }  
		};
		
		for(int i=0;i<=77;i++){
			System.out.println();
			//// wyświetlanie tablicy
			for (int row=0; row<9;row++)
			{
				for (int column=0;column<9; column++)
					{
						System.out.print(board[row][column] + " ");
					}
				System.out.println();
			}
			
			//// wczytywanie miejsca
			do{
				System.out.println();
				System.out.println("nowa liczba:");
				System.out.println("kolumna (0-8): ");
				x = skan.nextInt();
				System.out.println("wiersz (0-8): ");
				y = skan.nextInt();
				
				if(board[y][x]!=0){
					System.out.println("MIEJSCE ZAJETE");
				}
			}while(board[y][x]!=0);
			
			//// wczytywanie cyfry
			do{
				System.out.println("cyfra (1-9)");
				cyfra = skan.nextInt();
				
				if(board[y][0]==cyfra || board[y][1]==cyfra || board[y][2]==cyfra || board[y][3]==cyfra || board[y][4]==cyfra || board[y][5]==cyfra || board[y][6]==cyfra || board[y][7]==cyfra || board[y][8]==cyfra){
					System.out.println("W TYM WIERSZU JEST JUŻ TAKA LICZBA");
				}
				if(board[0][x]==cyfra || board[1][x]==cyfra || board[2][x]==cyfra || board[3][x]==cyfra || board[4][x]==cyfra || board[5][x]==cyfra || board[6][x]==cyfra || board[7][x]==cyfra || board[8][x]==cyfra){
					System.out.println("W TEJ KOLUMNIE JEST JUŻ TAKA LICZBA");
				}
				if(cyfra<1 || cyfra>9){
					System.out.println("NIEPOPRAWNA CYFRA");
				}
			}while((cyfra<1 || cyfra>9) || (board[y][0]==cyfra || board[y][1]==cyfra || board[y][2]==cyfra || board[y][3]==cyfra || board[y][4]==cyfra || board[y][5]==cyfra || board[y][6]==cyfra || board[y][7]==cyfra || board[y][8]==cyfra) || (board[0][x]==cyfra || board[1][x]==cyfra || board[2][x]==cyfra || board[3][x]==cyfra || board[4][x]==cyfra || board[5][x]==cyfra || board[6][x]==cyfra || board[7][x]==cyfra || board[8][x]==cyfra));
			board[y][x]=cyfra;
			System.out.println();
		}
		System.out.println("K O N I E C");
	}
}