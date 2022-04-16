package _15_Exceptions;

public class Exceptions {
/*
EXCEPTİONS
İki tür exceptions vardır.
1-	Compile Time (checked) Exceptions :
Kod yazıldığında Java nın öngördüğü olası sorunlardır. Olası bir problemde altını kırmızı çizer,
fakat her kırmızı çizgi exceptions değildir.
 "Compile Time Exception" larda ya "throws" veya "try-catch" kullanimali handle edilmeli yoksa  code calismaz.

2-Run Time (unchecked) Exceptions :
Kod çalıştırıldığında ortaya çıkan exceptions’lardır."Run Time Exception" larda "throws", "try-catch",
veya hicbiri kullanilmayabilir handle edilmeyebilir..



3) Code creat edilirken Exception kullanmak zorunda kalinirsa :
			 		a) Add throws declaration ==> Problem olustugunda console'a teknik mesajlar iceren  hata mesaji verir.

			 		b) try-catch block ==> Problem olustugunda hatanin yazilmasina veya hata  handle imlkani verir.

4) try block'dan sonra catch block en az bir tane olmalidir ,aksi takdirde  CTE verir.

5) try-catch bolgunda  try body  kod hatasiz calisirsa catch body calismaz. catch body try body deki exception da calisir..

6) try body 'dan sonra 1 veya daha fazla catch body creat edilebilir. Olusan Exception  hangi catch body  ile ilgili ise
    o catch body calisir.  Ayni anda sadece bir catch body calisabilir.

7) Tek try body  Aralarinda parent-child iliskisi olan ve  (mulitply catch)birden fazla catch body kullanirsa
Once child catch body  yazilmali. Aksi takdirde( once parent body  yazilirsa) child'a is kalmaz yazilmalidir,

   kod icin  Java erisilemez catch-blogu--> Compile Time Error verir.
   catch body'lerde Parent Child iliskisi yoksa siralama onemli degildir.

  			1) ArithmeticException class'i Java'da matematiksel islemler yapilirken olusabilecek hatalarda kullanilir.
		 		Mesela; 12'yi 0'a bolersek Java Exception throw eder. Bu Exception ArithmeticException kullanilarak halledilebilir.
		 		Run Time Exception'dir.



		 			Note: "Compile Time Exception" larda ya "throws" veya "try-catch" kullanilmali aksi takdirde
		 	    code calismaz. Ama "Run Time Exception" larda isterseniz "throws", isterseniz "try-catch", isterseniz
		 	    hicbir sey kullanmayabilirsiniz. "Compile Time Exception" lar "handle" edilmelidirler ama
		 	    "Run Time Exception" lar handle edilmeyebilir zorunlu degil.


		 	  		2) NullPointerException class'i ornegin null atamasi yapilan bir String'de length() methodu kullanildiginda
		 	  	olusur. Run Time Exception'dir.

		 	  		3) ArrayIndexOutOfBoundsException class'i array'lerde olmayan bir index ile islem yapmaya calisirsak devreye girer.
		 	  		Run Time Exception'dir.

		 	  		4) NumberFormatException class'i sayi formatinda olmayan bir String'i parseInt() methodu kullanarak integer'a cevirmek
		 	  	istediginizde devreye girer.Run Time Exception'dir.

		 	  		5) ClassCastException class'i birbirine donusturulemeyen data type'lar birbirine donusturulmek istenirse devreye girer.
		 	  		Ornegin; Object data type'i String data type'ina donusturulemez. Java'ya illa donustur diye israr edersek ClassCastException aliriz
		 	  		Run Time Exception'dir.

		 	  		6)IllegalArgumentException class'i kullanilmasini istemedigimiz degerlerde programimizin hata vermesini istiyorsak
		 	  	devreye girer. Mesela; yas icin negatif sayilarin kullanilmasi dogru degildir. Kullanici yas icin negatf sayi kullandiginda
		 	  	program hata vermeilidir. Bunu throw new IllegalArgumentException code'unu yazarak temin edebiiriz.
		 	  	Run Time Excaption'dir.

		 	 		Soru : "throw" ile "throws" arasindaki farklar nelerdir?
		 	 			a) throws main method parantezinin kapanis parantezi ile method body'nin acilis parantezi arasinda kullanilir.
		 	 				"throw" method body'nin icinde kullanilir.
		 	 			b) "throws" keywordunden sonra birden fazla Exception yazilabilir. Fakat "throw" keywordunden sonra
		 	 				sadece bir tane Exception yazilabilir.
		 	 			c) "throws" keywordunden sonra sadece Exception class'inin ismini yazariz fakat "throw" keywordunden sonra
		 	 				Exception class'indan object olustururuz.
		 	 			d) "throws" keywordu methodun ilk satirinda sadece bir kere kullanilabilir ama "throw" keywordu method body'si
		 	 				icinde nerede Exception atmak istersek orada istedigimiz kadar kullanabiliriz.

		 	 		Note: catch block'lardan sonra finally block kullanilabilir, finally block'in ozelligi Exception olussada olusmasada
		 	 				  calismasidir.
		 	 				  finally block cloud'da yapilan islemlerden sonra cloud ile connection'i kesmek icin kullanilir. Cloud ile
		 	 				  connection yazdigimiz kod basarili bir sekilde calisirsa isimiz bittigi icin kesilmelidir. Yazdigimiz code
		 	 				  Exception atarsa cloud ile connection yine kesilmeli ve code tamir edilmelidir. Cloud ile connection
		 	 				  kesilmez ise fatura pahali olabilir.

	 	1) Garbage Collector surekli memory'i kontrol eder. Silinmesi gereken herhangi bir data varsa
	 		memory'i temiz tutmak icin o data'yi siler. Ama data'yi silmeden once "finalize" eder.
	 		Finalize etmek icin finalize() methodunu kullanir. Bu method'un ne zaman calisacagina Java
	 		karar verir. Siz code yazarken isterseniz finalize() methodunu cagirabilirsiniz ama siz cagirsaniz da
	 		ne zaman calisacagina Java karar verir.

	 		 AHAN DA 	Interview sorusu : "final", "finally", "finalize" nedir?
	 		 final(keyword): ==> final method override edilemez.
	 		 				  final variable degeri degistirilemez.
	 		 				  final class child class sahibi olamaz.
	 		 finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

	 		 finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.

	 		 */
}
