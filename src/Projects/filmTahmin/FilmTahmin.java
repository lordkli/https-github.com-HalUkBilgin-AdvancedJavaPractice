package Projects.filmTahmin;

import java.util.*;

public class FilmTahmin {

	static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
		
		System.out.println("1-"+(film.size())+" arasinda bir sayi giriniz");
		System.out.println("(*filmin harf sayisinin 2 kati kadar tahmin hakkiniz var)");
		
		int index = scan.nextInt();

			try{
				filmGetir(film, index-1);
				
			}catch(IndexOutOfBoundsException e) {
				Random r = new Random();
				System.out.println("1-"+(film.size())+" arasinda bir sayi girmediniz!\nRastgele bir film seciliyor...");
				int random =1+ r.nextInt(film.size());
				filmGetir(film, random-1);
			}
	}

	private static void filmGetir(List<String> film, int index) {

		Scanner scan = new Scanner(System.in);
		System.out.println(film.get(index).length()+" harfli yabanci film\nTahmin etmek icin harf giriniz:");
		System.out.println(film.get(index).replaceAll("\\w", "-"));
		
		StringBuilder isim = new StringBuilder(film.get(index).replaceAll("\\w", "-"));

		char harf =' ';
		int tahmin=0;
		int dogru=0;
		String str="";
		do {
			str="";
			System.out.println("yanlis tahmin sayisi: "+(tahmin-dogru)+"/"+(2*(film.get(index).length())));
			harf=scan.next().toUpperCase().charAt(0);
			str+=harf;
			
			if (!isim.toString().contains(str)) {
				tahmin++;
			}else {
				System.out.println(str+" harfi zaten acilmis!");
			}
			
			for (int i = 0; i < isim.length(); i++) {
				
				if (film.get(index).charAt(i)==harf ) {
					if (!isim.toString().contains(film.get(index).substring(i, i+1))) {
						dogru++;
					}
					isim.setCharAt(i, harf);
				}
			}
			
			if (isim.toString().equalsIgnoreCase(film.get(index))) {
				System.out.println("~~~TEBRIKLER KAZANDIN~~~");
				System.out.println("FILMIN ADI: "+isim);
				break;
			}
			
			System.out.println(isim);

		} while ((tahmin-dogru)!=2*(film.get(index).length()));
		
		if ((tahmin-dogru)==2*(film.get(index).length())) {
			System.out.println("yanlis tahmin sayisi: "+(tahmin-dogru)+"/"+(2*(film.get(index).length())));
			System.out.println("KAYBETTIN\nFILMIN ADI: "+film.get(index));
		}
	}
}
