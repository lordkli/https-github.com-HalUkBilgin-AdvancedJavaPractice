package JavaProjects.P02_javaBankATM.JavaBankATM03;

public class MusteriBilgileri {
    public static String getKartNo() {
        return kartNo;
    }

    public static void setKartNo(String kartNo) {
        MusteriBilgileri.kartNo = kartNo;
    }

    public static String getSifre() {
        return sifre;
    }

    public static void setSifre(String sifre) {
        MusteriBilgileri.sifre = sifre;
    }


    private static String kartNo = "1234";
    private static String sifre = "1234";
    public static double bakiye = 1000;

}
