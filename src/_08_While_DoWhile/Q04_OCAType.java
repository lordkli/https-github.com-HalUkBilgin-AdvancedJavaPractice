package _08_While_DoWhile;

public class Q04_OCAType {
    public static void main(String[] args) {

        int num = 10;
        do {
            System.out.print(num-- + " " + num);
        } while (num == 0);
        /*
         * // What is the result?
         * A) 9876543210
         * B) 9
         * C) 421
         * D) 9 10
         * E) Nothing is printed
         * F) 10 9    ***
         */
    }



}
