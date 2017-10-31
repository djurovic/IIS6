package uvod;

public class Rekapitulacija {

	public static void main(String[] args) {
		double prviBroj;
		prviBroj = 0;
		double drugiBroj = 5;
		double kolicnik = prviBroj / drugiBroj;
		System.out.println(kolicnik);
		char karakter = ' ';
		String ime = "Petar";
		String prezime = "Petrović";
		System.out.println(ime+karakter+prezime+" Njegoš");
		boolean uvekTrue = true;
		boolean drugaBoolean = false;
		System.out.println(uvekTrue && drugaBoolean);
		System.out.println(uvekTrue || drugaBoolean);
		if(prviBroj > 0)
			System.out.println("Broj je pozitivan!");
		else if(prviBroj < 0)
			System.out.println("Broj je negativan!");
		else
			System.out.println("Broj je nula!");

		System.out.println("While od 1 do 10");
		int i = 1;
		while(i<11) {
			System.out.println(i);
			i++;
		}
		System.out.println("while 8 do 3");
		i = 8;
		while(i>2) {
			System.out.println(i);
			i--;
		}

		System.out.println("pomocu while faktorijel broja 5");
		int faktorijel = 1;
		i = 0;
		while(i>0){
			faktorijel = faktorijel * i;
			i--;
		}
		System.out.println("while 5! = "+faktorijel);

		faktorijel = 1;
		i = 0;
		do {
			faktorijel = faktorijel * i;
			i--;
		}while(i>0);
		System.out.println("do while 5! = "+faktorijel);

		System.out.println("for od 8 do 3");
		for(int j=8;j>2;j--) {
			System.out.println(j);
		}
		System.out.println("for neparni od 1 do 10");
		for(int j=1;j<11;j++) {
			if(j % 2 == 0)
				break;
			System.out.println("broj "+j+" je neparan!");
		}
		
		//int zbir = sabiranje(2, 2);
		System.out.println(sabiranje(2, 2));
		konobar();
		System.out.println(donesi("NeS", "fAnTa"));
	}
	public static int sabiranje(int a, int b) {
		//int zbir = a + b;
		return a + b;
	}
	public static void konobar() {
		System.out.println("Dobar dan, izvolite!");
	}
	public static double donesi(String kafa, String sok) {
		double racun = 0;
		if(kafa.equalsIgnoreCase("nes") && sok.equalsIgnoreCase("fanta")) {
			System.out.println("Vas racun ce iznositi:");
			racun = 149.99 + 249.99;
		}
		return racun;	
		
	}
	
}
