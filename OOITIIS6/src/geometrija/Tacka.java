package geometrija;

public class Tacka {
	private int x;
	private int y;
	private String boja;
	
	public void pomeriNa(int x, int y) {
		this.x = x;
		setY(y);
	}
	public void pomeriZa(int poX, int poY) {
		x = x + poX;
		y = y + poY;
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
	
}
