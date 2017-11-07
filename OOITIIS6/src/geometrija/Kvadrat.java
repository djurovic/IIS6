package geometrija;

public class Kvadrat {
	private Tacka goreLevo;
	private int stranica;
	private String boja;

	public Kvadrat() {

	}

	public Kvadrat(Tacka goreLevo, int stranica) {
		this.goreLevo = goreLevo;
		this.stranica = stranica;
	}

	public Kvadrat(Tacka goreLevo, int stranica, String boja) {
		this(goreLevo, stranica);
		this.boja = boja;
	}
	public int obim() {
		return 4*this.stranica;
	}
	public int povrsina() {
		return stranica * stranica;
	}
	public void pomeriZa(int poX, int poY){
		goreLevo.pomeriZa(poX, poY);
	}
	public void pomeriNa(int x, int y) {
		goreLevo.pomeriNa(x, y);
	}
	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public int getStranica() {
		return stranica;
	}
	public void setStranica(int stranica) {
		this.stranica = stranica;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}

}