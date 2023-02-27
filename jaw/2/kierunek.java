public class kierunek{
	public static void main(String[] args){
		String tab[][] = new String[3][3];
		tab[0][0]=" ";
		tab[0][1]="N";
		tab[0][2]=" ";
		tab[1][0]="W";
		tab[1][1]=" ";
		tab[1][2]="E";
		tab[2][0]=" ";
		tab[2][1]="S";
		tab[2][2]=" ";
		
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
