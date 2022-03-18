package _07_ForLoop;

public class Q21 {

    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */

        int i, k;//Değişkenlerimizi tanımladık.
        int sembol = 1;//Yıldızımızın program başlangıçında, kaç tane yıldız yazdıracağını belirtiriz.

        for (k = 0; k < 9; k++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
            for (i = 0; i < sembol; i++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
                System.out.print("* ");//Sembolümüzü belirttik.
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            sembol++;//Yıldızımızın birer birer artmasını sağlarız.
        }
        /*
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *       */


        int s, t;//Değişkenlerimizi tanımladık.
        int sembol2 = 9;//Yıldız sembolümüzün program başlangıçında, 9 tane yıldız yazdıracağını belirtiriz.

        for (t = 0; t < 9; t++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
            for (s = 0; s < sembol2; s++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
                System.out.print("*");//Sembolümüzü belirttik.
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            sembol2--;//Yıldızımızın birer birer azalmasını sağlarız.
        }
        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */


        int l, m, n;//Değişekenlerimizi tanımladık.
        for (l = 10; 0 < l; l--) {//Döngümüzün ne kadar döneceğini belirtir.
            for (m = l; m < 10; m++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (n = 1; n <= l; n++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }

        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */


        int o, p, r;//Değişekenlerimizi tanımladık.
        for (o = 1; o < 10; o++) {//Döngümüzün ne kadar döneceğini belirtir.
            for (p = o; p < 10; p++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (r = 1; r <= o; r++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }


    }
}
