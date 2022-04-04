import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MachineOfCoffe {
    String Coffe;

    public MachineOfCoffe(String string) {
        this.Coffe = string;
    }

    private static ArrayList<String> coffe(String... strings) {
        ArrayList<String> coffe = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            coffe.add(i, strings[i]);
        }
        return coffe;
    }

    private static boolean secim(String choice) {
        while (true) {
            if (choice.equals("evet")) {
                return true;
            } else if (choice.equals("hayir")) {
                return false;
            } else {
                System.out.println("gecersiz secim");
            }
        }
    }

    private static void sizeChoice(int size) throws InterruptedException {
        if (size == 3) {
            Thread.sleep(1500);
            System.out.println("buyuk boy kahveniz hazirlaniyor");
        } else if (size == 2) {
            Thread.sleep(1500);
            System.out.println("ortaboy kahveniz hazirlaniyor");
        } else if (size == 1) {
            Thread.sleep(1500);
            System.out.println("kucukboy kahveniz hazirlaniyor");
        }
        Thread.sleep(3000);
        System.out.println(" lutfen bekleyiniz");
        Thread.sleep(2000, 4000);

    }

    private static String sugarMilk(boolean secim) {

        if (secim == true) {
            return "sekerli";
        } else {
            return "sekersiz";
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        MachineOfCoffe cf1 = new MachineOfCoffe("Maccihiato");
        MachineOfCoffe cf2 = new MachineOfCoffe("FiltreCoffe");
        MachineOfCoffe cf3 = new MachineOfCoffe("Espresso");
        MachineOfCoffe cf4 = new MachineOfCoffe("Turk kahvesi");
        MachineOfCoffe cf5 = new MachineOfCoffe("Americano");
        //System.out.println(coffe(cf1.Coffe,cf2.Coffe,cf3.Coffe,cf4.Coffe,cf5.Coffe));
        //System.out.println(coffe(cf1.Coffe,cf2.Coffe,cf3.Coffe,cf4.Coffe,cf5.Coffe).get(1));
        //String choie=scan.next().toLowerCase();
        while (true) {
            System.out.println("kahve istiyor musunuz? \n\n\t(Evet ise Evet'i, Hayir Hayir'i) ");
            String secim = scan.next().toLowerCase();
            System.out.println(secim);
            if (secim(secim)) {
                System.out.println("kahvenizi seciniz");
                System.out.println("kahvelerimiz: \n0:" + cf1.Coffe + "\n1:" + cf2.Coffe + "\n2:" + cf3.Coffe + "\n3:" + cf4.Coffe + "\n4:" + cf5.Coffe);
                int choice = scan.nextInt();
                System.out.println("secminiz " + coffe(cf1.Coffe, cf2.Coffe, cf3.Coffe, cf4.Coffe, cf5.Coffe).get(choice) + " ()hazırlaniyor");
                System.out.println("............................ ");
                Thread.sleep(1000);
                System.out.println("sut istiyor musunuz?(evet ya da hayir");
                String sut = scan.next().toLowerCase();
                if (secim(sut)) {
                    System.out.println("lutfen bekleyiniz...");
                    Thread.sleep(1000, 2000);
                    System.out.println("sutunuz ekleniyor");
                    Thread.sleep(1000);
                }
                System.out.println("seker istiyor musunuz? (evet ya da hayir");
                String sugar = scan.next().toLowerCase();
                if (secim(sugar)) {
                    System.out.println("lutfen bekleyiniz");
                    Thread.sleep(2000);
                    System.out.println("sekeriniz ekleniyor");
                    Thread.sleep(1500);
                    System.out.println("sekeriniz eklendi");
                }

                System.out.println("kahve boyutunuzu seciniz");
                System.out.println("Buyuk, Kucuk veya Orta" + ("\nBuyuk 3 \nOrta 2 \nKucuk 1"));
                int size = scan.nextInt();
                sizeChoice(size);
                System.out.println(sugarMilk(secim(sugar)) + " " + coffe(cf1.Coffe, cf2.Coffe, cf3.Coffe, cf4.Coffe, cf5.Coffe).get(choice) + " " + "kahveniz hazir afiyet olsun");
                Thread.sleep(3000);
                break;

            } else {
                System.out.println("bizi tercih ettiginiz icin tesekkurler");
                break;
            }
        }
    }
}