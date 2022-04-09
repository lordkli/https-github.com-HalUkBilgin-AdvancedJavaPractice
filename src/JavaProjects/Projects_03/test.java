package JavaProjects.Projects_03;

import org.junit.Assert;
import org.junit.Test;

public class test {



        @Test
        public void updateRange1(){

            UpdateRange u1 = new UpdateRange();

            int[] arr = {1,12,13,14,25,16,47,28,19,3};
            int min = 10 ;
            int max = 20 ;

            int[] arr2 = u1.uRange(arr ,min ,max);

            int[] expected = {1,-1,-1,-1,25,-1,47,28,-1,3};

            for(int i = 0 ; i <expected.length ; i++){

                if(arr2[i]!=expected[i]){

                    Assert.assertTrue("expected result is " + expected[i] +" but your result is " +arr2[i] , arr2[i] == expected[i] );

                }


            }

        }

        @Test
        public void updateRange2(){

            UpdateRange u1 = new UpdateRange();

            int[] arr = {1,12,53,64,55,76,57,28,19,3};
            int min = 50 ;
            int max = 70 ;

            int[] arr2 = u1.uRange(arr ,min ,max);

            int[] expected = {1,12,-1,-1,-1,76,-1,28,19,3};

            for(int i = 0 ; i <expected.length ; i++){

                if(arr2[i]!=expected[i]){

                    Assert.assertTrue("expected result is " + expected[i] +" but your result is " +arr2[i] , arr2[i] == expected[i] );

                }


            }

        }

        @Test
        public void SubtractionSquare1(){

            SubtractionSquare s1 = new SubtractionSquare();

            int result = s1.substSquare(8,3);


            Assert.assertTrue("result should be 1332 but your result is " + result,result == 1332);

        }

        @Test
        public void SubtractionSquare2(){

            SubtractionSquare s1 = new SubtractionSquare();

            int result = s1.substSquare(10,5);


            Assert.assertTrue("result should be 3250 but your result is " + result,result == 3250);

        }

        @Test
        public void CamelCase1(){

            CamelCase c1 = new CamelCase();

            String result = c1.camelcase();


            Assert.assertTrue("result should be  I Live In Usa but your result is " + result,result .equals("I Live In Usa"));

        }

        @Test
        public void CamelCase2(){

            CamelCase c1 = new CamelCase();

            String result = c1.camelcase();

//Say
            Assert.assertTrue("result should be --> I Live In Usa <--but your result is " + result,result .equals("I Live In Usa"));

        }

        @Test
        public void getPopulation1(){

            getPopulation g1 = new getPopulation();

            String[] country={"Australia" ,"Bahamas" , "Benin" , "Côte d'Ivoire" , "Eritrea" , "New Zealand" , "Panama"};

            int[] countryPopulation={38928346 , 36910560 ,  19237691 , 	11673021 , 586632 , 104425 , 33931 };

            String cName = "Benin";

            int result = g1.populationOfCountry(country,countryPopulation , cName);


            Assert.assertTrue("result should be  19237691 but your result is " + result, result==19237691);

        }

        @Test
        public void getPopulation2(){

            getPopulation g1 = new getPopulation();

            String[] country={"Australia" ,"Bahamas" , "Benin" , "Côte d'Ivoire" , "Eritrea" , "New Zealand" , "Panama"};

            int[] countryPopulation={38928346 , 36910560 ,  19237691 , 	11673021 , 586632 , 104425 , 33931 };

            String cName = "Eritrea";

            int result = g1.populationOfCountry(country,countryPopulation , cName);


            Assert.assertTrue("result should be  586632 but your result is " + result, result==586632);

        }

        @Test
        public void getPopulation3(){

            getPopulation g1 = new getPopulation();

            String[] country={"Australia" ,"Bahamas" , "Benin" , "Côte d'Ivoire" , "Eritrea" , "New Zealand" , "Panama"};

            int[] countryPopulation={38928346 , 36910560 ,  19237691 , 	11673021 , 586632 , 104425 , 33931 };

            String cName = "Germany";

            int result = g1.populationOfCountry(country,countryPopulation , cName);


            Assert.assertTrue("result should be -1 but your result is " + result, result==-1);

        }

        @Test
        public void ThreeEvenOdd1(){

            ThreeEvenOdd t1 = new ThreeEvenOdd();

            int[] arr = {2,3,4,5,12};

            boolean tt= t1.threeEvenOrOdd(arr);

            Assert.assertTrue("Expected result is true but your result is " + tt ,tt);

        }

        public void ThreeEvenOdd2(){

            ThreeEvenOdd t1 = new ThreeEvenOdd();

            int[] arr = {2,3,5,14,13};

            boolean tt= t1.threeEvenOrOdd(arr);

            Assert.assertTrue("Expected result is true but your result is " + tt ,tt);

        }

        public void ThreeEvenOdd3(){

            ThreeEvenOdd t1 = new ThreeEvenOdd();

            int[] arr = {2,3,14,13};

            boolean tt= t1.threeEvenOrOdd(arr);

            Assert.assertFalse("Expected result is false but your result is " + tt ,tt);

        }

    }


