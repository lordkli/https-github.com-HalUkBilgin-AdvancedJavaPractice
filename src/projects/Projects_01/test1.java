 package projects.Projects_01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

 public class test1 {

     private final InputStream systemIn = System.in;
     private final PrintStream systemOut = System.out;

     private ByteArrayInputStream testIn;
     private ByteArrayOutputStream testOut;

     @Before
     public void setUpOutput() {
         testOut = new ByteArrayOutputStream();
         System.setOut(new PrintStream(testOut));
     }

     private void provideInput(String data) {
         testIn = new ByteArrayInputStream(data.getBytes());
         System.setIn(testIn);
     }

     private String getOutput() {
         return testOut.toString();
     }

     @After
     public void restoreSystemInputOutput() {
         System.setIn(systemIn);
         System.setOut(systemOut);
     }

     @Test
     public void checkNumberEven1() {
         final String testString = "2";
         provideInput(testString);

         checkNumberEven.main(new String[0]);

         String result = "true";
         Assert.assertTrue("output true olmalı ama sizin output " + getOutput() , getOutput().contains(result));
     }

     @Test
     public void checkNumberEven2() {
         final String testString = "5";
         provideInput(testString);

         checkNumberEven.main(new String[0]);

         String result = "false";
         Assert.assertTrue("output false olmalı ama sizin output  " + getOutput() ,  getOutput().contains(result));
     }

     @Test
     public void totalLetterCountCheck1() {
         final String testString = "Editor";
         provideInput(testString);

         totalLetterCountCheck.main(new String[0]);

         String result = "false";
         Assert.assertTrue("output  false olmali ama sizin output " + getOutput(), getOutput().contains(result));
     }

     @Test
     public void totalLetterCountCheck2() {
         final String testString = "consist";
         provideInput(testString);

         totalLetterCountCheck.main(new String[0]);

         String result = "true";
         Assert.assertTrue("output  true olmali ama sizin output " + getOutput(),getOutput().contains(result));
     }

     @Test
     public void days1() {
         final String testString = "5";
         provideInput(testString);

         days.main(new String[0]);

         Assert.assertTrue("output friday olmalı ama siziin output" + getOutput(), getOutput().toLowerCase().contains("friday"));
     }

     @Test
     public void days2() {
         final String testString = "2";
         provideInput(testString);

         days.main(new String[0]);

         Assert.assertTrue("output tuesday olmalı ama siziin output" + getOutput(), getOutput().toLowerCase().contains("tuesday"));
     }

     @Test
     public void days3() {
         final String testString = "7";
         provideInput(testString);

         days.main(new String[0]);

         Assert.assertTrue("output sunday olmalı ama sizin output" + getOutput(), getOutput().toLowerCase().contains("sunday"));
     }


     @Test
     public void days4() {
         final String testString = "10";
         provideInput(testString);

         days.main(new String[0]);

         Assert.assertTrue("output  this is not a valid day olmalı ama sizin output " + getOutput(), getOutput().toLowerCase().contains("this is not a valid day"));
     }

     @Test
     public void age1() {
         final String testString = "16";
         provideInput(testString);

         age.main(new String[0]);

         Assert.assertTrue("output  ehliyet almak icin cok gencsin olmalı ama sizin output :: " + getOutput(), getOutput().toLowerCase().contains("ehliyet almak icin cok gencsin"));
     }

     @Test
     public void age2() {
         final String testString = "21";
         provideInput(testString);

         age.main(new String[0]);

         Assert.assertTrue("output istedigini yapabilirsin olmalı ama sizin output :: " + getOutput() , getOutput().toLowerCase().contains("istedigini yapabilirsin"));
     }

     @Test
     public void age3() {
         final String testString = "10";
         provideInput(testString);

         age.main(new String[0]);

         Assert.assertTrue("output  facebook hesabi acmak icin cok gencsin olmalı ama sizin output :: " + getOutput() , getOutput().toLowerCase().contains("facebook hesabi acmak icin cok gencsin"));
     }


     @Test
     public void perfectSquare1() {
         final String testString = "100";
         provideInput(testString);

         perfectSquare.main(new String[0]);

         Assert.assertTrue("output true olmalı ama sizin output :: " + getOutput() , getOutput().contains("true"));
     }

     @Test
     public void perfectSquare2() {
         final String testString = "55";
         provideInput(testString);

         perfectSquare.main(new String[0]);

         Assert.assertTrue("output false olmalı ama sizin output :: " + getOutput() , getOutput().toLowerCase().contains("false"));
     }

     @Test
     public void printEvenNumbers1() {
         final String testString = "15";
         provideInput(testString);

         printEvenNumbers.main(new String[0]);

         int i1 = Integer.parseInt(testString);
         for(int i = 0; i <= i1 ; i++  ){
             if(i%2==0) {
                 String num = String.valueOf(i);

                 Assert.assertTrue("output  false olmali ama sizin output :: " + getOutput(), getOutput().contains(num));
             }
         }

     }

     @Test
     public void printEvenNumbers2() {
         final String testString = "6";
         provideInput(testString);

         printEvenNumbers.main(new String[0]);

         int i1 = Integer.parseInt(testString);
         for(int i = 0; i < i1 ; i++  ){
             if(i%2==0) {
                 String num = String.valueOf(i);

                 Assert.assertTrue("output true olmali ama sizin output :: " + getOutput(), getOutput().contains(num));
             }
         }

     }

     @Test
     public void RandomNum() {
         final String testString = "10";
         provideInput(testString);

         RandomNum.main(new String[0]);

         int i1 = Integer.parseInt(testString);



         String s1 =getOutput().replaceAll("[^\\d.]", "");


         int num = Integer.parseInt(s1.trim());

         Assert.assertTrue("output  0 ile 10 arasinda olmali ama sizin output :: " + getOutput(), 0<=num && num <=10);



     }

     @Test
     public void RandomNum2() {
         final String testString = "20";
         provideInput(testString);

         RandomNum.main(new String[0]);

         String s1 =getOutput().replaceAll("[^\\d.]", "");

         int num = Integer.parseInt(s1.trim());

         Assert.assertTrue("output  0 ile 20 arasinda olmali ama sizin output :: " + getOutput(), 0<=num && num <=20);

     }

     @Test
     public void RandomNumberBetweenTwoNumbers1() {
         final String testString = "70 100";
         provideInput(testString);
         RandomNumberBetweenTwoNumbers.main(new String[0]);

         String s1 =getOutput().replaceAll("[^\\d.]", "");

         int num = Integer.parseInt(s1.trim());

         Assert.assertTrue("output  70 ile 100 arasinda olmali ama sizin output :: " + getOutput(), 70<=num && num <=100);

     }

     @Test
     public void RandomNumberBetweenTwoNumbers2() {
         final String testString = "40 70";
         provideInput(testString);
         RandomNumberBetweenTwoNumbers.main(new String[0]);

         String s1 =getOutput().replaceAll("[^\\d.]", "");

         int num = Integer.parseInt(s1.trim());

         Assert.assertTrue("output  40 ile 70 arasinda olmali ama sizin output :: " + getOutput(), 40<=num && num <=70);

     }

     @Test
     public void getTotal1() {
         final String testString = "$10 $13 $12";
         provideInput(testString);
         getTotal.main(new String[0]);

         String s1 =getOutput().replaceAll("[^\\d.]", "");

         int num = Integer.parseInt(s1.trim());

         Assert.assertTrue("out put should be between 40 to 70 but  your out put is :: " + getOutput(), num==35);

     }

     @Test
     public void getTotal2() {
         final String testString = "$-20 $0 $0";
         provideInput(testString);
         getTotal.main(new String[0]);

         String s1 =getOutput();

         Assert.assertTrue("output  -1 olmali but  your out put is :: " + getOutput(), s1.contains("-1"));

     }


     @Test
     public void getTotal3() {
         final String testString = "$0 $0 $0";
         provideInput(testString);
         getTotal.main(new String[0]);

         String s1 =getOutput().replaceAll("[^\\d.]", "");

         int num = Integer.parseInt(s1.trim());

         Assert.assertTrue("out put should be between 40 to 70 but  your out put is :: " + getOutput(), num==0);

     }

     @Test
     public void factorialNumber1() {
         final String testString = "7";
         provideInput(testString);
         factorialNumber.main(new String[0]);

         String myOutput = getOutput().trim();

         int intOutput = Integer.parseInt(myOutput);

         Assert.assertTrue("output 5040 olmalı ama sizin output :: " + getOutput(), intOutput==5040);

     }


     @Test
     public void factorialNumber2() {
         final String testString = "9";
         provideInput(testString);
         factorialNumber.main(new String[0]);

         String myOutput = getOutput().trim();

         int intOutput = Integer.parseInt(myOutput);

         Assert.assertTrue("output  362880 olmalı ama sizin output :: " + getOutput(), intOutput==362880);

     }


     @Test
     public void twoString1() {
         final String testString = "cat tac";
         provideInput(testString);
         twoString.main(new String[0]);

         String s1 =getOutput();

         Assert.assertTrue("output  -1 olmali ama sizin output :: " + getOutput(), s1.contains("catac"));

     }

     @Test
     public void twoString2() {
         final String testString = "cat dog";
         provideInput(testString);
         twoString.main(new String[0]);

         String s1 =getOutput();

         Assert.assertTrue("output  -1 olmali ama sizin output :: " + getOutput(), s1.contains("catdog"));

     }

     @Test
     public void countE1() {
         final String testString = "one barber to other barber";
         provideInput(testString);
         countE.main(new String[0]);

         String s1 =getOutput();

         Assert.assertTrue("out put should be 4 but  your out put is :: " + getOutput(), s1.contains("4"));

     }

     @Test
     public void countE2() {
         final String testString = "asdasdsa";
         provideInput(testString);
         countE.main(new String[0]);

         String s1 =getOutput();

         Assert.assertTrue("out put should be 0 but  your out put is :: " + getOutput(), s1.contains("0"));

     }


 }