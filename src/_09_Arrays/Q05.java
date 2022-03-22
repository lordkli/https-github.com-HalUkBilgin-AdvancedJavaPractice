package _09_Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        double toplam = 0;

        //for cozum...
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }

        //for each cozum...
        //for (int each : arr ) {
        //	toplam += each;
        //}
        double ort = toplam / arr.length;
        System.out.println("verilen array in ortalamasi =" + ort); //4.0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ort)
                System.out.println("ortalamadan buyuk olanlar :" + arr[i]);
        }
        //for (int each : arr ) {
        //	if (each > ort)
        //System.out.println("ortalamadan buyuk olanlar :" + each);

        //}
    }

}


