package main;

import java.util.Random;

import java.util.Scanner;

public class Gamesettings extends Fundamental{
	
	static int sayac = 1;
	
	Scanner s = new Scanner(System.in);
	
	public static final String NAME = "GUESS ASAP";
	
	Random rnd = new Random();
	
	int luck = rnd.nextInt(350);
	
	public Gamesettings(String name) {
			
		super(Gamesettings.NAME);
		
	}

	public void start() {
			
		while(true) {
			for(int i = 0; i <= luck ; i++ ) {
				System.out.println("L�tfen 100 ile 0 aras�nda bir say� se�iniz: ");
				int tahmin = s.nextInt();
				s.nextLine();
				
				if(tahmin == luck) {
					
					System.out.println("Tebrikler " + sayac + " Deneme de Kazand�n�z!" + "\n" +
					"Cezay� Se�ip, Yapt�rmak �stedi�niz Rakibinizin Ad�n� Herkesle Payla��n ");
					
					System.out.println("CEZALAR L�STES�");
					
					System.out.println();
					
					System.out.println("1-SHOT");
					
					System.out.println("2-CESARETL�K");
							
					System.out.println("3-B�R TUR HERKES�N ��ECE��N� �DE");
					
						
	              break;
				
				}else if(tahmin < luck) {
					
					System.out.println(sayac + "."  + " Deneme de " + "K���k bir say� tahmin ettiniz");
					
				}else if(tahmin > luck) {
					
					System.out.println(sayac + "." + " Deneme de " + "B�y�k bir say� tahmin ettiniz");
				}
				sayac ++;
			
			
			
			
			
			
			
			
			}
		}
		
		

	}
	
	
	
	

}
