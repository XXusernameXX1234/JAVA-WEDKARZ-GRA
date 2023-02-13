import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner skan=new Scanner(System.in);
		Random rand = new Random();
		//RYBY//
		float konto=10.0F;
		float szczupak=40.0F;
		float lipien=65.0F;
		float okon=50.0F;
		float sandacz=90.0F;
		
		float karp=30.0F;
		float ploc=15.0F;
		float karas=20.0F;
		float leszcz=20.0F;
		float lin=70.0F;

		
		//ZESTAWY//
		float startowy=1.0F;
		float sredni=200.0F;
		float mocny=350.0F;
		
		//PRZYNETY//
		float wahadlowka=500.0F;
		float chleb=0.5F;
		float robak=0.7F;
		
		
		int wybor_menu;
		int powrot=1;
		int zarzuc;
		int ryba;
		int przyneta=100;
		float waga=0.0F;
		int zestaw=100;
		
		do{
			System.out.println("||||||| MENU  |||||||");
			System.out.println("||||| 1-zakupy ||||||");
			System.out.println("|| 2-na łowisko !!! |");
			System.out.println("|||| 3-rage quit ||||");
			wybor_menu = skan.nextInt();
		
			if(wybor_menu==1){
				powrot=2;
				System.out.println("");
				System.out.println("|||||||||||||||Zestawy||||||||||||||");
				System.out.println("");
				System.out.println("1-startowy cena: 1.0 srebrnych monet");
				System.out.println("2-sredni cena: 200.0 srebrnych monet");
				System.out.println("3-mocny cena: 350.0 srebrnych monet");
				System.out.println("");
				System.out.println("");
				System.out.println("|||||||||||||||Przynety||||||||||||||");
				System.out.println("");
				System.out.println("4-wahadlowka cena: 500.0 srebrnych monet");
				System.out.println("5-chleb cena: 0.5 srebrnych monet");
				System.out.println("6-robak: 0.7 srebrnych monet");
				do{
					System.out.println("");
					System.out.println("");
					System.out.println("Wybierz zestaw do zakupu: ");
					zestaw=skan.nextInt();
					if(zestaw==1){
							if(startowy<=konto){
								konto=konto-startowy;
								System.out.println("saldo: "+konto);
								break;
							}
							else{
								System.out.println("PIENIĘDZY BRAK");
								System.out.println("saldo: "+konto);
							}
					}
					if(zestaw==2){
							if(sredni<=konto){
								konto=konto-sredni;
								System.out.println("saldo: "+konto);
								break;
							}
							else{
								System.out.println("PIENIĘDZY BRAK");
								System.out.println("saldo: "+konto);
							}
					}
					if(zestaw==3){
							if(mocny<=konto){
								konto=konto-mocny;
								System.out.println("saldo: "+konto);
								break;
							}
							else{
								System.out.println("PIENIĘDZY BRAK");
								System.out.println("saldo: "+konto);
							}
					}
					else{
						break;
					}
				}while(startowy>konto || sredni>konto || mocny>konto);
				
				do{
					System.out.println("Wybierz przynete do zakupu: ");
					przyneta=skan.nextInt();
					if(przyneta==4){
							if(wahadlowka<=konto){
								konto=konto-wahadlowka;
								System.out.println("saldo: "+konto);
								break;
							}
							else{
								System.out.println("PIENIĘDZY BRAK");
								System.out.println("saldo: "+konto);
							}
					}
					if(przyneta==5){
							if(chleb<=konto){
								konto=konto-chleb;
								System.out.println("saldo: "+konto);
								break;
							}
							else{
								System.out.println("PIENIĘDZY BRAK");
								System.out.println("saldo: "+konto);
							}
					}
					if(przyneta==6){
							if(robak<=konto){
								konto=konto-robak;
								System.out.println("saldo: "+konto);
								break;
							}
							else{
								System.out.println("PIENIĘDZY BRAK");
								System.out.println("saldo: "+konto);
							}
					}
				}while(wahadlowka>konto || chleb>konto || robak>konto);
			}
			
			if(wybor_menu==2){
			powrot=2;
			System.out.println("");
			System.out.println("|||||||||||||||Lowisko||||||||||||||");
			System.out.println("1-zarzuć");
			zarzuc = skan.nextInt();
			if(zarzuc==1 && przyneta==4 && zestaw==1){
				ryba=rand.nextInt(4)+1;
				waga=rand.nextFloat(2)+1;
				switch(ryba){
					case 1:
						konto=konto+(szczupak*waga);
						System.out.println("brawo złowiłeś szczuponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 2:
						konto=konto+(lipien*waga);
						System.out.println("brawo złowiłeś liponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 3:
						konto=konto+(okon*waga);
						System.out.println("brawo złowiłeś konia!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 4:
						konto=konto+(sandacz*waga);
						System.out.println("brawo złowiłeś sandała!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 5:
						System.out.println("ŁOŁ nie popisałeś się, zero zdobyczy");break;
					}
				}
			if(zarzuc==1 && (przyneta==5 || przyneta==6) && zestaw==1){
				ryba=rand.nextInt(4)+1;
				waga=rand.nextFloat(2)+1;
				switch(ryba){
					case 1:
						konto=konto+(szczupak*waga);
						System.out.println("brawo złowiłeś szczuponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 2:
						konto=konto+(lipien*waga);
						System.out.println("brawo złowiłeś liponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 3:
						konto=konto+(okon*waga);
						System.out.println("brawo złowiłeś konia!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 4:
						konto=konto+(sandacz*waga);
						System.out.println("brawo złowiłeś sandała!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 5:
						System.out.println("ŁOŁ nie popisałeś się, zero zdobyczy");break;
					}
				}
				if(zarzuc==1 && przyneta==4 && zestaw==2){
				ryba=rand.nextInt(4)+1;
				waga=rand.nextFloat(6)+1;
				switch(ryba){
					case 1:
						konto=konto+(szczupak*waga);
						System.out.println("brawo złowiłeś szczuponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 2:
						konto=konto+(lipien*waga);
						System.out.println("brawo złowiłeś liponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 3:
						konto=konto+(okon*waga);
						System.out.println("brawo złowiłeś konia!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 4:
						konto=konto+(sandacz*waga);
						System.out.println("brawo złowiłeś sandała!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 5:
						System.out.println("ŁOŁ nie popisałeś się, zero zdobyczy");break;
					}
				}
			if(zarzuc==1 && (przyneta==5 || przyneta==6) && zestaw==2){
				ryba=rand.nextInt(4)+1;
				waga=rand.nextFloat(6)+1;
				switch(ryba){
					case 1:
						konto=konto+(szczupak*waga);
						System.out.println("brawo złowiłeś szczuponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 2:
						konto=konto+(lipien*waga);
						System.out.println("brawo złowiłeś liponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 3:
						konto=konto+(okon*waga);
						System.out.println("brawo złowiłeś konia!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 4:
						konto=konto+(sandacz*waga);
						System.out.println("brawo złowiłeś sandała!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 5:
						System.out.println("ŁOŁ nie popisałeś się, zero zdobyczy");break;
					}
				}
				if(zarzuc==1 && przyneta==4 && zestaw==3){
				ryba=rand.nextInt(4)+1;
				waga=rand.nextFloat(10)+1;
				switch(ryba){
					case 1:
						konto=konto+(szczupak*waga);
						System.out.println("brawo złowiłeś szczuponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 2:
						konto=konto+(lipien*waga);
						System.out.println("brawo złowiłeś liponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 3:
						konto=konto+(okon*waga);
						System.out.println("brawo złowiłeś konia!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 4:
						konto=konto+(sandacz*waga);
						System.out.println("brawo złowiłeś sandała!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 5:
						System.out.println("ŁOŁ nie popisałeś się, zero zdobyczy");break;
					}
				}
			if(zarzuc==1 && (przyneta==5 || przyneta==6) && zestaw==3){
				ryba=rand.nextInt(4)+1;
				waga=rand.nextFloat(10)+1;
				switch(ryba){
					case 1:
						konto=konto+(szczupak*waga);
						System.out.println("brawo złowiłeś szczuponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 2:
						konto=konto+(lipien*waga);
						System.out.println("brawo złowiłeś liponga!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 3:
						konto=konto+(okon*waga);
						System.out.println("brawo złowiłeś konia!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 4:
						konto=konto+(sandacz*waga);
						System.out.println("brawo złowiłeś sandała!!! "+waga+"kg");
						System.out.println("konto: "+konto);break;
					case 5:
						System.out.println("ŁOŁ nie popisałeś się, zero zdobyczy");break;
					}
				}
			}
			System.out.println("Czy chcesz wrócic do menu? - 0");
			powrot=skan.nextInt();
		}while(powrot==0);
	}
}
