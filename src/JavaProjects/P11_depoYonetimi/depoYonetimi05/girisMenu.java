package JavaProjects.P11_depoYonetimi.depoYonetimi05;

import static JavaProjects.P11_depoYonetimi.depoYonetimi05.Variables.scan;

public class girisMenu {
    public void giris() {
        while (true) {
            System.out.println("DEPO YÖNETİMİ");
            System.out.println("Aşağıdaki menuden bir seçim yapınız.");
            System.out.printf("%-10s\n %-10s\n %-10s\n %-10s\n %-10s\n %-10s\n",
                    " Ürün Tanımlama (1)", "Ürün Girisi (2)", "Ürün Listele (3)", "Ürünü Rafa Koy (4)", "Ürün Cikisi (5)", "Bitir (0)");
            System.out.print("Secim : ");
            int secim = 0;
            try {
                secim = scan.nextInt();
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("Hatali giris yapildi.");
            }
            switch (secim) {
                case 1:
                    urunTanimla.urunTanimla();
                    break;
                case 2:
                    satinAlma satinAlma = new satinAlma();
                    satinAlma.urunGirisi();
                    break;
                case 3:
                    urunListele.urunListele();
                    break;
                case 4:
                    satinAlma satinAlma1 = new satinAlma();
                    satinAlma1.urunuRafaKoy();
                    break;
                case 5:
                    urunCikisi obj = new urunCikisi();
                    obj.urunCikisi();
                    break;
                case 0:
                    cikis.cikis();
                default:
                    System.out.println("Hatali giris yaptiniz.");
                    break;
            }
        }
    }
}

