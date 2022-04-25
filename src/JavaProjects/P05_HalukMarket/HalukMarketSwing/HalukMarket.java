package JavaProjects.P05_HalukMarket.HalukMarketSwing;

import javax.swing.*;

public class HalukMarket {
    public static void main(String[] args) {
        // Manav Dükkanı
        String fiyatlar[] = new String[11];
        fiyatlar[0] = "Domates Kilo ; 32.10 Kr ";
        fiyatlar[1] = "Patates Kilo ; 33.20 Kr ";
        fiyatlar[2] = "Biber   Kilo  ; 41.50 Kr ";
        fiyatlar[3] = "Soğan   Kilo   ; 12.30 Kr ";
        fiyatlar[4] = "Havuç Kilo ; 23.10 Kr ";
        fiyatlar[5] = "Elma  Kilo ; 9.2 Kr ";
        fiyatlar[6] = "Muz   Kilo ; 8.90 Kr ";
        fiyatlar[7] = "Çilek   Kilo ; 55.10 Kr ";
        fiyatlar[8] = "Kavun   Kilo ; 90.30 Kr ";
        fiyatlar[9] = "Üzüm   Kilo ; 90.70 Kr ";
        fiyatlar[10] = "Limon  Adet ; 0.50 Kr ";


        JOptionPane JOptionPane = new JOptionPane();
        JOptionPane.showMessageDialog(null, fiyatlar[0] + "\n" + fiyatlar[1] + "\n"
                + fiyatlar[2] + "\n" + fiyatlar[3] + "\n" + fiyatlar[4] + "\n" + fiyatlar[5]
                + "\n" + fiyatlar[6] + "\n" + fiyatlar[7] + "\n" + fiyatlar[8] + "\n" + fiyatlar[9] + "\n" + fiyatlar[10]);

        //
        double domateskilo = 32.10;
        double dkackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Domates Aldınız ?"));
        double dsonuç = domateskilo * dkackilo;

        //
        double patateskilo = 33.20;//Patates Kilo ; 33.20
        double pkackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Patates Aldınız ?"));
        double psonuç = patateskilo * pkackilo;

        //
        double biber = 41.50;//"Biber   Kilo  ; 41.50 Kr ";
        double bkackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Biber Aldınız ?"));
        double bsonuç = biber * bkackilo;

        //
        double soğan = 12.30;//Soğan   Kilo   ; 12.30 Kr
        double skackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Soğan Aldınız ?"));
        double ssonuç = soğan * skackilo;

        //
        double havuçkilo = 23.10;//Havuç Kilo ; 23.10 Kr
        double hkackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Havuç Aldınız ?"));
        double hsonuç = havuçkilo * hkackilo;

        //
        double elmakilo = 9.2;//Elma  Kilo ; 9.2 Kr
        double ekackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Elma Aldınız ?"));
        double esonuç = elmakilo * ekackilo;

        //
        double muzkilo = 18.90;//Muz   Kilo ; 8.90 Kr
        double mkackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Muz Aldınız ?"));
        double msonuç = mkackilo * muzkilo;

        double cilekkilo = 55.10;//Çilek   Kilo ; 55.10 Kr
        double ckackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Çilek Aldınız ?"));
        double csonuç = cilekkilo * ckackilo;

        double kavunkilo = 90.30;//Kavun   Kilo ; 90.30 Kr
        double kkackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Kavun Aldınız ?"));
        double ksonuç = kavunkilo * kkackilo;

        double uzumkilo = (float) 1.75;//Üzüm   Kilo ; 90.70
        double ukackilo = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Kilo Üzüm Aldınız ?"));
        double usonuç = uzumkilo * ukackilo;

        double limadet = 0.5;//Limon  Adet ; 0.50 Kr
        double lkacadet = Double.valueOf(JOptionPane.showInputDialog(null, "Kaç Adet Limon Aldınız ?"));
        double lsonuç = limadet * lkacadet;




        //Sonuç
        double toplamtutar = dsonuç + ssonuç + hsonuç + esonuç + bsonuç + psonuç + msonuç + csonuç + ksonuç + usonuç + lsonuç;

        JOptionPane.showMessageDialog(null, " Domates ; " + dsonuç + " TL" + "\n Patates ; "
                + psonuç + " TL" + "\n Biber ; " + bsonuç + " TL" + "\n Soğan ; " + ssonuç + " TL"
                + "\n Hvuç ; " + hsonuç + " TL" + "\n Elma ; " + esonuç + " TL" + "\n Muz ; "
                + msonuç + "\n Çilek " + csonuç + "\n Kavun" + ksonuç + "\n Üzüm " + usonuç + "\n   Limon" + lsonuç + " TL" + "\n  Toplam Bakiye ; " + toplamtutar + " TL");

    }


}

