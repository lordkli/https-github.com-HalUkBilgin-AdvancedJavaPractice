package _12_Varargs;

public class Trick {
	public static void main(String[] args) {

		int[] arr = {17, 23,6,34 };
		System.out.println("array toplami : "+arrTopla(arr));
		System.out.println("varargs toplami :"+varargsTopla(23,6,34,17,35));
		System.out.println("varargs ın array parametreli toplami :"+varargsTopla(arr));
			//varargs array gibi davrandigi icin  herhangi bir arryi parametre olarak alabilir.
	}

//Array elemalanri toplayan method
	private static int arrTopla(int[] arr) {
		int topla = 0;
		for (int a : arr) {

			topla += a;
		}
		return topla;
	}

	// varargs elemanleri toplayan method
	private static int varargsTopla(int... i) {
		int toplam = 0;
		for (int a : i) {
			toplam += a;

		}
		return toplam;
	}
}
