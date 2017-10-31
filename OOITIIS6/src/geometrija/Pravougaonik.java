package geometrija;

public class Pravougaonik {
	private Tacka goreLevo;
	private int sirina;
	private int visina;
	private String boja;
	
	public Pravougaonik() {
		
	}
	public Pravougaonik(Tacka goreLevo, int sirina, int visina) {
		this.goreLevo = goreLevo;
		this.sirina = sirina;
		this.visina = visina;
	}
	public Pravougaonik(Tacka goreLevo, int sirina, int visina, String boja) {
		this(goreLevo, sirina, visina);
		this.boja = boja;
	}

	
	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public int getSirina() {
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
}
