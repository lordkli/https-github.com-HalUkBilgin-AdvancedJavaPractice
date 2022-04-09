package tasks;

public class T07_RomaRakamlari {
    /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805


		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/
    public static void main(String[] args) {


     System.out.println(convertRomans("MCMXLV"));
}

    static int convertRomans(String s) {
        int sum = 0;
        // In the first loop we are checking and adding the values of ascending numbers (the ones in the brackets in the example),
        // after using those, we remove them from String because they are useless.

        for (int i = 0; i < s.length() - 1; i++) {
            if (valueOf(s.charAt(i)) < valueOf(s.charAt(i + 1))) {
                sum += valueOf(s.charAt(i + 1)) - valueOf(s.charAt(i));
                s = s.replace(s.substring(i, i + 2), "");
                i--; // when we remove two characters from String, we adjust the index not to miss any any char.
            }
        }
		/* After removing the annoying characters(ascending numerals), we have the regular characters which are in descending order.
		   With the for loop we add the values to our 'sum' container. */
        for (int i = 0; i < s.length(); i++) {
            sum += valueOf(s.charAt(i));
        }
        return sum;
    }

    // assign the values for each character of Roman numerals
    static int valueOf(char a) {
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        return 0;
    }
}
