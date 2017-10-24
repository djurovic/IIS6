package geometrija;

public class Test {

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		t1.setX(10);
		t1.pomeriNa(20, 20);
		t1.pomeriZa(3, 5);
		System.out.println("X: "+t1.getX());
		System.out.println("Y: "+t1.getY());
	}

}
