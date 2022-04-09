package JavaProjects.P07_GeometrikHesaplama;

public class Kare extends Dikdortgen {


     public Kare(double uzunKenar,double kisaKenar) {
		super(uzunKenar,kisaKenar);
		
	}

	@Override
	public String toString() {
		return "Kenar = " + uzunKenar + ", \n kare cevre = " + cevreHesaplama()
				+ ", \n kare alan = " + alanHesaplama();
	}


	


	


	
	
	
	
	
	
	
}
