package JavaProjects.P07_GeometrikHesaplama;

public class Dikdortgen extends Sekil {

	public Dikdortgen(double uzunKenar, double kisaKenar) {
		super(uzunKenar, kisaKenar);

	}


	public double cevreHesaplama() {
		return super.cevreHesaplama();
	}


	public double alanHesaplama() {
		//return uzunKenar*kisaKenar;
		return super.alanHesaplama();
	} 


	@Override
	public String toString() {
		return "UzunKenar = " + uzunKenar + ", kisaKenar = " + kisaKenar + ", \n dikdortgen cevre = " + cevreHesaplama()
				+ ", \n dikdortgen alan = " + alanHesaplama();
	}
}
