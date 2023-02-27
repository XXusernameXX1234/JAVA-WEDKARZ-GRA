import java.util.Scanner;

public class podaj{
	public static void main(String[] args){
		
		String tab[][] = new String[3][3];
		
		Scanner skan = new Scanner(System.in);
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.println("podaj literkę jaką chcesz dodać do["+i+"]["+j+"]");
				tab[i][j]=skan.nextLine();
			}
		}
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
	}
}
