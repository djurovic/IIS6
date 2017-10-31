package geometrija;

public class Tacka {
	private int x;
	private int y;
	private String boja;
	
	public Tacka() {
		
	}
	
	public Tacka(int x, int y) {
		this.x = x;
		setY(y);
	}
	
	public Tacka(int x, int y, String boja) {
		this(x, y);
		this.boja = boja;
	}
	
	public void pomeriNa(int x, int y) {
		this.x = x;
		setY(y);
	}
	public void pomeriZa(int x, int y) {
		this.x += x;
		this.y = this.y + y;
	}
	
	public double udaljenost(Tacka t) {
		int dX = x - t.x;
		int dY = y - t.y;
		double d = Math.sqrt(dX*dX + dY*dY);
		return d;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int novoX) {
		x = novoX;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
}
