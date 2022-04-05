package JavaProjects.Projects_02;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın

        String[][] nums = {

                {"$12", "$22", "5"},
                {"€9", "€40", "$1", "$2"},
                {"€12"}
        };

        int total = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j].contains("$")) {

                    String strNum = nums[i][j];

                    strNum = strNum.replace("$", "");

                    int intNum = Integer.parseInt(strNum);

                    double doubleNum = intNum * 3.2;

                    total += doubleNum;

                } else if (nums[i][j].contains("€")) {
                    String strNum = nums[i][j];

                    strNum = strNum.replace("€", "");

                    int intNum = Integer.parseInt(strNum);

                    double doubleNum = intNum * 4.2;

                    total += doubleNum;

                }

            }
        }
        System.out.println(total);
    }
}



