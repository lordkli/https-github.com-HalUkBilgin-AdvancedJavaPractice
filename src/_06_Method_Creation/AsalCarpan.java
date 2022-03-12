package _06_Method_Creation;

public class AsalCarpan {
	static 	int bolen=0;
	static boolean isAsal=true;
	

	public static void main(String[] args) {
		/*
		 * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
		 * METHOD yazınız
		 * 
		 * Ör: Input : 50 
		 *     Bolenler : 2,5,10,20,50 
		 *     Asal Bolenler: 2,5 
		 *     En buyuk asal carpan: 5
		 */
		
		int input=65;
		asalCarpan(input);

	}
	
	public static void asalCarpan(int input) {
	int asalCarpan=2;
		for (int i = 2; i <= input ; i++) {
			
			if (input%i==0) {
				bolen=i;
				asalKontrol(bolen);
			if (isAsal) {
				asalCarpan=bolen;
			}
			}
		} System.out.println(asalCarpan);
	}
	
	public static boolean asalKontrol(int bolen) {
		
		for (int i = 2; i < bolen; i++) {
			if(bolen%i==0) {
				isAsal=false;
				break;
			}
		}
		
	return isAsal;
		
	}
	

}