import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class tictactoe{
	public static void main(String[] args){
		
		Scanner skan = new Scanner(System.in);
		String tab[][] = new String[3][3];
		tab[0][0]=" ";//1
		tab[0][1]=" ";//2
		tab[0][2]=" ";//3
		tab[1][0]=" ";//4
		tab[1][1]=" ";//5
		tab[1][2]=" ";//6
		tab[2][0]=" ";//7
		tab[2][1]=" ";//8
		tab[2][2]=" ";//9
		
		System.out.println("przypiszcie do siebie id (1/2), wpisz 0 aby kontynuować");
		int tak = skan.nextInt();//decyzja (niepotrzebne dalej)
		System.out.println("");
		Random rand = new Random();
		int osoba = rand.nextInt(2)+1;
		System.out.println("kolej osoby "+osoba+", zaczynasz od X");
		
		////////////////////////////////////////////
		for(int k=1;k<=5;k++)
		{
			System.out.println("gdzie chcesz dać x? (1-9): ");
			int miejsce_x = skan.nextInt();
			
			switch(miejsce_x){
				case 1:tab[0][0]="x";break;
				case 2:tab[0][1]="x";break;
				case 3:tab[0][2]="x";break;
				case 4:tab[1][0]="x";break;
				case 5:tab[1][1]="x";break;
				case 6:tab[1][2]="x";break;
				case 7:tab[2][0]="x";break;
				case 8:tab[2][1]="x";break;
				case 9:tab[2][2]="x";break;
			}
			
			System.out.println("");
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=2;j++)
				{
					System.out.print(tab[i][j]);
				}
				System.out.println();
			}
			System.out.println("");
			
			if(k==5){
				System.out.println("koniec miejsc");
				break;
			}
			
			System.out.println("gdzie chcesz dać o? (1-9): ");
			int miejsce_o = skan.nextInt();
			
			switch(miejsce_o){
				case 1:tab[0][0]="o";break;
				case 2:tab[0][1]="o";break;
				case 3:tab[0][2]="o";break;
				case 4:tab[1][0]="o";break;
				case 5:tab[1][1]="o";break;
				case 6:tab[1][2]="o";break;
				case 7:tab[2][0]="o";break;
				case 8:tab[2][1]="o";break;
				case 9:tab[2][2]="o";break;
			}
			
			System.out.println("");
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=2;j++)
				{
					System.out.print(tab[i][j]);
				}
				System.out.println();
			}
			System.out.println("");
		}
		////////////////////////////////////////////
	}
}