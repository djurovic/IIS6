package geometrija;

public class Test {

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		t1.setX(10);
		t1.pomeriNa(20, 20);
		t1.pomeriZa(3, 6);
		System.out.println("X: "+t1.getX());
		System.out.println("Y: "+t1.getY());
	
		Tacka t2 = new Tacka();
		t2.pomeriNa(30, 45);
		System.out.println("t1 >> t2: "+t1.udaljenost(t2));
		System.out.println("dx "+(t1.getX()-t2.getX()));
		System.out.println("dY "+(t1.getY()-t2.getY()));
		
		Tacka t3 = new Tacka(5, 7);
		System.out.println("Y t3: "+t3.getY());
		
		Linija l1 = new Linija(t1, t2);
		System.out.println("X pocetne tacke linije : "+l1.getPocetna().getX());
		t1.setX(50);
		System.out.println("X pocetne tacke linije : "+l1.getPocetna().getX());
		Linija l2 = new Linija(new Tacka(23, 45), t2);
		l2.getKrajnja().setY(23);
		System.out.println("Y krajnje l2: "+l2.getKrajnja().getY());
		Pravougaonik p1 = new Pravougaonik(new Tacka(10, 10), 20, 30, "plava");
		System.out.println(p1.getBoja());
		// postaviti x koordinatu krajnje tacke linije l2 na vrednost y koordinate tacke gore levo p1
		l2.getKrajnja().setX(p1.getGoreLevo().getY());
		System.out.println(l2.getKrajnja().getX());
		Pravougaonik p2=new Pravougaonik(new Tacka(t3.getX(),t3.getY()),15,17,"Crna");
		System.out.println(p2.povrsina());
		System.out.println("Obim pravougaonika p2:" + p2.obim());
		Kvadrat k1 = new Kvadrat(new Tacka(p2.getGoreLevo().getX(),p2.getGoreLevo().getY()), 30, "crvena");
		System.out.println("Povrsina k1 je "+ k1.povrsina());
		/*
		Postaviti X koordinatu
		tacke goreLevo pravougaonika p1 na
		vrednost zbira X koordinate tacke t1
		i Y koordinate pocetne tacke linije l1.
		*/
		p1.getGoreLevo().setX(t1.getX() + l1.getPocetna().getY());
		/*Kreirati pravougaonik p3 
		 koji ce za X koordinatu tacke gore levo 
		 imati zbir x koordinate krajnje tacke l2 i obima p2 
		 a za Y, Y koordinatu tacke t2 umanjene za povrsinu p1 
		 koji ce za visinu imati proizvod obima p1 i povrsine p2.
		 sirina 13
		 ispisati sve vrednosti varijabli instance p2
		  */
		Pravougaonik p3=new Pravougaonik(new Tacka(l2.getKrajnja().getX()+p2.obim(),t2.getY()-p1.povrsina()), 13, p1.obim()*p2.povrsina());
		System.out.println("x koordinata goreLevo:"+p3.getGoreLevo().getX()+"\ny koordinata goreLevo:"+p3.getGoreLevo().getY()+"\nsirina:"+p3.getSirina()+"\nvisina:"+p3.getVisina()+"\nboja:"+p3.getBoja());
		
		Krug kr1 = new Krug(t1, 10);
		
		System.out.println(kr1.obim());
		System.out.println(kr1.povrsina());
		
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		
		System.out.println(t1);
		System.out.println(l1);
		
		System.out.println(p1.toString());
		
		Tacka prva = new Tacka(10, 10, "crvena");
		Tacka druga = new Tacka(10, 10, "crvena");
		
		System.out.println(prva==druga);
		
		System.out.println(prva.getX()==druga.getX());
		System.out.println(prva.getY()==druga.getY());
		System.out.println(prva.getBoja()==druga.getBoja());
		
		System.out.println(prva.equals(druga));
		
		System.out.println(prva.equals(l1));
		
		String prvi = "pera";
		String drugi = "pera";
		
		System.out.println(prvi==drugi);
		
		String treci = new String("pera");
		String cetvrti = new String("pera");
		
		System.out.println(treci==cetvrti);
		
		Tacka treca = new Tacka(10, 10, new String("bela"));
		Tacka cetvrta = new Tacka(10, 10, new String("bela"));
		
		System.out.println(treca.equals(cetvrta));
		
		
	}

}
