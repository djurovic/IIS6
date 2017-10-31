package geometrija;

public class Linija {
	private Tacka pocetna;
	private Tacka krajnja;
	private String boja;
	
	public Linija() {
		
	}
	public Linija(Tacka pocetna, Tacka krajnja) {
		this.pocetna = pocetna;
		this.krajnja = krajnja;
	}
	public Linija(Tacka pocetna, Tacka krajnja, String boja) {
		this(pocetna, krajnja);
		this.boja = boja;
	}
	public void pomeriZa(int poX, int poY) {
		pocetna.pomeriZa(poX, poY);
		krajnja.pomeriZa(poX, poY);
	}
	public double duzina() {
		return pocetna.udaljenost(krajnja);
	}
	
	public Tacka getPocetna() {
		return pocetna;
	}
	public void setPocetna(Tacka pocetna) {
		this.pocetna = pocetna;
	}
	public Tacka getKrajnja() {
		return krajnja;
	}
	public void setKrajnja(Tacka krajnja) {
		this.krajnja = krajnja;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	
}
