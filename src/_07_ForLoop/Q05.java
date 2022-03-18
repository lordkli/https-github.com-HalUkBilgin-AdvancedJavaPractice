package _07_ForLoop;

public class Q05 {

    public static void main(String[] args) {
        /* TASK :
Aşağıdaki şekilde çıktı veren programı print içerisinde
sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####

         */

        for(int satir=0;satir<5;satir++) // satır kontrolu 1 ile 6 da olurdu
        {
            for(int sutun=0;sutun<5;sutun++)// sutun kontrolu for body tek satır oldg için {} kullanmadık
                System.out.print("#");

            System.out.println();
        }
    }
}
