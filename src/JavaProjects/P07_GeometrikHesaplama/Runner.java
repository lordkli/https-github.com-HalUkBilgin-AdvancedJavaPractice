package JavaProjects.P07_GeometrikHesaplama;

public class Runner {

	public static void main(String[] args) {


		Cember c=new Cember(5);
		c.cevreHesaplama();
		c.alanHesaplamaCember();



		System.out.println(c);
		
		Kare k = new Kare(9,9);
		k.alanHesaplama();
		k.cevreHesaplama();
		System.out.println(k);
		
		Dikdortgen d= new Dikdortgen(15, 7);
		d.alanHesaplama();
		d.cevreHesaplama();
		System.out.println(d);
	}

}
