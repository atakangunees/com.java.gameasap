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
				System.out.println("Lütfen 100 ile 0 arasýnda bir sayý seçiniz: ");
				int tahmin = s.nextInt();
				s.nextLine();
				
				if(tahmin == luck) {
					
					System.out.println("Tebrikler " + sayac + " Deneme de Kazandýnýz!" + "\n" +
					"Cezayý Seçip, Yaptýrmak Ýstediðniz Rakibinizin Adýný Herkesle Paylaþýn ");
					
					System.out.println("CEZALAR LÝSTESÝ");
					
					System.out.println();
					
					System.out.println("1-SHOT");
					
					System.out.println("2-CESARETLÝK");
							
					System.out.println("3-BÝR TUR HERKESÝN ÝÇECEÐÝNÝ ÖDE");
					
						
	              break;
				
				}else if(tahmin < luck) {
					
					System.out.println(sayac + "."  + " Deneme de " + "Küçük bir sayý tahmin ettiniz");
					
				}else if(tahmin > luck) {
					
					System.out.println(sayac + "." + " Deneme de " + "Büyük bir sayý tahmin ettiniz");
				}
				sayac ++;
			
			
			
			
			
			
			
			
			}
		}
		
		

	}
	
	
	
	

}
