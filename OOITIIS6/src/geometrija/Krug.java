package geometrija;

public class Krug {
	private Tacka centar;
	private int poluprecnik;
	private String boja;
	
	public Krug() {

	}

	public Krug(Tacka centar, int poluprecnik) {
		this.centar = centar;
		this.poluprecnik = poluprecnik;
	}

	public Krug(Tacka centar, int poluprecnik, String boja) {
		this.centar = centar;
		this.poluprecnik = poluprecnik;
		this.boja = boja;
	}

	public Tacka getCentar() {
		return centar;
	}
	
	public void setCentar(Tacka centar) {
		this.centar = centar;
	}
	
	public int getPoluprecnik() {
		return poluprecnik;
	}
	
	public void setPoluprecnik(int poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
	
	public String getBoja() {
		return boja;
	}
	
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	public void pomeriZa(int poX, int poY){
		centar.pomeriZa(poX, poY);
	}
	
	public void pomeriNa(int x, int y) {
		centar.pomeriNa(x, y);
	}

	public double obim() {
		return 2*poluprecnik*Math.PI;
	}
	
	public double povrsina() {
		return poluprecnik*poluprecnik*Math.PI;
	}
}
