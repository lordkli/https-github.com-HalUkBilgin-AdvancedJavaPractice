package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> tekrarsizList = new ArrayList<>();
        for (Integer s:arr) {
            if (!tekrarsizList.contains(s)) {//eleman yoksa add ile tekrarsız liste ekle eleman varsa  geç
                tekrarsizList.add(s);
            }
        }
        Collections.sort(tekrarsizList);//list elemanlrını NO sıraladık
        int tekrarsizArray[]=new int[tekrarsizList.size()];//tekrarsizList.size() kadar lenght olan bos array atandı
        for (int i = 0; i <tekrarsizList.size(); i++) {
            tekrarsizArray[i]=tekrarsizList.get(i);

        }
        System.out.println(" ahanda sana her elemandan bir tane olan array ..."+Arrays.toString(tekrarsizArray));

    }

}
