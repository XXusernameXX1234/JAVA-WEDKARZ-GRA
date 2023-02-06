import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner skan=new Scanner(System.in);
		
		//RYBY//
		float konto=10.0;
		float szczupak=40.0;
		float lipien=65.0;
		float okon=50.0;
		float sandacz=90.0;
		
		float karp=30.0;
		float ploc=15.0;
		float karas=20.0;
		float leszcz=20.0;
		float lin=70.0;

		
		//ZESTAWY//
		float startowy=1.0;
		float sredni=200.0;
		float mocny=350.0;
		
		//PRZYNETY//
		float wahadlowka=500.0;
		float chleb=0.5;
		float robak=0.7;
		
		
		int wybor_menu;
		int zarzuc;
		System.out.println("||||||| MENU  |||||||");
		System.out.println("||||| 1-zakupy ||||||");
		System.out.println("|| 2-na łowisko !!! |");
		System.out.println("|||| 3-rage quit ||||");
		wybor_menu = skan.nextInt();
		
		if(wybor_menu==1){
			System.out.println("");
			System.out.println("|||||||||||||||Zestawy||||||||||||||");
			System.out.println("1-startowy cena: 1.0 srebrnych monet");
			System.out.println("2-sredni cena: 200.0 srebrnych monet");
			System.out.println("3-mocny cena: 350.0 srebrnych monet");
			System.out.println("|||||||||||||||Przynety||||||||||||||");
			System.out.println("4-wahadlowka cena: 500.0 srebrnych monet");
			System.out.println("5-chleb cena: 0.5 srebrnych monet");
			System.out.println("6-robak: 0.7 srebrnych monet");
		}
		
		if(wybor_menu==2){
			System.out.println("");
			System.out.println("|||||||||||||||Lowisko||||||||||||||");
			System.out.println("1-zarzuć");
			System.out.println("");
		}
			
	}
}
