package _01_veriables;

public class RegexKarakterler {

	public static void main(String[] args) {
		 
		    
		    //Write code here
		    
		    String b = "Java 1235 ?!@$_";
		    
		    // \\d ifadesi tum rakamlari(digit) temsil eder.
		System.out.println(b.replaceAll("\\d","*"));
		System.out.println(b);
		// ===>  \\D rakamlardisindaki hersey
		System.out.println(b.replaceAll("\\D","*"));
		
		//==> \\S space disindaki hersey
		System.out.println(b.replaceAll("\\S","*"));
		
		//==> \\s space ifadesidir.
		System.out.println(b.replaceAll("\\s","*"));
		// replace ile yapma
		System.out.println(b.replace(" ","*"));
		
		//==>  \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
		System.out.println(b.replaceAll("\\w","*"));
		
		//==>  \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar
		
		System.out.println(b.replaceAll("\\W","*"));
		
		
		
		
		
		
		        
	}

}
