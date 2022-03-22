package _09_Arrays;

public class Q17 {
  /* TASK :
  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
  Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

   */

    public static void main(String[] args) {
        int[] arrSomun = {1, 3, 6, 5, 2};
        int[] arrCivata = {1, 2, 3, 6, 5};

        arrSomun = dizinYap(arrSomun);
        arrCivata = dizinYap(arrCivata);
        for (int i = 0; i < arrCivata.length; i++) {
            System.out.println("arrCivata : " + arrCivata[i] + " = arrSomun :" + arrSomun[i]);
        }

    }

    public static int[] dizinYap(int[] arrA) {
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA.length; j++) {
                if (arrA[i] < arrA[j]) {
                    int ef = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = ef;
                }
            }
        }
        return arrA;
    }

}
