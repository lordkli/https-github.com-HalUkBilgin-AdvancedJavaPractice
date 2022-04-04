import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String allElements = scanner.nextLine();

        String[] elements = allElements.split("");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın

        int i1 = Integer.parseInt(num1.replaceAll("[$A-Za-z]", ""));
        int i2 = Integer.parseInt(num2.replaceAll("[$A-Za-z]", ""));
        int i3 = Integer.parseInt(num3.replaceAll("[$A-Za-z]", ""));
        int total = i1 + i2 + i3;

        if (total >= 0) {
            System.out.println(total);
        } else {
            System.out.println(-1);
        }
    }
}
