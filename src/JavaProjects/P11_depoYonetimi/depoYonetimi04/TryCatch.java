package JavaProjects.P11_depoYonetimi.depoYonetimi04;
import static JavaProjects.P11_depoYonetimi.depoYonetimi04.Islemler.scan;
public class TryCatch {
    public static int intGirisi() {
        int giris = 0;
        boolean flag = true;
        boolean flag2 = false;
        do {
            giris = 0;
            try {
                if (flag2 == true) { scan.nextLine(); }

                flag2 = true;
                giris = scan.nextInt();
                scan.nextLine();
                flag = false;
                flag2 = false;
            } catch (Exception e) {
                System.out.println("lütfen geçerli bir giris yapınız");
            }
        } while (flag);

        return giris;
    }
    public static String stringGirisi() {
        String giris = "";
        boolean flag = true;
        do {
            giris = "";
            try {
                giris = scan.next();
                scan.nextLine();
                flag = false;
            } catch (Exception e) {
                System.out.println("lütfen geçerli bir giris yapınız");
            }
        } while (flag);
        return giris;
    }

}
