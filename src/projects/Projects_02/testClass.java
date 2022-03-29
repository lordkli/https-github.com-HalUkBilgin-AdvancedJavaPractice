package projects.Projects_02;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testClass {

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
    public void Common2Arrays1() {
        final String testString = "1 2 3 4 5";
        provideInput(testString);

        Common2Arrays.main(new String[0]);

        String result = "false";
        Assert.assertTrue("out put should be true but your out put is" + getOutput() , getOutput().contains(result));
    }

    @Test
    public void Common2Arrays2() {
        final String testString = "1 2 3 4 3";
        provideInput(testString);

        Common2Arrays.main(new String[0]);

        String result = "true";
        Assert.assertTrue("out put should be true but your out put is" + getOutput() , getOutput().contains(result));
    }

    @Test
    public void diffBetweenMaxMin1() {
        final String testString = "1 2 15 4 10";
        provideInput(testString);

        diffBetweenMaxMin.main(new String[0]);

        Assert.assertTrue("Expected result is 14 but your output is "  +   getOutput() , getOutput().contains("14"));

    }

    @Test
    public void diffBetweenMaxMin2() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);

        diffBetweenMaxMin.main(new String[0]);

        Assert.assertTrue("Expected result is 50 but your output is "  +   getOutput() , getOutput().contains("50"));

    }

    @Test
    public void maxNumber1() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);

        maxNumber.main(new String[0]);

        Assert.assertTrue("Expected result is 10 but your output is "  +   getOutput() , getOutput().contains("10"));

    }

    @Test
    public void minNumber1() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);

        minNumber.main(new String[0]);

        Assert.assertTrue("Expected result is 1 but your output is "  +   getOutput() , getOutput().contains("1"));

    }


    @Test
    public void removeDuplicates1() {
        final String testString = "1 2 2 2 3 3 3 4 4 4 5 5 5";
        provideInput(testString);

        removeDuplicates.main(new String[0]);

        String studentResult = getOutput();

        studentResult = studentResult.replace("[" , "");

        studentResult = studentResult.replace("]" , "");

        studentResult = studentResult.replace("," , "");

        String[] resultArr = studentResult.split(" ");

        List<String> r1 = new ArrayList<>();

        r1 = Arrays.asList(resultArr);

        String[] expected = new String[]{"1","2","3","4","5"};
        for(int i = 0 ; i < expected.length ; i++){

            Assert.assertTrue("Expected result is " + Arrays.toString(expected) + " your result is " + r1 , r1.get(i).contains(expected[i]) );
        }

    }


    @Test
    public void removeDuplicates2() {
        final String testString = "1 2 2 2 3 3 3 4 4 4 5 5 5 6 6 7 8 9 10";
        provideInput(testString);

        removeDuplicates.main(new String[0]);

        String studentResult = getOutput();

        studentResult = studentResult.replace("[", "");

        studentResult = studentResult.replace("]", "");

        studentResult = studentResult.replace(",", "");

        String[] resultArr = studentResult.split(" ");

        List<String> r1 = new ArrayList<>();

        r1 = Arrays.asList(resultArr);

        String[] expected = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < expected.length; i++) {

            Assert.assertTrue("Expected result is " + Arrays.toString(expected) + " your result is " + r1, r1.get(i).contains(expected[i]));
        }
    }

    @Test
    public void reverseArr1() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);

        reverseArr.main(new String[0]);

        String[] expected = new String[]{"2","10","50","23","12","0"};

        String studentResult = getOutput();

        studentResult = studentResult.replace("[", "");

        studentResult = studentResult.replace("]", "");

        studentResult = studentResult.replace(",", "");

        String[] resultArr = studentResult.split(" ");

        List<String> r1 = new ArrayList<>();

        r1 = Arrays.asList(resultArr);


        for (int i = 0; i < expected.length; i++) {

            Assert.assertTrue("Expected result is " + expected[i] + " your result is " + r1.get(i), r1.get(i).contains(expected[i]));
        }

    }

    @Test
    public void reverseArr2() {
        final String testString = "20 15 30 42 80 32 123";
        provideInput(testString);

        reverseArr.main(new String[0]);

        String[] expected = new String[]{"123","32","80","42","30","15","20"};

        String studentResult = getOutput();

        studentResult = studentResult.replace("[", "");

        studentResult = studentResult.replace("]", "");

        studentResult = studentResult.replace(",", "");

        String[] resultArr = studentResult.split(" ");

        List<String> r1 = new ArrayList<>();

        r1 = Arrays.asList(resultArr);


        for (int i = 0; i < expected.length; i++) {

            Assert.assertTrue("Expected result is " + expected[i] + " your result is " + r1.get(i), r1.get(i).contains(expected[i]));
        }

    }

    @Test
    public void sameFirstAndLast1() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);

        sameFirstAndLast.main(new String[0]);

        Assert.assertTrue("Expected result is false but your output is "  +   getOutput() , getOutput().contains("false"));

    }
    @Test
    public void sameFirstAndLast2() {
        final String testString = "0 12 23 50 10 2 0";
        provideInput(testString);

        sameFirstAndLast.main(new String[0]);

        Assert.assertTrue("Expected result is true but your output is "  +   getOutput() , getOutput().contains("true"));

    }


    @Test
    public void sumTotal1() {
        final String testString = "0 12 23 50 10 2 0";
        provideInput(testString);

        sumTotal.main(new String[0]);

        Assert.assertTrue("Expected result is 372 but your output is "  +   getOutput() , getOutput().contains("372"));

    }

    @Test
    public void arrayContains1() {
        final String testString = "1 2 3 4 5";
        provideInput(testString);

        arrayContains.main(new String[0]);

        Assert.assertTrue("Expected result is false but your output is "  +   getOutput() , getOutput().contains("false"));

    }

    @Test
    public void arrayContains2() {
        final String testString = "1 2 3 1 2";
        provideInput(testString);

        arrayContains.main(new String[0]);

        Assert.assertTrue("Expected result is true but your output is "  +   getOutput() , getOutput().contains("true"));

    }

    @Test
    public void arrayContains3() {
        final String testString = "1 2 3 2 3";
        provideInput(testString);

        arrayContains.main(new String[0]);

        Assert.assertTrue("Expected result is true but your output is "  +   getOutput() , getOutput().contains("true"));

    }

    @Test
    public void arrayContains4() {
        final String testString = "10 20 3 1 2";
        provideInput(testString);

        arrayContains.main(new String[0]);

        Assert.assertTrue("Expected result is false but your output is "  +   getOutput() , getOutput().contains("false"));

    }

    @Test
    public void changeArray1() {
        final String testString = "Peach Berry Orange WaterMelon Orange";
        provideInput(testString);

        changeArray.main(new String[0]);

        String[] expected = new String[]{"Peach","Berry","Apple","WaterMelon","Apple"};

        String studentResult = getOutput();

        studentResult = studentResult.replace("[", "");

        studentResult = studentResult.replace("]", "");

        studentResult = studentResult.replace(",", "");

        String[] resultArr = studentResult.split(" ");

        List<String> r1 = new ArrayList<>();

        r1 = Arrays.asList(resultArr);

        for (int i = 0; i < expected.length; i++) {

            Assert.assertTrue("Expected result is " + expected[i] + " your result is " + r1.get(i), r1.get(i).contains(expected[i]));
        }
    }

    @Test
    public void changeArray2() {
        final String testString = "Peach Orange Berry WaterMelon Orange Kiwi Kiwi Orange";
        provideInput(testString);

        changeArray.main(new String[0]);

        String[] expected = new String[]{"Peach","Apple","Berry","WaterMelon","Apple","Kiwi","Kiwi","Apple"};

        String studentResult = getOutput();

        studentResult = studentResult.replace("[", "");

        studentResult = studentResult.replace("]", "");

        studentResult = studentResult.replace(",", "");

        String[] resultArr = studentResult.split(" ");

        List<String> r1 = new ArrayList<>();

        r1 = Arrays.asList(resultArr);

        for (int i = 0; i < expected.length; i++) {

            Assert.assertTrue("Expected result is " + expected[i] + " your result is " + r1.get(i), r1.get(i).contains(expected[i]));
        }


    }


}