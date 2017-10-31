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
	}

}
