package uvod;

public class Rekapitulacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prviBroj;
		prviBroj = 0;
		double drugiBroj = 5;
		double kolicnik = prviBroj / drugiBroj;
		System.out.println(kolicnik);
		if(prviBroj > 0) {
			System.out.println("Broj je pozitivan!");
		}else if(prviBroj < 0)
			System.out.println("Broj je negativan!");
		else
			System.out.println("Broj je nula!");
		char karakter = ' ';
		String ime = "Petar";
		String prezime = "Petrović";
		System.out.println(ime+karakter+prezime+" Njegoš");
		boolean uvekTrue = true;
		boolean drugaBoolean = false;
		System.out.println(uvekTrue && drugaBoolean);
		System.out.println(uvekTrue || drugaBoolean);
		
		System.out.println("Pomoću while 1 do 10");
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Pomoću while 8 do 3");
		i = 8;
		while(i>2) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("Faktorijel broja 5");
		int faktorijel = 1;
		i = 0;
		while(i>0){
			faktorijel = faktorijel * i;
			i--;
		}
		System.out.println("5! = "+faktorijel);
		
		faktorijel = 1;
		i = 0;
		do {
			faktorijel = faktorijel * i;
			i--;
		}while(i>0);
		System.out.println("do while 5! = "+faktorijel);
		
		for(int j=8;j>=3;j--) {
			System.out.println(j);
		}
		
		for(int j=1;j<11;j++) {
			if(j % 2 == 0)
				//continue;//"vraca" se i nastavlja sa sledecom iteracijom
				break;//"iskace" iz petlje
			System.out.println("Broj "+j+" je neparan!");
		}
		konobar();
		System.out.println(donesi("NeS", "FaNtA"));
	}
	public static void konobar() {
		System.out.println("Dobar dan, izvolite?");
	}
	public static double donesi(String kafa, String sok) {
		double racun = 0;
		if(kafa.equalsIgnoreCase("nes") && sok.equalsIgnoreCase("fanta")) {
			racun = 149.99 + 249.99;
			System.out.println("Vaš račun će iznositi:");
		}
		return racun;
	}
	
}
