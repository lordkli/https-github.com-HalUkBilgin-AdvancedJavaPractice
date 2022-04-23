package _15_Exceptions.Q04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        ArrayList<User> kullanıcılar=new ArrayList<>();
        int kullanici = 0;
        Scanner oku = new Scanner(System.in);

        String username = "";
        String password = "";

      // do {

      //     System.out.print((kullanici + 1) + ".User Name= ");
      //     username = oku.nextLine();

      //     System.out.print("Password= ");
      //     password = oku.nextLine();
      //     try {
      //         User yeniUser = new User(username, password);
      //         kullanici++;

      //     } catch (Exception ex) {
      //         System.out.println(ex.getMessage());
      //     }
      // } while (kullanici <2);


         boolean usernameIste = true;
            do {
            if (usernameIste) {
                System.out.print((kullanici + 1) + ".User Name=");
                username = oku.nextLine();
            }
            System.out.print("Password=");
            password = oku.nextLine();
            try {
                User yeniUser = new User(username, password);
                kullanıcılar.add(yeniUser);
                kullanici++;
                usernameIste = true;//hata olmadığında bir sonraki kullanıcı için username istenecek.
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                usernameIste = false;//hata olduğu durumda tekrar username isteme
            }
        } while (kullanici < 6);
        System.out.println(kullanıcılar);

    }


}
